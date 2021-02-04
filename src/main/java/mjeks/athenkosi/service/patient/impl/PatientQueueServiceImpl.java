package mjeks.athenkosi.service.patient.impl;

import mjeks.athenkosi.entity.patient.PatientQueue;
import mjeks.athenkosi.repository.patient.PatientQueueRepository;
import mjeks.athenkosi.service.patient.PatientQueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PatientQueueServiceImpl implements PatientQueueService {

    @Autowired
    private PatientQueueRepository patientQueueRepository;

    @Override
    public Set<PatientQueue> getAll() {
        return this.patientQueueRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public PatientQueue create(PatientQueue patientQueue) {
        return this.patientQueueRepository.save(patientQueue);
    }

    @Override
    public PatientQueue read(String patientQueueId) {
        return this.patientQueueRepository.findById(patientQueueId).orElse(null);
    }

    @Override
    public PatientQueue update(PatientQueue patientQueue) {
        if(this.patientQueueRepository.existsById(patientQueue.getPatientNo())){
            return this.patientQueueRepository.save(patientQueue);
        }else{
            return null;
        }
    }

    @Override
    public void delete(String patientQueueId) {
        this.patientQueueRepository.deleteById(patientQueueId);
    }
}
