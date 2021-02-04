package mjeks.athenkosi.entity.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Doctor implements Serializable {

    @Id
    private String doctorNo;
    private String staffNo;

    protected Doctor() {
    }

    private Doctor(DoctorBuilder doctorBuilder) {
        this.doctorNo = doctorBuilder.doctorNo;
        this.staffNo = doctorBuilder.staffNo;
    }

    public String getDoctorNo() {
        return doctorNo;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public static class DoctorBuilder{
        private String doctorNo, staffNo;

        public DoctorBuilder setDoctorNo(String doctorNo) {
            this.doctorNo = doctorNo;
            return this;
        }

        public DoctorBuilder setStaffNo(String staffNo) {
            this.staffNo = staffNo;
            return this;
        }

        public DoctorBuilder copy(Doctor doctor){
            this.doctorNo = doctor.doctorNo;
            this.staffNo = doctor.staffNo;
            return this;
        }

        public Doctor build(){
            return new Doctor(this);
        }
    }

}
