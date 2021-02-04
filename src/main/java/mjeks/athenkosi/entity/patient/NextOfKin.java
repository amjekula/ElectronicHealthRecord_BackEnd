package mjeks.athenkosi.entity.patient;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class NextOfKin implements Serializable {
    @Id
    private String nextOfKinNo;
    private String name, lastName, phoneNumber,patientNo;

    protected NextOfKin() {
    }

    private NextOfKin(NextOfKinBuilder builder) {
        this.nextOfKinNo = builder.nextOfKinNo;
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.patientNo = builder.patientNo;
    }

    public String getNextOfKinNo() {
        return nextOfKinNo;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public static class NextOfKinBuilder{
        private String nextOfKinNo, name, lastName, phoneNumber,patientNo;

        public NextOfKinBuilder setNextOfKinNo(String nextOfKinNo) {
            this.nextOfKinNo = nextOfKinNo;
            return this;
        }

        public NextOfKinBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public NextOfKinBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public NextOfKinBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public NextOfKinBuilder setPatientNo(String patientNo) {
            this.patientNo = patientNo;
            return this;
        }

        public NextOfKinBuilder copy(NextOfKin nextOfKin){
            this.nextOfKinNo = nextOfKin.nextOfKinNo;
            this.name = nextOfKin.name;
            this.lastName = nextOfKin.lastName;
            this.phoneNumber = nextOfKin.phoneNumber;
            this.patientNo = nextOfKin.patientNo;
            return this;
        }

        public NextOfKin build(){
            return new NextOfKin(this);
        }
    }
}
