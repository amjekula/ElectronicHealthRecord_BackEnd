package mjeks.athenkosi.entity.patient;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class PatientQueue implements Serializable {

    @Id
    private String patientNo;
    private String doctorNo, deptNo, date, staffId;

    protected PatientQueue() {
    }

    private PatientQueue(PatientQueueBuilder patientQueueBuilder) {
        this.patientNo = patientQueueBuilder.patientNo;
        this.doctorNo = patientQueueBuilder.doctorNo;
        this.deptNo = patientQueueBuilder.deptNo;
        this.date = patientQueueBuilder.date;
        this.staffId = patientQueueBuilder.staffId;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public String getDoctorNo() {
        return doctorNo;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public String getDate() {
        return date;
    }

    public String getStaffId() {
        return staffId;
    }

    public static class PatientQueueBuilder{
        private String patientNo, doctorNo, deptNo, date, staffId;

        public PatientQueueBuilder setPatientNo(String patientNo) {
            this.patientNo = patientNo;
            return this;
        }

        public PatientQueueBuilder setDoctorNo(String doctorNo) {
            this.doctorNo = doctorNo;
            return this;
        }

        public PatientQueueBuilder setDeptNo(String deptNo) {
            this.deptNo = deptNo;
            return this;
        }

        public PatientQueueBuilder setDate(String date) {
            this.date = date;
            return this;
        }

        public PatientQueueBuilder setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public PatientQueueBuilder copy(PatientQueue patientQueue){
            this.patientNo = patientQueue.patientNo;
            this.doctorNo = patientQueue.doctorNo;
            this.deptNo = patientQueue.deptNo;
            this.date = patientQueue.date;
            this.staffId = patientQueue.staffId;
            return this;
        }

        public PatientQueue build(){
            return new PatientQueue(this);
        }
    }
}
