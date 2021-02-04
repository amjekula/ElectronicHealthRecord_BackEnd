package mjeks.athenkosi.factory.payment;

import mjeks.athenkosi.entity.payment.Billing;
import mjeks.athenkosi.util.GenericHelper;

public class BillingFactory {

    public static Billing createBilling(String serviceId, String drugId, String testId, String patientNo,
                                        String addedBy, String addedOn){

        Billing billing = new Billing.BillingBuilder()
                .setBillId(GenericHelper.generateId())
                .setServiceId(serviceId)
                .setDrugId(drugId)
                .setTestId(testId)
                .setPatientNo(patientNo)
                .setAddedBy(addedBy)
                .setAddedOn(addedOn)
                .build();

        return billing;
    }
}
