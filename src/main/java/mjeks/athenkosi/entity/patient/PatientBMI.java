package mjeks.athenkosi.entity.patient;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientBMI {

    @Id
    private String patientNo;
    private int weight, temperature, height;

    protected PatientBMI() {
    }

    private PatientBMI(PatientBMIBuilder patientBMIBuilder) {
        this.patientNo = patientBMIBuilder.patientNo;
        this.weight = patientBMIBuilder.weight;
        this.temperature = patientBMIBuilder.temperature;
        this.height = patientBMIBuilder.height;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public int getWeight() {
        return weight;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHeight() {
        return height;
    }

    public static class PatientBMIBuilder{
        private String patientNo;
        private int weight, temperature, height;

        public PatientBMIBuilder setPatientNo(String patientNo) {
            this.patientNo = patientNo;
            return this;
        }

        public PatientBMIBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PatientBMIBuilder setTemperature(int temperature) {
            this.temperature = temperature;
            return this;
        }

        public PatientBMIBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public PatientBMIBuilder copy(PatientBMI patientBMI){
            this.patientNo = patientBMI.patientNo;
            this.weight = patientBMI.weight;
            this.temperature = patientBMI.temperature;
            this.height = patientBMI.height;
            return this;
        }

        public PatientBMI build(){
            return new PatientBMI(this);
        }
    }
}
