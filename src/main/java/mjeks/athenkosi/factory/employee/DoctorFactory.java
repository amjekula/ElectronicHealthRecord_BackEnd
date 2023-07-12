package mjeks.athenkosi.factory.employee;

import mjeks.athenkosi.entity.employee.Doctor;
import mjeks.athenkosi.entity.employee.Staff;
import mjeks.athenkosi.util.GenericHelper;

public class DoctorFactory {
    public static Doctor createDoctor(Staff staff){
        return new Doctor.DoctorBuilder()
                .setDoctorNo(GenericHelper.generateId())
                .setStaff(staff)
                .build();
    }
}
