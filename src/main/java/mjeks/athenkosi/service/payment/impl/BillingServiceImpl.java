package mjeks.athenkosi.service.payment.impl;

import mjeks.athenkosi.entity.payment.Billing;
import mjeks.athenkosi.repository.payment.BillingRepository;
import mjeks.athenkosi.service.payment.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BillingServiceImpl implements BillingService {

    @Autowired
    private BillingRepository billingRepository;

    @Override
    public Set<Billing> getAll() {
        return this.billingRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Billing create(Billing billing) {
        return this.billingRepository.save(billing);
    }

    @Override
    public Billing read(String billingId) {
        return this.billingRepository.findById(billingId).orElse(null);
    }

    @Override
    public Billing update(Billing billing) {
        if(this.billingRepository.existsById(billing.getBillId())){
            return this.billingRepository.save(billing);
        }else {
            return null;
        }
    }

    @Override
    public void delete(String billingId) {
        this.billingRepository.deleteById(billingId);
    }
}
