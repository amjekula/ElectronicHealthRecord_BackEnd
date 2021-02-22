package mjeks.athenkosi.factory.employee;

import mjeks.athenkosi.entity.employee.Staff;
import mjeks.athenkosi.entity.external_generics.Address;
import mjeks.athenkosi.entity.internal_generics.Department;
import mjeks.athenkosi.util.GenericHelper;

import java.util.Date;

public class StaffFactory {

    public static Staff createStaff(String firstName, String lastName, String idNumber, String password,
                                    String qualification, Address address, Department department, String accessLevel, String addedBy){

        String staffId = GenericHelper.generateId();
        Date date = new Date();

        Staff buildStaff = new Staff.StaffBuilder()
                .setStaffId(staffId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setIdNumber(idNumber)
                .setPassword(password)
                .setAddress(address)
                .setQualification(qualification)
                .setDepartment(department)
                .setAccessLevel(accessLevel)
                .setAddedBy(addedBy)
                .setJoiningDate(date)
                .build();

        return buildStaff;
    }
}
