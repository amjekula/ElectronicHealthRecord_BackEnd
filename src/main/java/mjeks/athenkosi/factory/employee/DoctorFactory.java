package mjeks.athenkosi.factory.employee;

import mjeks.athenkosi.entity.employee.Doctor;
import mjeks.athenkosi.util.GenericHelper;

public class DoctorFactory {
    public static Doctor createDoctor(String staffNo){
        Doctor doctor = new Doctor.DoctorBuilder().setDoctorNo(GenericHelper.generateId()).setStaffNo(staffNo).build();
        return doctor;
    }
}
