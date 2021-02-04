package mjeks.athenkosi.repository.patient;

import mjeks.athenkosi.entity.patient.PatientBMI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PatientBMIRepository extends JpaRepository<PatientBMI, String> {
   // Set<PatientBMI> getAll();
}
