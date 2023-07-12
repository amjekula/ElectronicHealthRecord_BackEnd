package mjeks.athenkosi.repository.employee;

import mjeks.athenkosi.entity.employee.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String> {

    Optional<Doctor> findByDoctorNo(String doctorNo);
}
