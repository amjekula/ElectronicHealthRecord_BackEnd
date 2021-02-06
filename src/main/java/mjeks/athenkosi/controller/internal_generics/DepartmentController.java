package mjeks.athenkosi.controller.internal_generics;

import mjeks.athenkosi.entity.internal_generics.Department;
import mjeks.athenkosi.factory.internal_generics.DepartmentFactory;
import mjeks.athenkosi.service.internal_generics.impl.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("electronichealthrecord/department")
public class DepartmentController {

    @Autowired
    private DepartmentServiceImpl departmentService;

    @PostMapping("/create")
    public Department create(@RequestBody Department department){
        Department newDepartment = DepartmentFactory.createDepartment(department.getDepName(),
                                    department.getAddedBy(), department.getAddedOn());

        return this.departmentService.create(newDepartment);
    }

    @GetMapping("/read/{depId}")
    public Department read(@PathVariable String depId){
        return this.departmentService.read(depId);
    }

    @PostMapping("/update")
    public Department update(@RequestBody Department department){
        return this.departmentService.update(department);
    }

    @DeleteMapping("/delete/{depId}")
    public void delete(@PathVariable String depId){
        this.departmentService.delete(depId);
    }

    @GetMapping("/all")
    public Set<Department> getAll(){
        return this.departmentService.getAll();
    }
}
