package mjeks.athenkosi.service.internal_generics;

import mjeks.athenkosi.entity.internal_generics.LabInventory;
import mjeks.athenkosi.service.IService;

import java.util.Set;

public interface LabInventoryService extends IService<LabInventory, String> {
    Set<LabInventory> getAll();
}
