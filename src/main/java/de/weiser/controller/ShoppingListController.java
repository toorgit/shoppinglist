package de.weiser.controller;

import de.weiser.model.ShoppingList;
import de.weiser.model.ShoppingListItem;
import de.weiser.services.ShoppingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ShoppingListController {

  @Autowired
  private ShoppingListService service;

  @RequestMapping("/shoppinglists")
  public List<ShoppingList> getAllStores() {
    return service.getAllShoppingLists();
  }

  @RequestMapping("/shoppinglists/{id}")
  public ShoppingList getShoppinglist(@PathVariable int id) {
    return service.getShoppingList(id);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/shoppinglists")
  public void addStore(@RequestBody ShoppingList shoppingList) {
    service.addShoppingList(shoppingList);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/shoppinglists/{id}")
  public void updateStore(@RequestBody ShoppingList shoppingList, @PathVariable int id) {
    service.updateShoppingList(id, shoppingList);
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/shoppinglists/{id}")
  public void deleteShoppingList(@PathVariable int id) {
    service.deleteShoppingList(id);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/shoppinglists/{id}/items")
  public void addItem(@PathVariable int id, @RequestBody ShoppingListItem item) {
    System.out.println(id + ": " + item.getAmount() + " " + item.getIngrediant());
    service.addItem(id, item);
  }

  @RequestMapping(value = "/shoppinglists/{id}/items")
  public void getItems(@PathVariable int id) {
    service.getItems(id);
  }
}
