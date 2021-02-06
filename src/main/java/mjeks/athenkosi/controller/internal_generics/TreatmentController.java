package mjeks.athenkosi.controller.internal_generics;

import mjeks.athenkosi.entity.internal_generics.Treatment;
import mjeks.athenkosi.factory.internal_generics.TreatmentFactory;
import mjeks.athenkosi.service.internal_generics.impl.TreatmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("electronichealthrecord/treatment")
public class TreatmentController {

    @Autowired
    private TreatmentServiceImpl treatmentService;

    @PostMapping("/create")
    public Treatment create(@RequestBody Treatment treatment){
        Treatment newTreatment = TreatmentFactory.createTreatment(treatment.getTreatmentDisease(),
                treatment.getTreatmentNotes(), treatment.getTestId(), treatment.getDrugId(),
                treatment.getPatientNo(), treatment.getTreatmentDate());

        return this.treatmentService.create(newTreatment);
    }

    @GetMapping("/read/{treatmentId}")
    public Treatment read(@PathVariable String treatmentId){
        return this.treatmentService.read(treatmentId);
    }

    @PostMapping("/update")
    public Treatment update(@RequestBody Treatment treatment){
        return this.treatmentService.update(treatment);
    }

    @DeleteMapping("/delete/{treatmentId}")
    public void delete(@PathVariable String treatmentId){
        this.treatmentService.delete(treatmentId);
    }

    @GetMapping("/all")
    public Set<Treatment> getAll(){
        return this.treatmentService.getAll();
    }
}
