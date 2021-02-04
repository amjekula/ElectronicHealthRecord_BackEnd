package mjeks.athenkosi.repository.internal_generics;

import mjeks.athenkosi.entity.internal_generics.PharmacyInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PharmacyInventoryRepository extends JpaRepository<PharmacyInventory, String> {
    //Set<PharmacyInventory> getAll();
}
