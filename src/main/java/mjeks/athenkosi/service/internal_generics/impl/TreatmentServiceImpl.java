package mjeks.athenkosi.service.internal_generics.impl;

import mjeks.athenkosi.entity.internal_generics.Treatment;
import mjeks.athenkosi.repository.internal_generics.TreatmentRepository;
import mjeks.athenkosi.service.internal_generics.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class TreatmentServiceImpl implements TreatmentService {

    @Autowired
    private TreatmentRepository treatmentRepository;

    @Override
    public Set<Treatment> getAll() {
        return this.treatmentRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Treatment create(Treatment treatment) {
        return this.treatmentRepository.save(treatment);
    }

    @Override
    public Treatment read(String treatmentId) {
        return this.treatmentRepository.findById(treatmentId).orElse(null);
    }

    @Override
    public Treatment update(Treatment treatment) {
        if(this.treatmentRepository.existsById(treatment.getDrugId())){
            return this.treatmentRepository.save(treatment);
        }else{
            return null;
        }
    }

    @Override
    public void delete(String treatmentId) {
        this.treatmentRepository.deleteById(treatmentId);
    }
}
