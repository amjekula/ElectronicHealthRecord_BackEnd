package mjeks.athenkosi.factory.patient;

import mjeks.athenkosi.entity.patient.Appointment;
import mjeks.athenkosi.util.GenericHelper;

public class AppointmentFactory {

    public static Appointment createAppointment(String patientNo, String doctorNo, String appDueDate,
                                                String addedOn, String addedBy){

        Appointment appointment = new Appointment.AppointmentBuilder()
                .setAppId(GenericHelper.generateId())
                .setPatientNo(patientNo)
                .setDoctorNo(doctorNo)
                .setAppDueDate(appDueDate)
                .setAddedOn(addedOn)
                .setAddedBy(addedBy)
                .build();

        return appointment;
    }
}
