package de.weiser.repository;

import org.springframework.data.repository.CrudRepository;

import de.weiser.model.Store;

public interface StoreRepository extends CrudRepository<Store, Integer> {

}
