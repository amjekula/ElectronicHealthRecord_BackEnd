package mjeks.athenkosi.repository.internal_generics;

import mjeks.athenkosi.entity.internal_generics.LabTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface LabTestRepository extends JpaRepository<LabTest, String> {
   // Set<LabTest> getAll();
}
