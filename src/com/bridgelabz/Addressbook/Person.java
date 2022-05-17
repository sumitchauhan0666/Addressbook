package com.bridgelabz.Addressbook;

import java.util.Scanner;
public class Person {

    static Scanner sc = new Scanner(System.in);
    static String firstName,lastName,address,state,email;
    static int zip;
    static long phoneNumber;
    static Contact [] personDetails = new Contact[10];


    public static void main(String args[]) {

        Contact person1 = new Contact("Raj","Kumar","Nagar","MH",35,8620,"raj@gmail.com");
        Contact person2 = new Contact("Shashi","Rao","Chowk","TD",98,9736,"shashi@yahoo.com");
        Contact person3 = new Contact("Apurva","Mehta","Mahal","AP",47,7620,"amar@edu.com");
        personDetails[0]=person1;
        personDetails[1]=person2;
        personDetails[2]=person3;
        System.out.println("Created contact list is");
        for(int i = 0; i < 3;i++) {
            System.out.println(personDetails[i]);
        }
        operations();
    }
    public static void operations() {
        int j = 0;
        System.out.println("Enter your choice");
        System.out.println("1)Add contact");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
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
                Contact person4 = new Contact(firstName,lastName,address,state,zip,phoneNumber,email);
                personDetails[3]=person4;
                j++;
                for(int i = 0; i < 3 + j;i++) {
                    System.out.println(personDetails[i]);
                }
        }
    }
}