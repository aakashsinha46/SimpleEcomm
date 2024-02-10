package in.aakashsinha.InventoryService.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class InventoryEntry {

    @Id
    private Long id;
    @ManyToOne
    private Product product;
    private Long stockLevel;

}

