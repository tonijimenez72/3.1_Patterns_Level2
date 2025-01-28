package n1exercise2.factory;

import n1exercise2.address.Address;
import n1exercise2.phone.PhoneNumber;

public interface AbstractFactory {
    Address createAddress(String street, String city, String postalCode);
    PhoneNumber createPhoneNumber(String phoneNumber);
}