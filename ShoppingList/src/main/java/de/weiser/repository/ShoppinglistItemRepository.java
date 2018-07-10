package de.weiser.repository;

import org.springframework.data.repository.CrudRepository;

import de.weiser.model.ShoppingListItem;

public interface ShoppinglistItemRepository extends CrudRepository<ShoppingListItem, Integer> {

}
