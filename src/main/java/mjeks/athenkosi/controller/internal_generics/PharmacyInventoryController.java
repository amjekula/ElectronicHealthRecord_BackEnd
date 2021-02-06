package mjeks.athenkosi.controller.internal_generics;

import mjeks.athenkosi.entity.internal_generics.PharmacyInventory;
import mjeks.athenkosi.factory.internal_generics.PharmacyInventoryFactory;
import mjeks.athenkosi.service.internal_generics.impl.PharmacyInventoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("electronichealthrecord/pharmacyinventory")
public class PharmacyInventoryController {

    @Autowired
    private PharmacyInventoryServiceImpl pharmacyInventoryService;

    @PostMapping("/create")
    public PharmacyInventory create(@RequestBody PharmacyInventory pharmacyInventory){
        PharmacyInventory newPharmacyInventory = PharmacyInventoryFactory
                .createPharmacyInventory(pharmacyInventory.getDrugName(), pharmacyInventory.getDrugInventory(),
                        pharmacyInventory.getDrugExpDate(), pharmacyInventory.getAddedBy(),
                        pharmacyInventory.getAddedOn(), pharmacyInventory.getDrugCost());

        return this.pharmacyInventoryService.create(newPharmacyInventory);
    }

    @GetMapping("/read/{invId}")
    public PharmacyInventory read(@PathVariable String invId){
        return this.pharmacyInventoryService.read(invId);
    }

    @PostMapping("/update")
    public PharmacyInventory update(@RequestBody PharmacyInventory pharmacyInventory){
        return this.pharmacyInventoryService.update(pharmacyInventory);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable String invId){
        this.pharmacyInventoryService.delete(invId);
    }

    @GetMapping("/all")
    public Set<PharmacyInventory> getAll(){
        return this.pharmacyInventoryService.getAll();
    }
}
