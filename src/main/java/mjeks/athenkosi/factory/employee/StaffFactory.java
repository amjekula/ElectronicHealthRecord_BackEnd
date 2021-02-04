package mjeks.athenkosi.factory.employee;

import mjeks.athenkosi.entity.employee.Staff;
import mjeks.athenkosi.util.GenericHelper;

import java.util.Date;

public class StaffFactory {

    public static Staff createStaff(String firstName, String lastName, String middleName,
                                    String qualification, String deptId, String accessLevel, String addedBy,
                                    Date joiningDate){

        String staffId = GenericHelper.generateId();

        Staff buildStaff = new Staff.StaffBuilder()
                .setStaffId(staffId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setMiddleName(middleName)
                .setQualification(qualification)
                .setDeptId(deptId)
                .setAccessLevel(accessLevel)
                .setAddedBy(addedBy)
                .setJoiningDate(joiningDate)
                .build();

        return buildStaff;
    }
}
