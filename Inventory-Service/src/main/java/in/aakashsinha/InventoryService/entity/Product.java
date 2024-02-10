package in.aakashsinha.InventoryService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class Product {
    @Id
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stockLevel;
    //private List<Location> locations; // Track stock in different locations
}