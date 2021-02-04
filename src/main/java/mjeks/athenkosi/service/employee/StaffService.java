package mjeks.athenkosi.service.employee;

import mjeks.athenkosi.entity.employee.Staff;
import mjeks.athenkosi.service.IService;

import java.util.Set;

public interface StaffService extends IService<Staff, String> {
    Set<Staff> getAll();
}
