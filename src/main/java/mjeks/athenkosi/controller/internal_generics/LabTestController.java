package mjeks.athenkosi.controller.internal_generics;

import mjeks.athenkosi.entity.internal_generics.LabTest;
import mjeks.athenkosi.factory.internal_generics.LabTestFactory;
import mjeks.athenkosi.service.internal_generics.impl.LabTestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("electronichealthrecord/labtest")
public class LabTestController {

    @Autowired
    private LabTestServiceImpl labTestService;

    @PostMapping("/create")
    public LabTest create(@RequestBody LabTest labTest){
        LabTest newLabTest = LabTestFactory.createLabTest(labTest.getPatientNo(), labTest.getStaffId(),
                                labTest.getLabTestDate());

        return this.labTestService.create(newLabTest);
    }

    @GetMapping("/read/{testId}")
    public LabTest read(@PathVariable String testId){
        return this.labTestService.read(testId);
    }

    @PostMapping("/update")
    public LabTest update(@RequestBody LabTest labTest){
        return this.labTestService.update(labTest);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable String testId){
        this.labTestService.delete(testId);
    }

    @GetMapping("/all")
    public Set<LabTest> getAll(){
        return this.labTestService.getAll();
    }
}
