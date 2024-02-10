package in.aakashsinha.InventoryService.event;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockCheckEvent {
    private String productId;
    private String location;
}
