package in.aakashsinha.InventoryService.event;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EventName("product-added")
public class ProductAddedEvent {

    private String productId;
    private String productName; // Consider including if shared with Product Service
    private Integer initialStock;

}
