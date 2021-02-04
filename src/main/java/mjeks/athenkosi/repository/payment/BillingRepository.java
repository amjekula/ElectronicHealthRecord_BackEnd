package mjeks.athenkosi.repository.payment;

import mjeks.athenkosi.entity.payment.Billing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface BillingRepository extends JpaRepository<Billing, String> {
    //Set<Billing> getAll();
}
