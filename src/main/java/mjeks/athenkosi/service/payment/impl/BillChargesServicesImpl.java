package mjeks.athenkosi.service.payment.impl;

import mjeks.athenkosi.entity.payment.BillCharges;
import mjeks.athenkosi.repository.payment.BillChargesRepository;
import mjeks.athenkosi.service.payment.BillChargesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BillChargesServicesImpl implements BillChargesServices {

    @Autowired
    private BillChargesRepository billChargesRepository;

    @Override
    public Set<BillCharges> getAll() {
        return this.billChargesRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public BillCharges create(BillCharges billCharges) {
        return this.billChargesRepository.save(billCharges);
    }

    @Override
    public BillCharges read(String billChargesId) {
        return this.billChargesRepository.findById(billChargesId).orElse(null);
    }

    @Override
    public BillCharges update(BillCharges billCharges) {
        if(this.billChargesRepository.existsById(billCharges.getServiceId())){
            return this.billChargesRepository.save(billCharges);
        }else{
            return null;
        }
    }

    @Override
    public void delete(String billChargesId) {
        this.billChargesRepository.deleteById(billChargesId);
    }
}
