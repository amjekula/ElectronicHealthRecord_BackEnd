package mjeks.athenkosi.controller.patient;

import mjeks.athenkosi.entity.patient.PatientLogin;
import mjeks.athenkosi.factory.patient.PatientLoginFactory;
import mjeks.athenkosi.service.patient.impl.PatientLoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("electrichealthrecord/plogin")
public class PatientLoginController {

    @Autowired
    private PatientLoginServiceImpl patientLoginService;

    @PostMapping("/create")
    public PatientLogin create(@RequestBody PatientLogin patientLogin){
        PatientLogin login = PatientLoginFactory.createPatientLogin(patientLogin.getLoginNumber(),
                             patientLogin.getLogoutTime());

        return this.patientLoginService.create(login);
    }

    @GetMapping("/read/{loginId}")
    public PatientLogin read(@PathVariable String loginId){
        return this.patientLoginService.read(loginId);
    }

    @PostMapping("/update")
    public PatientLogin update(@RequestBody PatientLogin patientLogin){
        return this.patientLoginService.update(patientLogin);
    }

    @DeleteMapping("/delete/{loginId}")
    public void delete(@PathVariable String loginId){
        this.patientLoginService.delete(loginId);
    }

    @GetMapping("/all")
    public Set<PatientLogin> getAll(){
        return this.patientLoginService.getAll();
    }
}
