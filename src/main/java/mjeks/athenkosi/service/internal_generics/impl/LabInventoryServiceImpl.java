package mjeks.athenkosi.service.internal_generics.impl;

import mjeks.athenkosi.entity.internal_generics.LabInventory;
import mjeks.athenkosi.repository.internal_generics.LabInventoryRepository;
import mjeks.athenkosi.service.internal_generics.LabInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class LabInventoryServiceImpl implements LabInventoryService {

    @Autowired
    private LabInventoryRepository labInventoryRepository;

    @Override
    public Set<LabInventory> getAll() {
        return this.labInventoryRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public LabInventory create(LabInventory labInventory) {
        return this.labInventoryRepository.save(labInventory);
    }

    @Override
    public LabInventory read(String labInventoryId) {
        return this.labInventoryRepository.findById(labInventoryId).orElse(null);
    }

    @Override
    public LabInventory update(LabInventory labInventory) {
        if(this.labInventoryRepository.existsById(labInventory.getTestId())){
            return this.labInventoryRepository.save(labInventory);
        }else{
            return null;
        }
    }

    @Override
    public void delete(String labInventoryId) {
        this.labInventoryRepository.deleteById(labInventoryId);
    }
}

