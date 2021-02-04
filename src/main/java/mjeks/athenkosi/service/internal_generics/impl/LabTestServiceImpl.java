package mjeks.athenkosi.service.internal_generics.impl;

import mjeks.athenkosi.entity.internal_generics.LabTest;
import mjeks.athenkosi.repository.internal_generics.LabTestRepository;
import mjeks.athenkosi.service.internal_generics.LabTestService;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class LabTestServiceImpl implements LabTestService {

    private LabTestRepository labTestRepository;

    @Override
    public Set<LabTest> getAll() {
        return this.labTestRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public LabTest create(LabTest labTest) {
        return this.labTestRepository.save(labTest);
    }

    @Override
    public LabTest read(String labTestId) {
        return this.labTestRepository.findById(labTestId).orElse(null);
    }

    @Override
    public LabTest update(LabTest labTest) {
        if(this.labTestRepository.existsById(labTest.getTestId())){
            return this.labTestRepository.save(labTest);
        }else{
            return null;
        }
    }

    @Override
    public void delete(String labTestId) {
        this.labTestRepository.deleteById(labTestId);
    }
}
