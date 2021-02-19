package mjeks.athenkosi.entity.employee;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Doctor implements Serializable {

    @Id
    private String doctorNo;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Staff staff;

    protected Doctor() {
    }

    private Doctor(DoctorBuilder doctorBuilder) {
        this.doctorNo = doctorBuilder.doctorNo;
        this.staff = doctorBuilder.staff;
    }

    public String getDoctorNo() {
        return doctorNo;
    }

    public Staff getStaff() {
        return staff;
    }

    public static class DoctorBuilder{
        private String doctorNo;
        private Staff staff;

        public DoctorBuilder setDoctorNo(String doctorNo) {
            this.doctorNo = doctorNo;
            return this;
        }

        public DoctorBuilder setStaff(Staff staff) {
            this.staff = staff;
            return this;
        }

        public DoctorBuilder copy(Doctor doctor){
            this.doctorNo = doctor.doctorNo;
            this.staff = doctor.staff;
            return this;
        }

        public Doctor build(){
            return new Doctor(this);
        }
    }

}
