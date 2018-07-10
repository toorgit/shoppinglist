package de.weiser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.weiser.model.Ingrediant;
import de.weiser.services.IngrediantService;

@RestController
public class IngrediantController {

  @Autowired
  private IngrediantService ingrediantService;

  @RequestMapping("/ingrediants")
  public List<Ingrediant> getAllIngrediants() {
    return ingrediantService.getAllIngrediants();
  }

  @RequestMapping(method = RequestMethod.POST, value = "/ingrediants")
  public void addIngrediant(@RequestBody Ingrediant ingrediant) {
    ingrediantService.addIngrediant(ingrediant);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/ingrediants/{id}")
  public void updateIngrediant(@RequestBody Ingrediant ingrediant, @PathVariable int id) {
    ingrediantService.updateIngreadiant(id, ingrediant);
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/ingrediants/{id}")
  public void deleteIngrediant(@PathVariable int id) {
    ingrediantService.deleteIngrediant(id);
  }
}
