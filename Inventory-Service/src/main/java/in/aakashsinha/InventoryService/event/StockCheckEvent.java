package in.aakashsinha.InventoryService.event;


import lombok.Data;

@Data
public class StockCheckEvent {
    private String productId;
    private String location;
}
