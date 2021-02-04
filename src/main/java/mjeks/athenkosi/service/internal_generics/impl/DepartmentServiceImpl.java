package mjeks.athenkosi.service.internal_generics.impl;

import mjeks.athenkosi.entity.internal_generics.Department;
import mjeks.athenkosi.repository.internal_generics.DepartmentRepository;
import mjeks.athenkosi.service.internal_generics.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Set<Department> getAll() {
        return this.departmentRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Department create(Department department) {
        return this.departmentRepository.save(department);
    }

    @Override
    public Department read(String departmentId) {
        return this.departmentRepository.findById(departmentId).orElse(null);
    }

    @Override
    public Department update(Department department) {
        if(this.departmentRepository.existsById(department.getDepNo())){
            return this.departmentRepository.save(department);
        }else{
            return null;
        }
    }

    @Override
    public void delete(String departmentId) {
        this.departmentRepository.deleteById(departmentId);
    }
}
