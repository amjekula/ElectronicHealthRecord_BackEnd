package mjeks.athenkosi.controller.patient;

import mjeks.athenkosi.entity.patient.PatientBMI;
import mjeks.athenkosi.factory.patient.PatientBMIFactory;
import mjeks.athenkosi.service.patient.impl.PatientBMIServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("electronichealthrecord/bmi")
public class PatientBMIController {

    @Autowired
    private PatientBMIServiceImpl patientBMIService;

    @PostMapping("/create")
    public PatientBMI create(@RequestBody PatientBMI patientBMI){
        PatientBMI newBMI = PatientBMIFactory.createPatientBMI(patientBMI.getWeight(), patientBMI.getTemperature(),
                                                                patientBMI.getHeight());

        return this.patientBMIService.create(newBMI);
    }

    @GetMapping("/read/{bmiId}")
    public PatientBMI read(@PathVariable String bmiId){
        return this.patientBMIService.read(bmiId);
    }

    @PostMapping("/update")
    public PatientBMI update(@RequestBody PatientBMI patientBMI){
        return this.patientBMIService.update(patientBMI);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable String bmiId){
        this.patientBMIService.delete(bmiId);
    }

    @GetMapping("/all")
    public Set<PatientBMI> getAll(){
        return this.patientBMIService.getAll();
    }
}
