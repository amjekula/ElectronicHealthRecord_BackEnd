package mjeks.athenkosi.controller.employee;

import mjeks.athenkosi.entity.employee.Doctor;
import mjeks.athenkosi.factory.employee.DoctorFactory;
import mjeks.athenkosi.service.employee.impl.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/electronichealthrecord/doctor")
public class DoctorController {

    @Autowired
    private DoctorServiceImpl doctorServiceImpl;

    @PostMapping("/create")
    public Doctor create(@RequestBody Doctor doctor){
        Doctor newDoctor = DoctorFactory.createDoctor(doctor.getStaff());

        return this.doctorServiceImpl.create(newDoctor);
    }

    @GetMapping("/read/{doctorId}")
    public Doctor read(@PathVariable String doctorId){
        return this.doctorServiceImpl.read(doctorId);
    }

    @PostMapping("/update")
    public Doctor update(@RequestBody Doctor doctor){
        return this.doctorServiceImpl.update(doctor);
    }

    @DeleteMapping("/delete/{doctorId}")
    public void delete(@PathVariable String doctorId){
        this.doctorServiceImpl.delete(doctorId);
    }

    @GetMapping("/all")
    public Set<Doctor> getAll(){
        return this.doctorServiceImpl.getAll();
    }

}
