package mjeks.athenkosi.service.employee;

import mjeks.athenkosi.entity.employee.Doctor;
import mjeks.athenkosi.service.IService;

import java.util.Set;

public interface DoctorService extends IService<Doctor, String> {
    Set<Doctor> getAll();
}
