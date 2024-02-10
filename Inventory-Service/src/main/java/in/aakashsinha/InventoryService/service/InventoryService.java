package in.aakashsinha.InventoryService.service;

import in.aakashsinha.InventoryService.event.OrderPlacedEvent;
import in.aakashsinha.InventoryService.event.ProductAddedEvent;
import in.aakashsinha.InventoryService.event.StockCheckEvent;

public interface InventoryService {

    void handleProductAddedEvent(ProductAddedEvent event);

    void handleOrderPlacedEvent(OrderPlacedEvent event);

    void handleStockCheckEvent(StockCheckEvent event);

    void adjustStock(String location, String productId, Long quantity);

    // Other methods for low-stock alerts, reorder triggers, etc.

}
