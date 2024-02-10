package in.aakashsinha.InventoryService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class InventoryAdjustmentRequest {
    private String location;
    private String productId;
    private Long quantity;

}
