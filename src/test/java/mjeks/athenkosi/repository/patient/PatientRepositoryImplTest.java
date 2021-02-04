//package mjeks.athenkosi.repository.patient;
//
//import mjeks.athenkosi.entity.patient.Patient;
//import mjeks.athenkosi.factory.patient.PatientFactory;
//import mjeks.athenkosi.repository.patient.PatientRepository;
//import mjeks.athenkosi.repository.patient.impl.PatientRepositoryImpl;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//import java.util.Set;
//
//import static org.junit.Assert.*;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class PatientRepositoryImplTest {
//
//    public static PatientRepository patientRepository = PatientRepositoryImpl.getPatientRepository();
//    public static Patient patientBuilder = PatientFactory.createPatient("Mandilakhe", "Waai",
//                                           "956486588", "072846");
//
//    @Test
//    public void d_getAll() {
//        Set<Patient> patientDB = this.patientRepository.getAll();
//        System.out.println(patientDB);
//        assertNotEquals(0, patientDB.size());
//    }
//
//    @Test
//    public void a_create() {
//        this.patientRepository.create(patientBuilder);
//        assertEquals("Mandilakhe", patientBuilder.getName());
//    }
//
//    @Test
//    public void b_read() {
//        this.patientRepository.read(patientBuilder.getPatientNo());
//        assertEquals("Waai", patientBuilder.getLastName());
//    }
//
//    @Test
//    public void c_update() {
//        Patient patient = new Patient.PatientBuilder().copy(patientBuilder).setName("Ayanda").build();
//        patient = patientRepository.update(patient);
//
//        assertNotEquals(this.patientBuilder.getName(), patient.getName());
//        System.out.println(patientBuilder.getName());
//    }
//
//    @Test
//    public void e_delete() {
//        this.patientRepository.delete(patientBuilder.getPatientNo());
//        assertNotEquals(1, patientRepository.getAll().size());
//        System.out.println(patientRepository.getAll().size());
//    }
//}