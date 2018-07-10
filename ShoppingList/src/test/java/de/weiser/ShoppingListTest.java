package de.weiser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.weiser.model.Ingrediant;
import de.weiser.model.ShoppingList;
import de.weiser.model.ShoppingListItem;
import de.weiser.services.ShoppingListService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppingListTest {

  @Autowired
  private ShoppingListService shoppingListService;

  @Before
  public void setUP() throws Exception {
  }

  @Test
  public void testAddData() {
    ShoppingList list1 = new ShoppingList("Einkauf Aldi", "Einkaufsliste Aldi");
    ShoppingList list2 = new ShoppingList("Einkauf Lidl", "Einkaufsliste Lidl");
    assertNull(list1.getId());
    assertNull(list2.getId());
    shoppingListService.addShoppingList(list1);
    shoppingListService.addShoppingList(list2);
    assertNotNull(list1.getId());
    assertNotNull(list2.getId());
  }

  @Test
  public void testFetchData() {
    ShoppingList list = shoppingListService.getShoppingList(1);
    assertNotNull(list);
    assertEquals("Einkauf Aldi", list.getName());

  }

  @Test
  public void testFindAll() {
    assertEquals(2, shoppingListService.getAllShoppingLists()
                                       .size());
  }

  @Test
  public void testAddItem() {
    ShoppingListItem listItem = new ShoppingListItem("1 Kg", new Ingrediant("Banane", ""));
    ShoppingListItem listItem2 = new ShoppingListItem("2 Kg", new Ingrediant("Apfel", ""));
    assertNull(listItem.getId());
    assertNull(listItem2.getId());
    shoppingListService.addItem(1, listItem);
    shoppingListService.addItem(1, listItem2);
    assertNotNull(listItem.getId());
    assertNotNull(listItem2.getId());
  }

}
