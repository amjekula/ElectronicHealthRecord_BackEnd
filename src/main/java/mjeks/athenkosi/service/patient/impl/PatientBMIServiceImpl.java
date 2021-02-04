package mjeks.athenkosi.service.patient.impl;

import mjeks.athenkosi.entity.patient.PatientBMI;
import mjeks.athenkosi.repository.patient.PatientBMIRepository;
import mjeks.athenkosi.service.patient.PatientBMIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PatientBMIServiceImpl implements PatientBMIService {

    @Autowired
    private PatientBMIRepository patientBMIRepository;

    @Override
    public Set<PatientBMI> getAll() {
        return this.patientBMIRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public PatientBMI create(PatientBMI patientBMI) {
        return this.patientBMIRepository.save(patientBMI);
    }

    @Override
    public PatientBMI read(String patientBMIId) {
        return this.patientBMIRepository.findById(patientBMIId).orElse(null);
    }

    @Override
    public PatientBMI update(PatientBMI patientBMI) {
        if(this.patientBMIRepository.existsById(patientBMI.getPatientNo())){
            return this.patientBMIRepository.save(patientBMI);
        }else {
            return null;
        }
    }

    @Override
    public void delete(String patientBMIId) {
        this.patientBMIRepository.deleteById(patientBMIId);
    }
}
