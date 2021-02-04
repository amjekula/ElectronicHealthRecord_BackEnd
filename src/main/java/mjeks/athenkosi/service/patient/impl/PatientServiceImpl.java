package mjeks.athenkosi.service.patient.impl;

import mjeks.athenkosi.entity.patient.Patient;
import mjeks.athenkosi.repository.patient.PatientRepository;
import mjeks.athenkosi.service.patient.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Set<Patient> getAll() {
        return this.patientRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Patient create(Patient patient) {
        return this.patientRepository.save(patient);
    }

    @Override
    public Patient read(String patientId) {
        return this.patientRepository.findById(patientId).orElse(null);
    }

    @Override
    public Patient update(Patient patient) {
        if(this.patientRepository.existsById(patient.getPatientNo())){
            return this.patientRepository.save(patient);
        }else {
            return null;
        }
    }

    @Override
    public void delete(String patientId) {
        this.patientRepository.deleteById(patientId);
    }
}
