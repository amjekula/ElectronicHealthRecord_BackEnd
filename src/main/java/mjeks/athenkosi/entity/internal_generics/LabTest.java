package mjeks.athenkosi.entity.internal_generics;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class LabTest implements Serializable {

    @Id
    private String testId;
    private String patientNo, staffId, labTestDate;

    protected LabTest() {
    }

    private LabTest(LabTestBuilder labTestBuilder) {
        this.testId = labTestBuilder.testId;
        this.patientNo = labTestBuilder.patientNo;
        this.staffId = labTestBuilder.staffId;
        this.labTestDate = labTestBuilder.labTestDate;
    }

    public String getTestId() {
        return testId;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getLabTestDate() {
        return labTestDate;
    }

    public static class LabTestBuilder{
        private String testId, patientNo, staffId, labTestDate;

        public LabTestBuilder setTestId(String testId) {
            this.testId = testId;
            return this;
        }

        public LabTestBuilder setPatientNo(String patientNo) {
            this.patientNo = patientNo;
            return this;

        }

        public LabTestBuilder setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public LabTestBuilder setLabTestDate(String labTestDate) {
            this.labTestDate = labTestDate;
            return this;

        }

        public LabTestBuilder copy(LabTest labTest){
            this.testId = labTest.testId;
            this.patientNo = labTest.patientNo;
            this.staffId = labTest.staffId;
            this.labTestDate = labTest.labTestDate;
            return this;
        }

        public LabTest build(){
            return new LabTest(this);
        }
    }
}
