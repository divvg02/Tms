package com.hexaware.tms.entity;

public class Passengers {
	
	private int passengerID; 
    private String firstName;
    private String gender; 
    private int age; 
    private String email;
    private String phoneNumber; 
    
    
    public Passengers() {}
    
    public Passengers(String firstName, String gender, int age, String email, String phoneNumber) {
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

 
    public Passengers(int passengerID, String firstName, String gender, int age, String email, String phoneNumber) {
        this.passengerID = passengerID;
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

  
    public int getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "Passenger{" +
                "passengerID=" + passengerID +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}