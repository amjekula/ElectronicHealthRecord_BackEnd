package mjeks.athenkosi.service.internal_generics;

import mjeks.athenkosi.entity.internal_generics.Department;
import mjeks.athenkosi.service.IService;

import java.util.Set;

public interface DepartmentService extends IService<Department, String> {
    Set<Department> getAll();
}
