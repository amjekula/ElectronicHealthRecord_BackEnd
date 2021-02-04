package mjeks.athenkosi.repository.payment;

import mjeks.athenkosi.entity.payment.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, String> {
    //Set<PaymentMethod> getAll();
}
