package mjeks.athenkosi.entity.employee;

import mjeks.athenkosi.util.GenericHelper;
import org.junit.Test;

//import java.sql.Date;
import java.util.Date;


import static org.junit.Assert.*;

public class StaffTest {

    Date date = new Date();
    Staff staff = new Staff.StaffBuilder().setStaffId(GenericHelper.generateId()).setFirstName("Athenkosi")
            .setAccessLevel("3").setJoiningDate(date).setAddedBy("2544").build();

    @Test
    public void testGetFirstName() {
        assertEquals("Athenkosi", staff.getFirstName());
        System.out.println(staff.getFirstName());
    }

    @Test
    public void testJoiningDate(){
        assertEquals(date, staff.getJoiningDate());
        System.out.println(staff.getJoiningDate());
    }
}