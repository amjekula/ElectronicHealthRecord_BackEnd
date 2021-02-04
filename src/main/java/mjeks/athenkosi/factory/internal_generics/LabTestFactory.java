package mjeks.athenkosi.factory.internal_generics;

import mjeks.athenkosi.entity.internal_generics.LabTest;
import mjeks.athenkosi.util.GenericHelper;

public class LabTestFactory {

    public static LabTest createLabTest(String patientNo, String staffId, String labTestDate){

        LabTest labTest = new LabTest.LabTestBuilder()
                .setTestId(GenericHelper.generateId())
                .setPatientNo(patientNo)
                .setStaffId(staffId)
                .setLabTestDate(labTestDate)
                .build();

        return labTest;
    }
}
