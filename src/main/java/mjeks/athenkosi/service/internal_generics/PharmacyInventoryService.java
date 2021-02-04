package mjeks.athenkosi.service.internal_generics;

import mjeks.athenkosi.entity.internal_generics.PharmacyInventory;
import mjeks.athenkosi.service.IService;

import java.util.Set;

public interface PharmacyInventoryService extends IService<PharmacyInventory, String> {
    Set<PharmacyInventory> getAll();
}
