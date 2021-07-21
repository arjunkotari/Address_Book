package com.addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    /*
    adding contact details
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many contact you want to add...");
        int con = scanner.nextInt();
        Contacts contacts= new Contacts();
        AddressBook addressBook = new AddressBook();
        //adding multiple contacts at a time
        for (int i = 0; i < con; i++) {
            //creating array list
           ArrayList<Contacts> l1 = new ArrayList<Contacts>();
           //adding elements in arraylist
           l1.add(addressBook.contacts);
           addressBook.addDetails();
           System.out.println(l1);
            addressBook.editContact();
            //deleting contact
           System.out.println("Do want to delete contact (y/n)");
           char check = scanner.next().charAt(0);
           if(check == 'y'){
               l1.remove(addressBook.contacts);
           }
           System.out.println(l1);
        }
    }
}
