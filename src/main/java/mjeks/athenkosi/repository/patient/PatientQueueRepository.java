package mjeks.athenkosi.repository.patient;

import mjeks.athenkosi.entity.patient.PatientQueue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PatientQueueRepository extends JpaRepository<PatientQueue, String> {
    //Set<PatientQueue> getAll();
}
