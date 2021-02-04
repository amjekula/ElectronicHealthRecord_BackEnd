package mjeks.athenkosi.service.internal_generics;

import mjeks.athenkosi.entity.internal_generics.LabTest;
import mjeks.athenkosi.service.IService;

import java.util.Set;

public interface LabTestService extends IService<LabTest, String> {
    Set<LabTest> getAll();
}
