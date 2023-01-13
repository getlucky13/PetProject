/**
    Class name:         Pet.java
    Author:             Ronald Rizzo
    Date:               December 5th, 2022

    Assignment:         Starting Out With Java pg 392 / Algorithm Workbench #1a
    
    Description:        The Pet class simulates a pet, with fields for
                        name, animal type, and age.
 */

public class Pet {
    private String name, animal;
    private int age;

    /**
        The default constructor sets age to 0.
     */
    public Pet() {
        name = "";
        animal = "";
        age = 0;
    }

    /**
        This constructor sets the Pet objects fields to the 
        values passed as an argument.
        @param petName The value to be stored in name.
        @param petAnimal The value to be stored in animal.
        @param petAge The value to be stored in age.
     */
    public Pet(String petName, String petAnimal, int petAge) {
        name = petName;
        animal = petAnimal;
        age = petAge;
    }

    /**
        The getName method returns the name of the pet.
        @return The value stored in name.
     */
    public String getName() {
        return name;
    }

    /**
        The setName method sets the name field to the value passed 
        as an argument.
        @param petName The value to be stored in the name field.
     */
    public void setName(String petName) {
        name = petName;
    }

    /**
        The getAnimal method returns the type of animal.
        @return The value stored in animal field.
     */
    public String getAnimal() {
        return animal;
    }

    /**
        The setAnimal method sets the animal field to the value 
        passed as an argument.
        @param petAnimal The value to be stored in the animal field.
     */
    public void setAnimal(String petAnimal) {
        animal = petAnimal;
    }

    /**
        The getAge method returns the age of the animal
        @return The value stored in the age field.
     */
    public int getAge() {
        return age;
    }

    /**
        The setAge method sets the age field to the value passed 
        as an argument. 
        @param petAge The value to be stored in the age field.
     */
    public void setAge(int petAge) {
        age = petAge;
    }
}
