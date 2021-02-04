package mjeks.athenkosi.service.patient;

import mjeks.athenkosi.entity.patient.NextOfKin;
import mjeks.athenkosi.service.IService;

import java.util.Set;

public interface NextOfKinService extends IService<NextOfKin, String> {
    Set<NextOfKin> getAll();
}
