package in.aakashsinha.InventoryService.controller;

import in.aakashsinha.InventoryService.model.InventoryAdjustmentRequest;
import in.aakashsinha.InventoryService.model.ProductInventoryResponse;
import in.aakashsinha.InventoryService.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/{productId}")
    public ProductInventoryResponse getInventory(@PathVariable String productId) {
        // Retrieve and return inventory information for the product
        return null;
    }

    @PostMapping("/adjust")
    public void adjustStock(@RequestBody InventoryAdjustmentRequest request) {
        inventoryService.adjustStock(request.getLocation(), request.getProductId(), request.getQuantity());
    }

    // Other endpoints for historical data, etc. (as needed)

}

