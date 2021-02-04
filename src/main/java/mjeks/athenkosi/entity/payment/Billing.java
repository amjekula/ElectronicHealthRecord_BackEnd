package mjeks.athenkosi.entity.payment;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Billing implements Serializable {

    @Id
    private String billId;
    private String serviceId, drugId, testId, patientNo, addedBy, addedOn;

    protected Billing() {
    }

    private Billing(BillingBuilder billingBuilder) {
        this.billId = billingBuilder.billId;
        this.serviceId = billingBuilder.serviceId;
        this.drugId = billingBuilder.drugId;
        this.testId = billingBuilder.testId;
        this.patientNo = billingBuilder.patientNo;
        this.addedBy = billingBuilder.addedBy;
        this.addedOn = billingBuilder.addedOn;
    }

    public String getBillId() {
        return billId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public String getDrugId() {
        return drugId;
    }

    public String getTestId() {
        return testId;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public String getAddedOn() {
        return addedOn;
    }

    public static class BillingBuilder{
        private String billId, serviceId, drugId, testId, patientNo, addedBy, addedOn;


        public BillingBuilder setBillId(String billId) {
            this.billId = billId;
            return this;
        }

        public BillingBuilder setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public BillingBuilder setDrugId(String drugId) {
            this.drugId = drugId;
            return this;
        }

        public BillingBuilder setTestId(String testId) {
            this.testId = testId;
            return this;
        }

        public BillingBuilder setPatientNo(String patientNo) {
            this.patientNo = patientNo;
            return this;
        }

        public BillingBuilder setAddedBy(String addedBy) {
            this.addedBy = addedBy;
            return this;
        }

        public BillingBuilder setAddedOn(String addedOn) {
            this.addedOn = addedOn;
            return this;
        }

        public BillingBuilder copy(Billing billing){
            this.billId = billing.billId;
            this.serviceId = billing.serviceId;
            this.drugId = billing.drugId;
            this.testId = billing.testId;
            this.patientNo = billing.patientNo;
            this.addedBy = billing.addedBy;
            this.addedOn = billing.addedOn;
            return this;
        }

        public Billing build(){
            return new Billing(this);
        }
    }
}
