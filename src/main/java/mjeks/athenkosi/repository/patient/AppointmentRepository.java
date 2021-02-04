package mjeks.athenkosi.repository.patient;

import mjeks.athenkosi.entity.patient.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, String> {
    //Set<Appointment> getAll();
}
