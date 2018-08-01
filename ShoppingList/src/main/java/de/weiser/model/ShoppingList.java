package de.weiser.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ShoppingList {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "shoppingListId")
  private Integer id;

  private String name;

  private String description;

  @OneToMany(mappedBy = "shoppingList", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private List<ShoppingListItem> items;

  @ManyToOne
  @JoinColumn(name = "storeId")
  private Store store;

  public ShoppingList() {
  }

  public ShoppingList(String name, String description) {
    super();
    this.name = name;
    this.description = description;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void addListItem(ShoppingListItem item) {
    this.items.add(item);
  }

  public List<ShoppingListItem> getItems() {
    return items;
  }

  public void setItems(List<ShoppingListItem> items) {
    this.items = items;
  }

  public Store getStore() {
    return store;
  }

  public void setStore(Store store) {
    this.store = store;
  }

}
