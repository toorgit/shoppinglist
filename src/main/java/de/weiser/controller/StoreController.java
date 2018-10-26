package de.weiser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.weiser.model.Store;
import de.weiser.services.StoreService;

@RestController
public class StoreController {

  @Autowired
  private StoreService storeService;

  @RequestMapping("/stores")
  public List<Store> getAllStores() {
    return storeService.getAllStores();
  }

  @RequestMapping(method = RequestMethod.POST, value = "/stores")
  public void addStore(@RequestBody Store store) {
    storeService.addStore(store);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/stores/{id}")
  public void updateStore(@RequestBody Store store, @PathVariable int id) {
    storeService.updateStore(id, store);
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/stores/{id}")
  public void deleteStore(@PathVariable int id) {
    storeService.deleteStore(id);
  }
}
