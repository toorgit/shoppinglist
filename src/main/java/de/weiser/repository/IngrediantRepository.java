package de.weiser.repository;

import org.springframework.data.repository.CrudRepository;

import de.weiser.model.Ingrediant;

public interface IngrediantRepository extends CrudRepository<Ingrediant, Integer> {

}
