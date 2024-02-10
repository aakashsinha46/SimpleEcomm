package in.aakashsinha.InventoryService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductInventoryResponse {
    private String productId;
    private String productName; // Consider including if shared with Product Service
    private Long stockLevel;

}
