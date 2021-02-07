package mjeks.athenkosi.controller.payment;

import mjeks.athenkosi.entity.payment.PaymentMethod;
import mjeks.athenkosi.factory.payment.PaymentMethodFactory;
import mjeks.athenkosi.service.payment.impl.PaymentMethodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("electronichealthrecord/paymentmethod")
public class PaymentMethodController {

    @Autowired
    private PaymentMethodServiceImpl paymentMethodService;

    @PostMapping("/create")
    public PaymentMethod create(@RequestBody PaymentMethod paymentMethod){
        PaymentMethod charges = PaymentMethodFactory.createPaymentMethod(paymentMethod.getPaymentMethodName(),
                paymentMethod.getAddedBy(), paymentMethod.getAddedOn());

        return this.paymentMethodService.create(charges);
    }

    @GetMapping("/read/{paymentId}")
    public PaymentMethod read(@PathVariable String paymentId){
        return this.paymentMethodService.read(paymentId);
    }

    @PostMapping("/update")
    public PaymentMethod update(@RequestBody PaymentMethod paymentMethod){
        return this.paymentMethodService.update(paymentMethod);
    }

    @DeleteMapping("/delete/{paymentId}")
    public void delete(@PathVariable String paymentId){
        this.paymentMethodService.delete(paymentId);
    }

    @GetMapping("/all")
    public Set<PaymentMethod> getAll(){
        return this.paymentMethodService.getAll();
    }
}
