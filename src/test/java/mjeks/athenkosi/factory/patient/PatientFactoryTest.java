package mjeks.athenkosi.factory.patient;

import mjeks.athenkosi.entity.patient.Patient;
import mjeks.athenkosi.factory.patient.PatientFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientFactoryTest {

    Patient patientFactory = PatientFactory.createPatient("Athenkosi", "Mjekula"
                                    , "921205", "0792250");

    @Test
    public void testCreatePatient() {
        assertNotNull(patientFactory.getPatientNo());
        System.out.println(patientFactory.getPatientNo());
    }
}