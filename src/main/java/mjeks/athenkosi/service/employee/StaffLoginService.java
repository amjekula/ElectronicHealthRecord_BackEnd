package mjeks.athenkosi.service.employee;

import mjeks.athenkosi.entity.employee.StaffLogin;
import mjeks.athenkosi.service.IService;

import java.util.Set;

public interface StaffLoginService extends IService<StaffLogin, String> {
    Set<StaffLogin> getAll();
}
