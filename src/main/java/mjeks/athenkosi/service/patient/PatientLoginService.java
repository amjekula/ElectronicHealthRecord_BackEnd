package mjeks.athenkosi.service.patient;

import mjeks.athenkosi.entity.patient.PatientLogin;
import mjeks.athenkosi.service.IService;

import java.util.Set;

public interface PatientLoginService extends IService<PatientLogin, String> {
    Set<PatientLogin> getAll();
}
