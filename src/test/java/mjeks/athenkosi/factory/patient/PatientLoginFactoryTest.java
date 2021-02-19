package mjeks.athenkosi.factory.patient;

import mjeks.athenkosi.entity.patient.PatientLogin;
import mjeks.athenkosi.util.GenericHelper;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class PatientLoginFactoryTest {

    Date date = new Date();
    SimpleDateFormat timeFormatter = new SimpleDateFormat("HH : mm");
    SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-mm-dd HH: mm");


    PatientLogin patientLoginFactory = PatientLoginFactory.createPatientLogin(GenericHelper.generateId(),
             date);

    @Test
    public void createPatientLogin() {
    }
}