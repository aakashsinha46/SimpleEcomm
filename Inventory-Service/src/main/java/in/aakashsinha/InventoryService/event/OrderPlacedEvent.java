package in.aakashsinha.InventoryService.event;

import in.aakashsinha.InventoryService.entity.Product;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class OrderPlacedEvent {
    private String orderId;
    private List<Product> productList; // List of ordered items with product ID and quantity

}
