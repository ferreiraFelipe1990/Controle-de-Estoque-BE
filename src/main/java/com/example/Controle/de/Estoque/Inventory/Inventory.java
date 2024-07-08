package com.example.Controle.de.Estoque.Inventory;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table (name = "Inventory")
@Entity(name = "inventory")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Inventory {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY )
  private Long id;
  private String title;
  private String image;
  private Integer price;

  public Inventory(InventoryRequestDTO data){
    this.image = data.image();
    this.price = data.price();
    this.title = data.title();
  }



}
