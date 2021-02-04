package mjeks.athenkosi.factory.payment;

import mjeks.athenkosi.entity.payment.BillCharges;
import mjeks.athenkosi.util.GenericHelper;

public class BillChargesFactory {

    public static BillCharges createBillCharges(String serviceName, String serviceCost,
                                                String addedBy, String addedOn){

        BillCharges billCharges = new BillCharges.BillChargesBuilder()
                .setServiceId(GenericHelper.generateId())
                .setServiceName(serviceName)
                .setServiceCost(serviceCost)
                .setAddedBy(addedBy)
                .setAddedOn(addedOn)
                .build();

        return billCharges;
    }
}
