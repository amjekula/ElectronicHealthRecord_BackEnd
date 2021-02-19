package mjeks.athenkosi.service.patient.impl;

import mjeks.athenkosi.entity.patient.PatientLogin;
import mjeks.athenkosi.repository.patient.PatientLoginRepository;
import mjeks.athenkosi.service.patient.PatientLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PatientLoginServiceImpl implements PatientLoginService {

    @Autowired
    private PatientLoginRepository patientLoginRepository;

    @Override
    public Set<PatientLogin> getAll() {
        return this.patientLoginRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public PatientLogin create(PatientLogin patientLogin) {
        return this.patientLoginRepository.save(patientLogin);
    }

    @Override
    public PatientLogin read(String patientLoginId) {
        return this.patientLoginRepository.findById(patientLoginId).orElse(null);
    }

    @Override
    public PatientLogin update(PatientLogin patientLogin) {
        if(this.patientLoginRepository.existsById(patientLogin.getLoginNumber())){
            return this.patientLoginRepository.save(patientLogin);
        }else{
            return null;
        }
    }

    @Override
    public void delete(String patientLoginId) {
        this.patientLoginRepository.deleteById(patientLoginId);
    }
}
