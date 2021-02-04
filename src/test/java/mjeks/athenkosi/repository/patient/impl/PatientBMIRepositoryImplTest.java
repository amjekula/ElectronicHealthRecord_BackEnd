//package mjeks.athenkosi.repository.patient.impl;
//
//import mjeks.athenkosi.entity.patient.PatientBMI;
//import mjeks.athenkosi.factory.patient.PatientBMIFactory;
//import mjeks.athenkosi.repository.patient.PatientBMIRepository;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//import static org.junit.Assert.*;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class PatientBMIRepositoryImplTest {
//
//    private static PatientBMIRepository patientBMIRepository = new PatientBMIRepositoryImpl().getPatientBMIRepository();
//    private static PatientBMI patientBMIFactory = PatientBMIFactory.createPatientBMI(120, 35, 58);
//
//
//    @Test
//    public void d_getAll() {
//        assertEquals(1, this.patientBMIRepository.getAll().size());
//    }
//
//    @Test
//    public void a_create() {
//        patientBMIRepository.create(patientBMIFactory);
//        assertEquals(patientBMIRepository.read(patientBMIFactory.getPatientNo()).getPatientNo(),
//                                                patientBMIFactory.getPatientNo());
//        System.out.println("Create ID: " + patientBMIRepository.read(patientBMIFactory.getPatientNo()).getPatientNo() + "\n" +
//                "Verify: " + patientBMIFactory.getPatientNo());
//    }
//
//    @Test
//    public void b_read() {
//        assertNotNull(patientBMIRepository.read(patientBMIFactory.getPatientNo()));
//        System.out.println("Read: " + patientBMIRepository.read(patientBMIFactory.getPatientNo()).getHeight());
//    }
//
//    @Test
//    public void c_update() {
//        PatientBMI oldPatientBMI = new PatientBMI.PatientBMIBuilder().copy(patientBMIFactory)
//                                    .setHeight(172).build();
//        this.patientBMIRepository.update(oldPatientBMI);
//
//        assertEquals(patientBMIRepository.read(oldPatientBMI.getPatientNo()).getPatientNo(),
//                        oldPatientBMI.getPatientNo());
//        System.out.println(patientBMIRepository.read(oldPatientBMI.getPatientNo()).getPatientNo() + "\n"+
//                oldPatientBMI.getPatientNo());
//    }
//
//    @Test
//    public void e_delete() {
//        this.patientBMIRepository.delete(patientBMIRepository.read(patientBMIFactory.getPatientNo()).getPatientNo());
//        assertEquals(0, patientBMIRepository.getAll().size());
//    }
//}