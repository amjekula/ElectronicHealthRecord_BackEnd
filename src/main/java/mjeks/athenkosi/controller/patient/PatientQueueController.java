package mjeks.athenkosi.controller.patient;

import mjeks.athenkosi.entity.patient.PatientLogin;
import mjeks.athenkosi.entity.patient.PatientQueue;
import mjeks.athenkosi.factory.patient.PatientLoginFactory;
import mjeks.athenkosi.factory.patient.PatientQueueFactory;
import mjeks.athenkosi.service.patient.impl.PatientLoginServiceImpl;
import mjeks.athenkosi.service.patient.impl.PatientQueueServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("electrichealthrecord/queue")
public class PatientQueueController {

    @Autowired
    private PatientQueueServiceImpl patientQueueService;

    @PostMapping("/create")
    public PatientQueue create(@RequestBody PatientQueue patientQueue){
        PatientQueue queue = PatientQueueFactory.createPatientQueue(patientQueue.getPatientNo(),
                patientQueue.getDoctorNo(), patientQueue.getDeptNo(), patientQueue.getDate(),
                patientQueue.getStaffId());

        return this.patientQueueService.create(queue);
    }

    @GetMapping("/read/{queueId}")
    public PatientQueue read(@PathVariable String queueId){
        return this.patientQueueService.read(queueId);
    }

    @PostMapping("/update")
    public PatientQueue update(@RequestBody PatientQueue patientQueue){
        return this.patientQueueService.update(patientQueue);
    }

    @DeleteMapping("/delete/{queueId}")
    public void delete(@PathVariable String queueId){
        this.patientQueueService.delete(queueId);
    }

    @GetMapping("/all")
    public Set<PatientQueue> getAll() {
        return this.patientQueueService.getAll();
    }
}
