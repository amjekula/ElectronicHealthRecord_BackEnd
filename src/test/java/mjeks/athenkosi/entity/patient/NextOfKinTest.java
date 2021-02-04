package mjeks.athenkosi.entity.patient;

import mjeks.athenkosi.entity.patient.NextOfKin;
import mjeks.athenkosi.util.GenericHelper;
import org.junit.Test;

import static org.junit.Assert.*;

public class NextOfKinTest {

    GenericHelper helper = new GenericHelper();
    NextOfKin nextOfKin = new NextOfKin.NextOfKinBuilder().setNextOfKinNo(helper.generateId()).setLastName("Stemela")
            .setName("Mandisi").setPatientNo(helper.generateId()).setPhoneNumber("0834353817").build();
    @Test
    public void getNextOfKinNo() {
        assertNotNull(nextOfKin.getNextOfKinNo());
    }

    @Test
    public void getName() {
        assertEquals(nextOfKin.getName(), "Mandisi");
    }

    @Test
    public void getLatsName() {
        assertEquals(nextOfKin.getLastName(), "Stemela");
    }

    @Test
    public void getPhoneNumber() {
        assertEquals(nextOfKin.getPhoneNumber(), "0834353817");
    }

    @Test
    public void getPatientNo() {
        assertNotNull(nextOfKin.getPatientNo());
    }
}