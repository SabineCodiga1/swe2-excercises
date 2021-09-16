package ch.juventus.object;

import java.util.Objects;

public class Address {
    String street;
    int number;
    int zip;
    String city;

    public Address(String street, int number, int zip, String city){
        this.street = street;
        this.number = number;
        this.zip = zip;
        this.city = city;
    }

    public String toString(){
        return String.format("Address: {Street: %s, Number: %d, ZipCode: %d, City: %s }", street, number, zip, city);
    }

}

