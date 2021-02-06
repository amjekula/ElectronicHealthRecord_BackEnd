package mjeks.athenkosi.factory.external_generics;

import mjeks.athenkosi.entity.external_generics.Address;
import mjeks.athenkosi.util.GenericHelper;

public class AddressFactory {

    public static Address createAddress(String country, String province, String town,
                                        String suburb, String postalCode, String streetAddress){

        Address address = new Address.AddressBuilder()
                .setId(GenericHelper.generateId())
                .setCountry(country)
                .setProvince(province)
                .setSuburb(suburb)
                .setTown(town)
                .setStreetAddress(streetAddress)
                .setPostalCode(postalCode)
                .build();

        return address;
    }
}
