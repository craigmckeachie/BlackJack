package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;

public class Dog {
    private String name;
    private String breed;
    private LocalDate dateOfBirth;

    public Dog(){

    }

    public Dog(String name, String breed, LocalDate dateOfBirth) {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Snoop Doggy Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    //access modifier public or private | return type | method name | parenthesis to define the inputs into the method (parameters)
    public void bark(String saying){
        System.out.println(saying);
    }

    public static ArrayList<Dog> createALitter(){
        //call new creating a bunch of dogs
        //creating and arraylist and adding dogs to it
        return new ArrayList<>();
    }
}
