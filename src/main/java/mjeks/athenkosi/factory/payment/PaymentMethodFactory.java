package mjeks.athenkosi.factory.payment;

import mjeks.athenkosi.entity.payment.PaymentMethod;
import mjeks.athenkosi.util.GenericHelper;

public class PaymentMethodFactory {

    public static PaymentMethod createPaymentMethod(String paymentMethodName, String addedBy, String addedOn){

        PaymentMethod paymentMethod = new PaymentMethod.PaymentMethodBuilder()
                .setPaymentMethodId(GenericHelper.generateId())
                .setPaymentMethodName(paymentMethodName)
                .setAddedBy(addedBy)
                .setAddedOn(addedOn)
                .build();

        return paymentMethod;
    }
}
