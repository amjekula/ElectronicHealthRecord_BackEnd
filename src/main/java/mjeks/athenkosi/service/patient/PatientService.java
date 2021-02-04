package mjeks.athenkosi.service.patient;

import mjeks.athenkosi.entity.patient.Patient;
import mjeks.athenkosi.service.IService;

import java.util.Set;

public interface PatientService extends IService<Patient, String> {
    Set<Patient> getAll();
}
