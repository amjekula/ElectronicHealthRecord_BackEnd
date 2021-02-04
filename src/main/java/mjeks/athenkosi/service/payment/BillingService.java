package mjeks.athenkosi.service.payment;

import mjeks.athenkosi.entity.payment.Billing;
import mjeks.athenkosi.service.IService;

import java.util.Set;

public interface BillingService extends IService<Billing, String> {
    Set<Billing> getAll();
}
