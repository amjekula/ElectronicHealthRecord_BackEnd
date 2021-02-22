package mjeks.athenkosi.controller.employee;

import mjeks.athenkosi.entity.employee.Staff;
import mjeks.athenkosi.factory.employee.StaffFactory;
import mjeks.athenkosi.service.employee.impl.StaffServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/electronichealthrecord/staff")
public class StaffController {

    @Autowired
    private StaffServiceImpl staffService;

    @PostMapping("/create")
    public Staff create(@RequestBody Staff staff){
        Staff newStaff = StaffFactory.createStaff(staff.getFirstName(), staff.getLastName(),
                staff.getIdNumber(), staff.getPassword(), staff.getQualification(), staff.getAddress(), staff.getDepartment(),
                staff.getAccessLevel(), staff.getAddedBy());

        return this.staffService.create(newStaff);
    }

    @GetMapping("/read/{staffId}")
    public Staff read(@PathVariable String staffId){
        return this.staffService.read(staffId);
    }

    @PostMapping("/update")
    public Staff update(@RequestBody Staff staff){
        return this.staffService.update(staff);
    }

    @DeleteMapping("/delete/{staffId}")
    public void delete(@PathVariable String staffId){
        this.staffService.delete(staffId);
    }

    @GetMapping("/all")
    public Set<Staff> getAll(){
        return this.staffService.getAll();
    }

}
