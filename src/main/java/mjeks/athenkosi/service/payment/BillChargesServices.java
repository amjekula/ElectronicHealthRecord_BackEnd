package mjeks.athenkosi.service.payment;

import mjeks.athenkosi.entity.payment.BillCharges;
import mjeks.athenkosi.service.IService;

import java.util.Set;

public interface BillChargesServices extends IService<BillCharges, String> {
    Set<BillCharges> getAll();
}
