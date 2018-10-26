package de.weiser.repository;

import org.springframework.data.repository.CrudRepository;

import de.weiser.model.ShoppingList;

public interface ShoppingListRepository extends CrudRepository<ShoppingList, Integer> {

}
