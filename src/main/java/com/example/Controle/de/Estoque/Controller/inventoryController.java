package com.example.Controle.de.Estoque.Controller;
import com.example.Controle.de.Estoque.Inventory.Inventory;
import com.example.Controle.de.Estoque.Inventory.InventoryRepository;
import com.example.Controle.de.Estoque.Inventory.InventoryRequestDTO;
import com.example.Controle.de.Estoque.InventoryResponseDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("inventory")
public class inventoryController {

  @Autowired
private InventoryRepository repository;

  @CrossOrigin(origins = "*", allowedHeaders = "*")
  @PostMapping
  public void saveInventory(@RequestBody InventoryRequestDTO data){
    Inventory InventoryData = new Inventory(data);
    repository.save(InventoryData);

  }
  @CrossOrigin(origins = "*", allowedHeaders = "*")
  @GetMapping
  public List<InventoryResponseDTO> getAll(){

    List<InventoryResponseDTO> InventoryList = repository.findAll().stream().map(InventoryResponseDTO::new).toList();

    return InventoryList;
  }
}
