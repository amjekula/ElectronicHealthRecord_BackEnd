package mjeks.athenkosi.repository.employee;

import mjeks.athenkosi.entity.employee.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface StaffRepository extends JpaRepository<Staff, String> {
    //Set<Staff> getAll();
}
