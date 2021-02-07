package mjeks.athenkosi.controller.patient;

import mjeks.athenkosi.entity.patient.Appointment;
import mjeks.athenkosi.factory.patient.AppointmentFactory;
import mjeks.athenkosi.service.patient.impl.AppointmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("electronichealthrecord/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentServiceImpl appointmentService;

    @PostMapping("/create")
    public Appointment create(@RequestBody Appointment appointment){
        Appointment newAppointment = AppointmentFactory.createAppointment(appointment.getPatientNo(),
                appointment.getDoctorNo(), appointment.getAppDueDate(), appointment.getAddedOn(),
                appointment.getAddedBy());

        return this.appointmentService.create(newAppointment);
    }

    @GetMapping("/read/{appId}")
    public Appointment read(@PathVariable String appId){
        return this.appointmentService.read(appId);
    }

    @PostMapping("/update")
    public Appointment update(@RequestBody Appointment appointment){
        return this.appointmentService.update(appointment);
    }

    @DeleteMapping("/delete/{appId}")
    public void delete(@PathVariable String appId){
        this.appointmentService.delete(appId);
    }

    @GetMapping("/all")
    public Set<Appointment> getAll(){
        return this.appointmentService.getAll();
    }
}
