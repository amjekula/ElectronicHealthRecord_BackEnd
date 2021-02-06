package mjeks.athenkosi.factory.internal_generics;

import mjeks.athenkosi.entity.internal_generics.PharmacyInventory;
import mjeks.athenkosi.util.GenericHelper;

public class PharmacyInventoryFactory {

    public static PharmacyInventory createPharmacyInventory(String drugName, String drugInventory, String drugExpDate,
                                                            String addedBy, String addedOn, Double drugCost){

        PharmacyInventory pharmacyInventory = new PharmacyInventory.PharmacyInventoryBuilder()
                .setDrugId(GenericHelper.generateId())
                .setDrugName(drugName)
                .setDrugInventory(drugInventory)
                .setDrugExpDate(drugExpDate)
                .setAddedBy(addedBy)
                .setAddedOn(addedOn)
                .setDrugCost(drugCost)
                .build();

        return pharmacyInventory;
    }
}
