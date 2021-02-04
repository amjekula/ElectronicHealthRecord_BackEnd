//package mjeks.athenkosi.repository.patient;
//
//import mjeks.athenkosi.entity.patient.NextOfKin;
//import mjeks.athenkosi.factory.patient.NextOfKinFactory;
//import mjeks.athenkosi.repository.patient.NextOfKinRepository;
//import mjeks.athenkosi.repository.patient.impl.NextOfKinRepositoryImpl;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//import java.util.Set;
//
//import static org.junit.Assert.*;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class NextOfKinRepositoryImplTest {
//
//    public static NextOfKinRepository nextOfKinRepository = NextOfKinRepositoryImpl.getNextOfKinRepository();
//    public static NextOfKin nextOfKinBuilder = NextOfKinFactory
//            .createNextOfKin("Sinethemba", "Sali", "0794353817", "31314");
//
//    @Test
//    public void d_getAll() {
//        Set<NextOfKin> all = this.nextOfKinRepository.getAll();
//        assertEquals(1, all.size());
//    }
//
//    @Test
//    public void a_create() {
//        this.nextOfKinRepository.create(nextOfKinBuilder);
//        assertEquals("Sinethemba", nextOfKinBuilder.getName());
//    }
//
//    @Test
//    public void b_read() {
//        this.nextOfKinRepository.read("31314");
//        assertEquals("Sali", nextOfKinBuilder.getLastName());
//    }
//
//    @Test
//    public void c_update() {
//        NextOfKin newNextOfKin = new NextOfKin.NextOfKinBuilder().copy(nextOfKinBuilder).setName("Lumka").build();
//        newNextOfKin = nextOfKinRepository.update(newNextOfKin);
//        assertEquals("Lumka", newNextOfKin.getName());
//    }
//
//    @Test
//    public void e_delete() {
//        nextOfKinRepository.delete(nextOfKinBuilder.getNextOfKinNo());
//        assertNotEquals(1, nextOfKinRepository.getAll().size());
//    }
//}