package mjeks.athenkosi.entity.patient;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Patient implements Serializable {

    @Id
    private String patientNo;
    private String name, lastName, idNumber, phoneNumber;

    protected Patient() {
    }

    private Patient(PatientBuilder patientBuilder) {
        this.patientNo = patientBuilder.patientNo;
        this.name = patientBuilder.name;
        this.lastName = patientBuilder.lastName;
        this.idNumber = patientBuilder.idNumber;
        this.phoneNumber = patientBuilder.phoneNumber;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static class PatientBuilder{
        private String patientNo, name, lastName, idNumber, phoneNumber;

        public PatientBuilder setPatientNo(String patientNo) {
            this.patientNo = patientNo;
            return this;
        }

        public PatientBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PatientBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PatientBuilder setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public PatientBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public PatientBuilder copy(Patient patient){
            this.patientNo = patient.patientNo;
            this.name = patient.name;
            this.lastName = patient.lastName;
            this.idNumber = patient.idNumber;
            this.phoneNumber = patient.phoneNumber;
            return this;
        }

        public Patient build(){
            return new Patient(this);
        }
    }
}
