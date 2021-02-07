package mjeks.athenkosi.controller.payment;

import mjeks.athenkosi.entity.payment.BillCharges;
import mjeks.athenkosi.factory.payment.BillChargesFactory;
import mjeks.athenkosi.service.payment.impl.BillChargesServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("electronichealthrecord/charges")
public class BillChargesController {

    @Autowired
    private BillChargesServicesImpl billChargesServices;

    @PostMapping("/create")
    public BillCharges create(@RequestBody BillCharges billCharges){
        BillCharges charges = BillChargesFactory.createBillCharges(billCharges.getServiceName(),
                billCharges.getServiceCost(), billCharges.getAddedBy(), billCharges.getAddedOn());

        return this.billChargesServices.create(charges);
    }

    @GetMapping("/read/{chargesId}")
    public BillCharges read(@PathVariable String chargesId){
        return this.billChargesServices.read(chargesId);
    }

    @PostMapping("/update")
    public BillCharges update(@RequestBody BillCharges billCharges){
        return this.billChargesServices.update(billCharges);
    }

    @DeleteMapping("/delete/{chargesId}")
    public void delete(@PathVariable String chargesId){
        this.billChargesServices.delete(chargesId);
    }

    @GetMapping("/all")
    public Set<BillCharges> getAll(){
        return this.billChargesServices.getAll();
    }
}
