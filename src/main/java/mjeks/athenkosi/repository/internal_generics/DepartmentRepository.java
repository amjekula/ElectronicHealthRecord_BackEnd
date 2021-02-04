package mjeks.athenkosi.repository.internal_generics;

import mjeks.athenkosi.entity.internal_generics.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {
    //Set<Department> getAll();
}
