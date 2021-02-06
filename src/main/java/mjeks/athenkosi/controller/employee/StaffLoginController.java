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
        StaffLogin newStaffLogin = StaffLoginFactory.createStaffLogin(staffLogin.getStaffNo(), staffLogin.getUsername(),
                                    staffLogin.getPassword(), staffLogin.getLoginDate(), staffLogin.getLogoutTime());
        return this.staffLoginService.create(newStaffLogin);
    }

    @GetMapping("/read/{loginId}")
    public StaffLogin read(@PathVariable String loginId){
        return this.staffLoginService.read(loginId);
    }

    @PostMapping("/update")
    public StaffLogin update(@RequestBody StaffLogin staffLogin) {
        return this.staffLoginService.update(staffLogin);
    }

    @DeleteMapping("/delete/{loginId}")
    public void delete(@PathVariable String loginId){
        this.staffLoginService.delete(loginId);
    }

    @GetMapping("/all")
    public Set<StaffLogin> getAll(){
        return this.staffLoginService.getAll();
    }
}
