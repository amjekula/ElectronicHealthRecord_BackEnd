package mjeks.athenkosi.factory.patient;

import mjeks.athenkosi.entity.patient.PatientBMI;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientBMIFactoryTest {

    PatientBMI patientBMI = PatientBMIFactory.createPatientBMI(74, 25, 130);
    @Test
    public void createPatientBMI() {
        assertNotNull(patientBMI.getPatientNo());
        System.out.println(patientBMI.getPatientNo());
    }
}