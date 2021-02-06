package mjeks.athenkosi.repository.internal_generics;

import mjeks.athenkosi.entity.internal_generics.LabInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface LabInventoryRepository extends JpaRepository<LabInventory, String> {
    //Set<LabInventoryController> getAll();
}
