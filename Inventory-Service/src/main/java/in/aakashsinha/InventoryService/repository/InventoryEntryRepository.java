package in.aakashsinha.InventoryService.repository;

import in.aakashsinha.InventoryService.entity.InventoryEntry;
import in.aakashsinha.InventoryService.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryEntryRepository extends JpaRepository<InventoryEntry, Long> {

    InventoryEntry findByProductAndLocation(Product product, String location);

}