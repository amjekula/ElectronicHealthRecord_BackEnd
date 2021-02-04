package mjeks.athenkosi.service.patient;

import mjeks.athenkosi.entity.patient.PatientQueue;
import mjeks.athenkosi.service.IService;

import java.util.Set;

public interface PatientQueueService extends IService<PatientQueue, String> {
    Set<PatientQueue> getAll();
}
