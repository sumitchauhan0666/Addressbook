package com.bridgelabz.Addressbook;

import java.util.Scanner;
public class Person {

    static Scanner sc = new Scanner(System.in);
    static String firstName,lastName,address,state,email;
    static int zip;
    static long phoneNumber;
    static int counterForAdd=3;
    static int counter;
    static Contact [] personDetails = new Contact[10];


    public static void main(String args[]) {

        Contact person1 = new Contact("Raj","Kumar","Nagar","MH",35,8620,"raj@gmail.com");
        Contact person2 = new Contact("Shashi","Rao","Chowk","TD",98,9736,"shashi@yahoo.com");
        Contact person3 = new Contact("Apurva","Mehta","Mahal","AP",47,7620,"amar@edu.com");
        personDetails[0]=person1;
        personDetails[1]=person2;
        personDetails[2]=person3;
        System.out.println("Created contact list is");
        counter= personDetails.length;
        for(int i = 0; i < counter;i++) {
            if(personDetails[i] != null) {
                System.out.println(personDetails[i]);
            }
            else {
                break;
            }
        }
        System.out.println();
        operations();
    }
    public static void operations() {
        boolean label = true;
        while(label) {
            System.out.println("Enter your choice");
            System.out.println("1)Add contact");
            System.out.println("2)Edit contact");
            System.out.println("3)Delete contact");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    int numOfPerson=1;
                    System.out.println("Enter how many contacts do you want to add");
                    int numOfContacts = sc.nextInt();
                    while(numOfContacts > 0) {
                        System.out.println("Add Person"+numOfPerson);
                        contactInfo();
                        //Contact person4 = new Contact(firstName,lastName,address,state,zip,phoneNumber,email);
                        personDetails[counterForAdd++]=new Contact(firstName,lastName,address,state,zip,phoneNumber,email);
                        numOfContacts--;
                        numOfPerson++;
                    }
                    System.out.println("Newly updated contact list is");
                    for(int i = 0; i < counterForAdd;i++) {
                        System.out.println(personDetails[i]);
                    }
                    break;
                case 2:
                    int i;
                    System.out.println("Enter name of person whose details you want to edit");
                    String keyName = sc.next();
                    for( i = 0; i < counterForAdd; i++) {
                        if(keyName.equals(personDetails[i].firstName)) {
                            contactInfo();
                            Contact person5 = new Contact(firstName,lastName,address,state,zip,phoneNumber,email);
                            personDetails[i]= person5;
                        }
                    }
                    System.out.println("Newly edited contact list is");
                    for(i = 0; i < counterForAdd;i++) {
                        System.out.println(personDetails[i]);
                    }
                    break;
                case 3:
                    System.out.println("Enter name of person whose details you want to delete");
                    String keyToDelete = sc.next();
                    for( i = 0; i < counterForAdd; i++) {
                        if(keyToDelete.equals(personDetails[i].firstName)) {
                            for(int k = i; k < counterForAdd - i; k++) {
                                personDetails[k]=personDetails[k+1];
                            }
                            counterForAdd--;
                        }
                    }
                    System.out.println("Newly edited contact list is");
                    for(i = 0; i < counterForAdd;i++) {
                        System.out.println(personDetails[i]);
                    }
                    break;
                default:
                    System.err.println("Enter valid choice");
            }
            System.out.println("Do you to enter your choice again");
            System.out.println("Enter '1' if you want or '2' if you dont want");
            int responceToContinue = sc.nextInt();
            if(responceToContinue == 1) {
                label = true;
            }
            else {
                label = false;
            }
        }
    }
    public static void contactInfo() {
        System.out.println("Enter details of person");
        System.out.println("Add first name");
        firstName = sc.next();
        System.out.println("Add last name");
        lastName= sc.next();
        System.out.println("Add address");
        address = sc.next();
        System.out.println("Add state");
        state= sc.next();
        System.out.println("Add zip");
        zip = sc.nextInt();
        System.out.println("Add phone number");
        phoneNumber = sc.nextLong();
        System.out.println("Add email");
        email = sc.next();
    }
}