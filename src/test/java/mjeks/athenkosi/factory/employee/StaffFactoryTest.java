package mjeks.athenkosi.factory.employee;

import mjeks.athenkosi.entity.employee.Staff;
import mjeks.athenkosi.util.GenericHelper;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class StaffFactoryTest {

    Date date = new Date();
    private Staff staff = new Staff.StaffBuilder().setStaffId(GenericHelper.generateId()).setAccessLevel("3")
            .setAddedBy("Sbu").setDeptId("525").setFirstName("Athi").setJoiningDate(date).setLastName("Mjekula")
            .setQualification("Diploma").build();

    @Test
    public void createStaff() {
        assertEquals(staff.getJoiningDate(), staff.getJoiningDate());
        System.out.println(staff.getJoiningDate());
    }
}