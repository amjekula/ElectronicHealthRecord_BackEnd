package mjeks.athenkosi.controller.employee;

import mjeks.athenkosi.entity.employee.StaffLogin;
import mjeks.athenkosi.factory.employee.StaffLoginFactory;
import mjeks.athenkosi.service.employee.StaffLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/electronichealthrecord/stafflogin")
public class StaffLoginController {

    @Autowired
    private StaffLoginService staffLoginService;

    @PostMapping("/create")
    public StaffLogin create(@RequestBody StaffLogin staffLogin){
        StaffLogin newStaffLogin = StaffLoginFactory.createStaffLogin(staffLogin.getLoginDate(), staffLogin.getLogoutTime());
        return this.staffLoginService.create(newStaffLogin);
    }

    @GetMapping("/read/{loginNumber}")
    public StaffLogin read(@PathVariable String loginNumber){
        return this.staffLoginService.read(loginNumber);
    }

    @PostMapping("/update")
    public StaffLogin update(@RequestBody StaffLogin staffLogin) {
        return this.staffLoginService.update(staffLogin);
    }

    @DeleteMapping("/delete/{loginNumber}")
    public void delete(@PathVariable String loginNumber){
        this.staffLoginService.delete(loginNumber);
    }

    @GetMapping("/all")
    public Set<StaffLogin> getAll(){
        return this.staffLoginService.getAll();
    }
}
