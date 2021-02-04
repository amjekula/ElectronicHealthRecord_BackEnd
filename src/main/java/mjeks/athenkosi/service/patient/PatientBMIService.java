package mjeks.athenkosi.service.patient;

import mjeks.athenkosi.entity.patient.PatientBMI;
import mjeks.athenkosi.service.IService;

import java.util.Set;

public interface PatientBMIService extends IService<PatientBMI, String> {
    Set<PatientBMI> getAll();
}
