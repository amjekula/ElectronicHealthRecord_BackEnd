package mjeks.athenkosi.factory.internal_generics;

import mjeks.athenkosi.entity.internal_generics.LabInventory;
import mjeks.athenkosi.util.GenericHelper;

public class LabInventoryFactory {
    public static LabInventory createLabInventory(String testName, String testCost,
                                                  String addedBy, String addedOn){

        LabInventory labInventory = new LabInventory.LabInventoryBuilder()
                .setTestId(GenericHelper.generateId())
                .setTestName(testName)
                .setTestCost(testCost)
                .setAddedBy(addedBy)
                .setAddedOn(addedOn)
                .build();

        return labInventory;
    }
}
