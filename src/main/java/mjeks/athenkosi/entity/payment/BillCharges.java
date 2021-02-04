package mjeks.athenkosi.entity.payment;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class BillCharges implements Serializable {

    @Id
    private String serviceId;
    private String serviceName, serviceCost, addedBy, addedOn;

    protected BillCharges() {
    }

    private BillCharges(BillChargesBuilder billChargesBuilder) {
        this.serviceId = billChargesBuilder.serviceId;
        this.serviceName = billChargesBuilder.serviceName;
        this.serviceCost = billChargesBuilder.serviceCost;
        this.addedBy = billChargesBuilder.addedBy;
        this.addedOn = billChargesBuilder.addedOn;
    }

    public String getServiceId() {
        return serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getServiceCost() {
        return serviceCost;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public String getAddedOn() {
        return addedOn;
    }

    public static class BillChargesBuilder{
        private String serviceId, serviceName, serviceCost, addedBy, addedOn;

        public BillChargesBuilder setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public BillChargesBuilder setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public BillChargesBuilder setServiceCost(String serviceCost) {
            this.serviceCost = serviceCost;
            return this;
        }

        public BillChargesBuilder setAddedBy(String addedBy) {
            this.addedBy = addedBy;
            return this;
        }

        public BillChargesBuilder setAddedOn(String addedOn) {
            this.addedOn = addedOn;
            return this;
        }

        public BillChargesBuilder copy(BillCharges billCharges){
            this.serviceId = billCharges.serviceId;
            this.serviceName = billCharges.serviceName;
            this.serviceCost = billCharges.serviceCost;
            this.addedBy = billCharges.addedBy;
            this.addedOn = billCharges.addedOn;
            return this;
        }

        public BillCharges build(){
            return new BillCharges(this);
        }
    }
}
