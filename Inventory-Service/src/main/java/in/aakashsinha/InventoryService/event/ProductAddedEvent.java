package in.aakashsinha.InventoryService.event;

import lombok.Data;

@Data
public class ProductAddedEvent {

    private String productId;
    private String productName; // Consider including if shared with Product Service
    private Integer initialStock;

}
