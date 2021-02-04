//package mjeks.athenkosi.repository.employee.impl;
//
//import mjeks.athenkosi.entity.employee.Staff;
//import mjeks.athenkosi.repository.employee.StaffRepository;
//import mjeks.athenkosi.util.GenericHelper;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//import java.util.Date;
//import java.util.Set;
//
//import static org.junit.Assert.*;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class StaffRepositoryImplTest {
//
//    private static Set<Staff> staffDB = null;
//    static Date date = new Date();
//    private static Staff staffBuilder = new Staff.StaffBuilder().setStaffId(GenericHelper.generateId()).setAccessLevel("3")
//            .setAddedBy("Sbu").setDeptId("525").setFirstName("Athi").setJoiningDate(date).setLastName("Mjekula")
//            .setQualification("Diploma").build();
//    private static StaffRepository staffRepository = StaffRepositoryImpl.getStaffRepository();
//
//    @Test
//    public void d_getAll() {
//        assertEquals(1, this.staffRepository.getAll().size());
//    }
//
//    @Test
//    public void a_create() {
//        this.staffRepository.create(staffBuilder);
//        assertEquals("Athi", staffBuilder.getFirstName());
//    }
//
//    @Test
//    public void b_read() {
//        this.staffRepository.read(staffBuilder.getStaffId());
//        assertEquals(staffBuilder.getStaffId(), staffRepository.read(staffBuilder.getStaffId()).getStaffId());
//    }
//
//    @Test
//    public void c_update() {
//        Staff newStaff = new Staff.StaffBuilder().copy(staffBuilder).setFirstName("Lino").build();
//        this.staffRepository.update(newStaff);
//        assertEquals(this.staffRepository.read(this.staffBuilder.getStaffId()).getFirstName(), "Lino" );
//    }
//
//    @Test
//    public void e_delete() {
//        this.staffRepository.delete(this.staffBuilder.getStaffId());
//        assertEquals(0, this.staffRepository.getAll().size());
//    }
//}