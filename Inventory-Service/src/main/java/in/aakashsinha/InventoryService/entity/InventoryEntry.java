package in.aakashsinha.InventoryService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryEntry {

    @Id
    private Long id;
    @ManyToOne
    private Product product;
    private Long stockLevel;

}

