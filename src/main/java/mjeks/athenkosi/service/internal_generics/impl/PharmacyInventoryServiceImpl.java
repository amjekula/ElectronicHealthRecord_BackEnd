package mjeks.athenkosi.service.internal_generics.impl;

import mjeks.athenkosi.entity.internal_generics.PharmacyInventory;
import mjeks.athenkosi.repository.internal_generics.PharmacyInventoryRepository;
import mjeks.athenkosi.service.internal_generics.PharmacyInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PharmacyInventoryServiceImpl implements PharmacyInventoryService {

    @Autowired
    private PharmacyInventoryRepository pharmacyInventoryRepository;

    @Override
    public Set<PharmacyInventory> getAll() {
        return this.pharmacyInventoryRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public PharmacyInventory create(PharmacyInventory pharmacyInventory) {
        return this.pharmacyInventoryRepository.save(pharmacyInventory);
    }

    @Override
    public PharmacyInventory read(String pharmacyInventoryId) {
        return this.pharmacyInventoryRepository.findById(pharmacyInventoryId).orElse(null);
    }

    @Override
    public PharmacyInventory update(PharmacyInventory pharmacyInventory) {
        if(this.pharmacyInventoryRepository.existsById(pharmacyInventory.getDrugId())){
            return this.pharmacyInventoryRepository.save(pharmacyInventory);
        }else{
            return null;
        }
    }

    @Override
    public void delete(String pharmacyInventoryId) {
        this.pharmacyInventoryRepository.deleteById(pharmacyInventoryId);
    }
}
