package mjeks.athenkosi.entity.internal_generics;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Treatment implements Serializable {

    @Id
    private String treatmentId;
    private String testId, treatmentDisease, treatmentNotes, drugId, patientNo, treatmentDate;

    protected Treatment() {
    }

    private Treatment(TreatmentBuilder treatmentBuilder) {
        this.treatmentId = treatmentBuilder.treatmentId;
        this.treatmentDisease = treatmentBuilder.treatmentDisease;
        this.treatmentNotes = treatmentBuilder.treatmentNotes;
        this.testId = treatmentBuilder.testId;
        this.drugId = treatmentBuilder.drugId;
        this.patientNo = treatmentBuilder.patientNo;
        this.treatmentDate = treatmentBuilder.treatmentDate;
    }

    public String getTreatmentId() {
        return treatmentId;
    }

    public String getTreatmentDisease() {
        return treatmentDisease;
    }

    public String getTreatmentNotes() {
        return treatmentNotes;
    }

    public String getTestId() {
        return testId;
    }

    public String getDrugId() {
        return drugId;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public String getTreatmentDate() {
        return treatmentDate;
    }

    public static class TreatmentBuilder{
        private String treatmentId, treatmentDisease, treatmentNotes, testId, drugId, patientNo, treatmentDate;

        public TreatmentBuilder setTreatmentId(String treatmentId) {
            this.treatmentId = treatmentId;
            return this;
        }

        public TreatmentBuilder setTreatmentDisease(String treatmentDisease) {
            this.treatmentDisease = treatmentDisease;
            return this;
        }

        public TreatmentBuilder setTreatmentNotes(String treatmentNotes) {
            this.treatmentNotes = treatmentNotes;
            return this;
        }

        public TreatmentBuilder setTestId(String testId) {
            this.testId = testId;
            return this;
        }

        public TreatmentBuilder setDrugId(String drugId) {
            this.drugId = drugId;
            return this;
        }

        public TreatmentBuilder setPatientNo(String patientNo) {
            this.patientNo = patientNo;
            return this;
        }

        public TreatmentBuilder setTreatmentDate(String treatmentDate) {
            this.treatmentDate = treatmentDate;
            return this;
        }

        public TreatmentBuilder copy(Treatment treatment){
            this.treatmentId = treatment.treatmentId;
            this.treatmentDisease = treatment.treatmentDisease;
            this.treatmentNotes = treatment.treatmentNotes;
            this.testId = treatment.testId;
            this.drugId = treatment.drugId;
            this.patientNo = treatment.patientNo;
            this.treatmentDate = treatment.treatmentDate;
            return this;
        }

        public Treatment build(){
            return new Treatment(this);
        }
    }
}
