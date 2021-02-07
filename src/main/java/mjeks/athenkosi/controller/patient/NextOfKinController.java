package mjeks.athenkosi.controller.patient;

import mjeks.athenkosi.entity.patient.NextOfKin;
import mjeks.athenkosi.factory.patient.NextOfKinFactory;
import mjeks.athenkosi.service.patient.impl.NextOfKinServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("electronichealthrecord/nextofkin")
public class NextOfKinController {

    @Autowired
    private NextOfKinServiceImpl nextOfKinService;

    @PostMapping("/create")
    public NextOfKin create(@RequestBody NextOfKin nextOfKin){
        NextOfKin newNextOfKin = NextOfKinFactory.createNextOfKin(nextOfKin.getName(), nextOfKin.getLastName(),
                nextOfKin.getPhoneNumber(), nextOfKin.getPatientNo());

        return this.nextOfKinService.create(newNextOfKin);
    }

    @GetMapping("/read/{kinId}")
    public NextOfKin read(@PathVariable String kinId){
        return this.nextOfKinService.read(kinId);
    }

    @PostMapping("/update")
    public NextOfKin update(@RequestBody NextOfKin nextOfKin){
        return this.nextOfKinService.update(nextOfKin);
    }

    @DeleteMapping("/delete/{kinId}")
    public void delete(@PathVariable String kinId){
        this.nextOfKinService.delete(kinId);
    }

    @GetMapping("/all")
    public Set<NextOfKin> getAll(){
        return this.nextOfKinService.getAll();
    }
}
