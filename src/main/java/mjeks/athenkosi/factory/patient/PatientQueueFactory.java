package mjeks.athenkosi.factory.patient;

import mjeks.athenkosi.entity.patient.PatientQueue;

public class PatientQueueFactory {
    public static PatientQueue createPatientQueue(String patientNo, String doctorNo, String deptNo
                                                    , String date, String staffId){

        PatientQueue patientQueue = new PatientQueue.PatientQueueBuilder()
                .setPatientNo(patientNo)
                .setDoctorNo(doctorNo)
                .setDeptNo(deptNo)
                .setDate(date)
                .setStaffId(staffId)
                .build();

        return patientQueue;
    }
}
