package mjeks.athenkosi.repository.patient;

import mjeks.athenkosi.entity.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PatientRepository extends JpaRepository<Patient, String> {
    //Set<Patient> getAll();
}
