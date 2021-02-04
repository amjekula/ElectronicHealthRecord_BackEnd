package mjeks.athenkosi.service.payment;

import mjeks.athenkosi.entity.payment.PaymentMethod;
import mjeks.athenkosi.service.IService;

import java.util.Set;

public interface PaymentMethodService extends IService<PaymentMethod, String> {
    Set<PaymentMethod> getAll();
}
