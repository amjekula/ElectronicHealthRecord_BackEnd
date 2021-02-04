package mjeks.athenkosi.entity.patient;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Appointment implements Serializable {

    @Id
    private String appId;

    private String patientNo, doctorNo, appDueDate, addedOn, addedBy;

    protected Appointment() {
    }

    private Appointment(AppointmentBuilder appointmentBuilder) {
        this.appId = appointmentBuilder.appId;
        this.patientNo = appointmentBuilder.patientNo;
        this.doctorNo = appointmentBuilder.doctorNo;
        this.appDueDate = appointmentBuilder.appDueDate;
        this.addedOn = appointmentBuilder.addedOn;
        this.addedBy = appointmentBuilder.addedBy;
    }

    public String getAppId() {
        return appId;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public String getDoctorNo() {
        return doctorNo;
    }

    public String getAppDueDate() {
        return appDueDate;
    }

    public String getAddedOn() {
        return addedOn;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public static class AppointmentBuilder{
        private String appId, patientNo, doctorNo, appDueDate, addedOn, addedBy;

        public AppointmentBuilder setAppId(String appId) {
            this.appId = appId;
            return this;
        }

        public AppointmentBuilder setPatientNo(String patientNo) {
            this.patientNo = patientNo;
            return this;
        }

        public AppointmentBuilder setDoctorNo(String doctorNo) {
            this.doctorNo = doctorNo;
            return this;
        }

        public AppointmentBuilder setAppDueDate(String appDueDate) {
            this.appDueDate = appDueDate;
            return this;
        }

        public AppointmentBuilder setAddedOn(String addedOn) {
            this.addedOn = addedOn;
            return this;
        }

        public AppointmentBuilder setAddedBy(String addedBy) {
            this.addedBy = addedBy;
            return this;
        }

        public AppointmentBuilder copy(Appointment appointment){
            this.appId = appointment.appId;
            this.patientNo = appointment.patientNo;
            this.doctorNo = appointment.doctorNo;
            this.appDueDate = appointment.appDueDate;
            this.addedOn = appointment.addedOn;
            this.addedBy = appointment.addedBy;
            return this;
        }

        public Appointment build(){
            return new Appointment(this);
        }
    }
}
