package de.weiser.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.weiser.model.ShoppingList;
import de.weiser.model.ShoppingListItem;
import de.weiser.repository.ShoppingListRepository;
import de.weiser.repository.ShoppinglistItemRepository;

@Service
public class ShoppingListService {

  @Autowired
  private ShoppingListRepository repository;

  @Autowired
  private ShoppinglistItemRepository itemRepository;

  public List<ShoppingList> getAllShoppingLists() {
    List<ShoppingList> shoppingLists = new ArrayList<>();
    repository.findAll()
              .forEach(shoppingLists::add);
    return shoppingLists;
  }

  public ShoppingList getShoppingList(int id) {
    return repository.findById(id)
                     .get();
  }

  public void addShoppingList(ShoppingList shoppingList) {
    repository.save(shoppingList);

  }

  public void updateShoppingList(int id, ShoppingList shoppingList) {
    repository.save(shoppingList);

  }

  public void deleteShoppingList(int id) {
    repository.deleteById(id);

  }

  @Transactional
  public void addItem(int id, ShoppingListItem item) {
    ShoppingList shoppingList = getShoppingList(id);
    item.setShoppingList(shoppingList);

    ShoppingListItem sItem = itemRepository.save(item);

    shoppingList.addListItem(sItem);
    // shoppingList.addListItem(item);
    repository.save(shoppingList);

  }

  public List<ShoppingListItem> getItems(int id) {
    return repository.findById(id)
                     .get()
                     .getItems();

  }

}
