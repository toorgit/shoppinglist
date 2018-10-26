package de.weiser.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.weiser.model.Ingrediant;
import de.weiser.repository.IngrediantRepository;

@Service
public class IngrediantService {

  @Autowired
  private IngrediantRepository repository;

  public List<Ingrediant> getAllIngrediants() {
    List<Ingrediant> ingrediants = new ArrayList<>();
    repository.findAll()
              .forEach(ingrediants::add);
    return ingrediants;
  }

  public void addIngrediant(Ingrediant ingrediant) {
    repository.save(ingrediant);

  }

  public void updateIngreadiant(int id, Ingrediant ingrediant) {
    repository.save(ingrediant);

  }

  public void deleteIngrediant(int id) {
    repository.deleteById(id);

  }

}
