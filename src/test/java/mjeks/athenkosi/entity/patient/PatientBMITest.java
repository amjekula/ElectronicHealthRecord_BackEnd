package mjeks.athenkosi.entity.patient;

import mjeks.athenkosi.util.GenericHelper;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientBMITest {

    PatientBMI patientBMI = new PatientBMI.PatientBMIBuilder()
            .setPatientNo(GenericHelper.generateId())
            .setHeight(120)
            .setTemperature(25)
            .setWeight(75)
            .build();
    @Test
    public void getPatientNo() {
        assertNotNull(patientBMI.getPatientNo());
        System.out.println(patientBMI.getPatientNo());
    }

    @Test
    public void getWeight() {
        assertEquals(75, patientBMI.getWeight());
        System.out.println(patientBMI.getWeight());
    }

    @Test
    public void getTemperature() {
        assertEquals(25, patientBMI.getTemperature());
        System.out.println(patientBMI.getTemperature());
    }

    @Test
    public void getHeight() {
        assertEquals(120, patientBMI.getHeight());
        System.out.println(patientBMI.getHeight());
    }
}