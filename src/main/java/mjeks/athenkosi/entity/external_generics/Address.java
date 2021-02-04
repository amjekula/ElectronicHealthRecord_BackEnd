package mjeks.athenkosi.entity.external_generics;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Address implements Serializable {

    @Id
    private String id;
    private String country, province, town, suburb, postalCode, streetAddress;

    protected Address() {
    }

    private Address(AddressBuilder builder) {
        this.id = builder.id;
        this.country = builder.country;
        this.province = builder.province;
        this.town = builder.town;
        this.suburb = builder.suburb;
        this.streetAddress = builder.streetAddress;
        this.postalCode = builder.postalCode;
    }

    public String getId() {
        return id;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

    public String getTown() {
        return town;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public static class AddressBuilder{
        private String id, country, province, town, suburb, postalCode, streetAddress;

        public AddressBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public AddressBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public AddressBuilder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public AddressBuilder setProvince(String province) {
            this.province = province;
            return this;
        }

        public AddressBuilder setTown(String town) {
            this.town = town;
            return this;
        }

        public AddressBuilder setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public AddressBuilder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public AddressBuilder copy(Address address){
            this.id = address.id;
            this.country = address.country;
            this.province = address.province;
            this.town = address.town;
            this.suburb = address.suburb;
            this.streetAddress = address.streetAddress;
            this.postalCode = address.postalCode;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }
}
