package de.weiser.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ShoppingListItem {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "shoppingListId", nullable = false)
  private ShoppingList shoppingList;

  private String amount;

  @OneToOne
  private Ingrediant ingrediant;

  private Boolean bought;

  public ShoppingListItem() {
  }

  public ShoppingListItem(String amount, Ingrediant ingrediant) {
    super();
    this.amount = amount;
    this.ingrediant = ingrediant;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Ingrediant getIngrediant() {
    return ingrediant;
  }

  public void setIngrediant(Ingrediant ingrediant) {
    this.ingrediant = ingrediant;
  }

  public ShoppingList getShoppingList() {
    return shoppingList;
  }

  public void setShoppingList(ShoppingList shoppingList) {
    this.shoppingList = shoppingList;
  }

  public Boolean getBought() {
    return bought;
  }

  public void setBought(Boolean bought) {
    this.bought = bought;
  }

}
