package in.aakashsinha.InventoryService.service;

import in.aakashsinha.InventoryService.event.OrderPlacedEvent;
import in.aakashsinha.InventoryService.event.ProductAddedEvent;
import in.aakashsinha.InventoryService.event.StockCheckEvent;
import in.aakashsinha.InventoryService.repository.InventoryEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryEntryRepository inventoryEntryRepository;

    @EventListener(ProductAddedEvent.class)
    public void handleProductAddedEvent(ProductAddedEvent event) {
        // Create inventory entry with initial stock


    }

    @Override
    public void handleOrderPlacedEvent(OrderPlacedEvent event) {

    }

    @Override
    public void handleStockCheckEvent(StockCheckEvent event) {

    }

    @Override
    public void adjustStock(String location, String productId, Long quantity) {

    }
    // Implement other event handlers and service methods similarly

}
