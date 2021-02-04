package mjeks.athenkosi.factory.patient;

import mjeks.athenkosi.entity.patient.PatientQueue;
import mjeks.athenkosi.util.GenericHelper;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class PatientQueueFactoryTest {

    PatientQueue patientQueue = PatientQueueFactory.createPatientQueue(GenericHelper.generateId(),
                        GenericHelper.generateId(), GenericHelper.generateId(), new Date().toString(),
                        GenericHelper.generateId());
    @Test
    public void createPatientQueue() {
        assertNotNull(patientQueue.getDate());
        System.out.println("Date: " + patientQueue.getDate());
    }
}