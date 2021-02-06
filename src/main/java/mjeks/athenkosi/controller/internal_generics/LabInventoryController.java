package mjeks.athenkosi.controller.internal_generics;

import mjeks.athenkosi.entity.internal_generics.LabInventory;
import mjeks.athenkosi.factory.internal_generics.LabInventoryFactory;
import mjeks.athenkosi.service.internal_generics.LabInventoryService;
import mjeks.athenkosi.service.internal_generics.impl.LabInventoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("electronichealthrecord/labinventory")
public class LabInventoryController {

    @Autowired
    private LabInventoryServiceImpl labInventoryService;

    @PostMapping("/create")
    public LabInventory create(@RequestBody LabInventory labInventory){
        LabInventory newLabInventory = LabInventoryFactory.createLabInventory(labInventory.getTestName(),
                                        labInventory.getTestCost(), labInventory.getAddedBy(),
                                        labInventory.getAddedOn());

        return this.labInventoryService.create(newLabInventory);
    }

    @GetMapping("/read/{labInvId}")
    public LabInventory read(@PathVariable String labInvId){
        return this.labInventoryService.read(labInvId);
    }

    @PostMapping("/update")
    public LabInventory update(@RequestBody LabInventory labInventory){
        return this.labInventoryService.update(labInventory);
    }

    @DeleteMapping("/delete/{labInvId}")
    public void delete(@PathVariable String labInvId){
        this.labInventoryService.delete(labInvId);
    }

    @GetMapping("/all")
    public Set<LabInventory> getAll(){
        return this.labInventoryService.getAll();
    }
}
