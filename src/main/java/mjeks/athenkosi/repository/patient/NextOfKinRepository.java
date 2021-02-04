package mjeks.athenkosi.repository.patient;

import mjeks.athenkosi.entity.patient.NextOfKin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface NextOfKinRepository extends JpaRepository<NextOfKin, String> {
    //Set<NextOfKin> getAll();
}
