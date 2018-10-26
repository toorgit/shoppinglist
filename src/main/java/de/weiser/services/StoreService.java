package de.weiser.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.weiser.model.Store;
import de.weiser.repository.StoreRepository;

@Service
public class StoreService {

  @Autowired
  private StoreRepository repository;

  public List<Store> getAllStores() {
    List<Store> stores = new ArrayList<>();
    repository.findAll()
              .forEach(stores::add);
    return stores;
  }

  public void addStore(Store store) {
    repository.save(store);

  }

  public void updateStore(int id, Store store) {
    repository.save(store);

  }

  public void deleteStore(int id) {
    repository.deleteById(id);

  }

}
