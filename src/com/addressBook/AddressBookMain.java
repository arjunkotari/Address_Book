package com.addressBook;

import java.util.ArrayList;

public class AddressBookMain {
    /*
    adding contact details
     */
    public static void main(String[] args) {
        //global variables
        String firstName = "Arjun";
        String lastName = "Sai";
        String city = "ABC";
        String state = "XYZ" ;
        String zip = "001";
        String phoneNumber = "007";
        String email = "arjun@gmail.com";
        //calling constructor through object creation.
        Contacts c1 = new Contacts(firstName, lastName, city, state, zip, phoneNumber, email);
        ArrayList<Contacts> list = new ArrayList<Contacts>();
        list.add(c1);
        System.out.println(c1);
        }
}
