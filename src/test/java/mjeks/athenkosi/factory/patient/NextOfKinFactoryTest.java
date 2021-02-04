package mjeks.athenkosi.factory.patient;

import mjeks.athenkosi.entity.patient.NextOfKin;
import mjeks.athenkosi.util.GenericHelper;
import org.junit.Test;

import static org.junit.Assert.*;

public class NextOfKinFactoryTest {
    GenericHelper helper = new GenericHelper();
    NextOfKin nextOfKin = new NextOfKin.NextOfKinBuilder().setNextOfKinNo(helper.generateId()).setLastName("Stemela")
            .setName("Mandisi").setPatientNo(helper.generateId()).setPhoneNumber("0834353817").build();

    @Test
    public void testNextOfKin() {
        assertSame(nextOfKin.getName(), "Mandisi");
    }
}