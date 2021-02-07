package mjeks.athenkosi.controller.patient;

import mjeks.athenkosi.entity.patient.Patient;
import mjeks.athenkosi.factory.patient.PatientFactory;
import mjeks.athenkosi.service.patient.impl.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("electronichealthrecord/patient")
public class PatientController {

    @Autowired
    private PatientServiceImpl patientService;

    @PostMapping("/create")
    public Patient create(@RequestBody Patient patient){
        Patient newPatient = PatientFactory.createPatient(patient.getName(), patient.getLastName(),
                                patient.getIdNumber(), patient.getPhoneNumber());

        return this.patientService.create(newPatient);
    }

    @GetMapping("/read/{patientNo}")
    public Patient read(@PathVariable String patientNo){
        return this.patientService.read(patientNo);
    }

    @PostMapping("/update")
    public Patient update(@RequestBody Patient patient){
        return this.patientService.update(patient);
    }

    @DeleteMapping("/delete/{patientNo}")
    public void delete(@PathVariable String patientNo){
        this.patientService.delete(patientNo);
    }

    @GetMapping("/all")
    public Set<Patient> getAll(){
        return this.patientService.getAll();
    }
}
