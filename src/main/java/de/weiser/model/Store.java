package de.weiser.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Store {

  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private String description;

  private Store(){

  }
  public Store(String name,String description){
    this.name = name;
    this.description = description;
  }
}
