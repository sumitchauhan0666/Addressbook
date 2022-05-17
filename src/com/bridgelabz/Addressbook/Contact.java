package com.bridgelabz.Addressbook;

public class Contact {
    String firstName,lastName,address,state,email;
    int zip;
    long phoneNumber;
    Contact(String firstName,String lastName,String address,String state,int zip,long phoneNumber,String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.state=state;
        this.zip=zip;
        this.phoneNumber=phoneNumber;
    }
    @Override
    public String toString() {

        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", state="
                + state + ", email=" + email + ", zip=" + zip + ", phoneNumber=" + phoneNumber + "]";
    }


}
