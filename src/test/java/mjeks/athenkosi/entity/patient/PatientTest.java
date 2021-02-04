package mjeks.athenkosi.entity.patient;

import mjeks.athenkosi.entity.patient.Patient;
import mjeks.athenkosi.util.GenericHelper;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientTest {


    GenericHelper helper = new GenericHelper();
    Patient patient = new Patient.PatientBuilder().setPatientNo(helper.generateId()).setName("Athenkosi")
            .setLastName("Mjekula").setIdNumber("9212065471080").setPhoneNumber("0792250655").build();
    @Test
    public void getPatientNo() {
        assertNotNull(patient.getPatientNo());
        System.out.println(patient.getPatientNo());
    }

    @Test
    public void getName() {
        assertEquals(patient.getName(), "Athenkosi");
    }

    @Test
    public void getLastName() {
        assertEquals(patient.getLastName(), "Mjekula");
    }

    @Test
    public void getIdNumber() {
        assertEquals(patient.getIdNumber(), "9212065471080");
    }

    @Test
    public void getPhoneNumber() {
        assertEquals(patient.getPhoneNumber(), "0792250655");
    }
}