package mjeks.athenkosi.controller.payment;

import mjeks.athenkosi.entity.payment.Billing;
import mjeks.athenkosi.factory.payment.BillingFactory;
import mjeks.athenkosi.service.payment.impl.BillingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("electronichealthrecord/billing")
public class BillingController {

    @Autowired
    private BillingServiceImpl billingServices;

    @PostMapping("/create")
    public Billing create(@RequestBody Billing billing){
        Billing charges = BillingFactory.createBilling(billing.getServiceId(), billing.getDrugId(),
                billing.getTestId(), billing.getPatientNo(), billing.getAddedBy(), billing.getAddedOn());

        return this.billingServices.create(charges);
    }

    @GetMapping("/read/{billId}")
    public Billing read(@PathVariable String billId){
        return this.billingServices.read(billId);
    }

    @PostMapping("/update")
    public Billing update(@RequestBody Billing billing){
        return this.billingServices.update(billing);
    }

    @DeleteMapping("/delete/{billId}")
    public void delete(@PathVariable String billId){
        this.billingServices.delete(billId);
    }

    @GetMapping("/all")
    public Set<Billing> getAll(){
        return this.billingServices.getAll();
    }
}
