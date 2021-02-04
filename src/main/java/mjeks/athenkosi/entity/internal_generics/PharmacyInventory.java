package mjeks.athenkosi.entity.internal_generics;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class PharmacyInventory implements Serializable {

    @Id
    private String drugId;
    private String drugName, drugInventory, drugExpDate, addedBy, addedOn;
    private int drugCost;

    protected PharmacyInventory() {
    }

    private PharmacyInventory(PharmacyInventoryBuilder pharmacyInventoryBuilder) {
        this.drugId = pharmacyInventoryBuilder.drugId;
        this.drugName = pharmacyInventoryBuilder.drugName;
        this.drugInventory = pharmacyInventoryBuilder.drugInventory;
        this.drugExpDate = pharmacyInventoryBuilder.drugExpDate;
        this.addedBy = pharmacyInventoryBuilder.addedBy;
        this.addedOn = pharmacyInventoryBuilder.addedOn;
        this.drugCost = pharmacyInventoryBuilder.drugCost;
    }

    public String getDrugId() {
        return drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public String getDrugInventory() {
        return drugInventory;
    }

    public String getDrugExpDate() {
        return drugExpDate;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public String getAddedOn() {
        return addedOn;
    }

    public int getDrugCost() {
        return drugCost;
    }

    public static class PharmacyInventoryBuilder{
        private String drugId, drugName, drugInventory, drugExpDate, addedBy, addedOn;
        private int drugCost;

        public PharmacyInventoryBuilder setDrugId(String drugId) {
            this.drugId = drugId;
            return this;
        }

        public PharmacyInventoryBuilder setDrugName(String drugName) {
            this.drugName = drugName;
            return this;
        }

        public PharmacyInventoryBuilder setDrugInventory(String drugInventory) {
            this.drugInventory = drugInventory;
            return this;
        }

        public PharmacyInventoryBuilder setDrugExpDate(String drugExpDate) {
            this.drugExpDate = drugExpDate;
            return this;
        }

        public PharmacyInventoryBuilder setAddedBy(String addedBy) {
            this.addedBy = addedBy;
            return this;
        }

        public PharmacyInventoryBuilder setAddedOn(String addedOn) {
            this.addedOn = addedOn;
            return this;
        }

        public PharmacyInventoryBuilder setDrugCost(int drugCost) {
            this.drugCost = drugCost;
            return this;
        }

        public PharmacyInventoryBuilder copy(PharmacyInventory pharmacyInventory){
            this.drugId = pharmacyInventory.drugId;
            this.drugName = pharmacyInventory.drugName;
            this.drugInventory = pharmacyInventory.drugInventory;
            this.drugExpDate = pharmacyInventory.drugExpDate;
            this.addedBy = pharmacyInventory.addedBy;
            this.addedOn = pharmacyInventory.addedOn;
            this.drugCost = pharmacyInventory.drugCost;

            return this;
        }

        public PharmacyInventory build(){
            return new PharmacyInventory(this);
        }
    }
}
