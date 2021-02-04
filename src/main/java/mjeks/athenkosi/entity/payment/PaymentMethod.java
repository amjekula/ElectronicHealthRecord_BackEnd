package mjeks.athenkosi.entity.payment;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class PaymentMethod implements Serializable {

    @Id
    private String paymentMethodId;
    private String paymentMethodName, addedBy, addedOn;

    protected PaymentMethod() {
    }

    private PaymentMethod(PaymentMethodBuilder paymentMethodBuilder) {
        this.paymentMethodId = paymentMethodBuilder.paymentMethodId;
        this.paymentMethodName = paymentMethodBuilder.paymentMethodName;
        this.addedBy = paymentMethodBuilder.addedBy;
        this.addedOn = paymentMethodBuilder.addedOn;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public String getAddedOn() {
        return addedOn;
    }

    public static class PaymentMethodBuilder{
        private String paymentMethodId, paymentMethodName, addedBy, addedOn;

        public PaymentMethodBuilder setPaymentMethodId(String paymentMethodId) {
            this.paymentMethodId = paymentMethodId;
            return this;
        }

        public PaymentMethodBuilder setPaymentMethodName(String paymentMethodName) {
            this.paymentMethodName = paymentMethodName;
            return this;
        }

        public PaymentMethodBuilder setAddedBy(String addedBy) {
            this.addedBy = addedBy;
            return this;
        }

        public PaymentMethodBuilder setAddedOn(String addedOn) {
            this.addedOn = addedOn;
            return this;
        }

        public PaymentMethodBuilder copy(PaymentMethod paymentMethod){
            this.paymentMethodId = paymentMethod.paymentMethodId;
            this.paymentMethodName = paymentMethod.paymentMethodName;
            this.addedBy = paymentMethod.addedBy;
            this.addedOn = paymentMethod.addedOn;
            return this;
        }

        public PaymentMethod build(){
            return new PaymentMethod(this);
        }
    }
}
