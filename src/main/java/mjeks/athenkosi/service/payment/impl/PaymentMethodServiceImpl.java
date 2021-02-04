package mjeks.athenkosi.service.payment.impl;

import mjeks.athenkosi.entity.payment.PaymentMethod;
import mjeks.athenkosi.repository.payment.PaymentMethodRepository;
import mjeks.athenkosi.service.payment.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PaymentMethodServiceImpl implements PaymentMethodService {

    @Autowired
    private PaymentMethodRepository paymentMethodRepository;

    @Override
    public Set<PaymentMethod> getAll() {
        return this.paymentMethodRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public PaymentMethod create(PaymentMethod paymentMethod) {
        return this.paymentMethodRepository.save(paymentMethod);
    }

    @Override
    public PaymentMethod read(String paymentMethodId) {
        return this.paymentMethodRepository.findById(paymentMethodId).orElse(null);
    }

    @Override
    public PaymentMethod update(PaymentMethod paymentMethod) {
        if(this.paymentMethodRepository.existsById(paymentMethod.getPaymentMethodId())){
            return this.paymentMethodRepository.save(paymentMethod);
        }else{
            return null;
        }
    }

    @Override
    public void delete(String paymentMethodId) {
        this.paymentMethodRepository.deleteById(paymentMethodId);
    }
}
