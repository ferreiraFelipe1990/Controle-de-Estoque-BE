package com.example.Controle.de.Estoque;

import com.example.Controle.de.Estoque.Inventory.Inventory;

public record InventoryResponseDTO(long id, String title, String image, Integer price) {
  public InventoryResponseDTO(Inventory inventory){
    this(inventory.getId(), inventory.getTitle(), inventory.getImage(), inventory.getPrice());
  }

}
