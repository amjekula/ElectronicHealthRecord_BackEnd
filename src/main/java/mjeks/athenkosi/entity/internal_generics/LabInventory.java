package mjeks.athenkosi.entity.internal_generics;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class LabInventory implements Serializable {

    @Id
    private String testId;
    private String testName, testCost, addedBy, addedOn;

    protected LabInventory() {
    }

    private LabInventory(LabInventoryBuilder labInventoryBuilder) {
        this.testId = labInventoryBuilder.testId;
        this.testName = labInventoryBuilder.testName;
        this.testCost = labInventoryBuilder.testCost;
        this.addedBy = labInventoryBuilder.addedBy;
        this.addedOn = labInventoryBuilder.addedOn;
    }

    public String getTestId() {
        return testId;
    }

    public String getTestName() {
        return testName;
    }

    public String getTestCost() {
        return testCost;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public String getAddedOn() {
        return addedOn;
    }

    public static class LabInventoryBuilder{
        private String testId, testName, testCost, addedBy, addedOn;

        public LabInventoryBuilder setTestId(String testId) {
            this.testId = testId;
            return this;
        }

        public LabInventoryBuilder setTestName(String testName) {
            this.testName = testName;
            return this;
        }

        public LabInventoryBuilder setTestCost(String testCost) {
            this.testCost = testCost;
            return this;
        }

        public LabInventoryBuilder setAddedBy(String addedBy) {
            this.addedBy = addedBy;
            return this;
        }

        public LabInventoryBuilder setAddedOn(String addedOn) {
            this.addedOn = addedOn;
            return this;
        }

        public LabInventoryBuilder copy(LabInventory labInventory){
            this.testId = labInventory.testId;
            this.testName = labInventory.testName;
            this.testCost = labInventory.testCost;
            this.addedBy = labInventory.addedBy;
            this.addedOn = labInventory.addedOn;
            return this;
        }

        public LabInventory build(){
            return new LabInventory(this);
        }
    }
}
