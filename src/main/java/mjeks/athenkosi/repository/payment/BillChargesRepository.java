package mjeks.athenkosi.repository.payment;

import mjeks.athenkosi.entity.payment.BillCharges;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface BillChargesRepository extends JpaRepository<BillCharges, String> {
    //Set<BillCharges> getAll();
}
