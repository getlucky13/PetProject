/**
    Program file name:          PetDemo.java
    Author:                     Ronald Rizzo
    Date:                       December 6th, 2022

    Assignment:                 Final Project

    Description:                This program demonstrates the Pet class as specified
                                by the Final Project assignment.
                                This program takes no user input, and outputs a number of 
                                strings to demonstrate the use of each method of the Pet
                                class.
*/
public class PetDemo 
{
    public static void main(String[] args)
    {
        /**
            Creates two Pet objects, one using the default no-arg constructor
            and the other by passing values to the Pet constructor.  
        */
        Pet dog = new Pet();
        Pet cat = new Pet("fluffy", "cat", 14);

        /**
            Prints the age of the Dog object by calling the getAge()
            method of the Dog object.
        */
        System.out.println("Dog Object");
        System.out.println("Age " + dog.getAge());

        /**
            Prints all three fields of the Cat object by calling
            each get method of the Cat object.
        */
        System.out.println("Cat Object");
        System.out.println("Animal " + cat.getAnimal());
        System.out.println("Name " + cat.getName());
        System.out.println("Age " + cat.getAge());

        /**
            Uses all three set methods of the Dog object to set values
            to each of the objects fields.
        */
        dog.setAnimal("dog");
        dog.setName("Fido");
        dog.setAge(2);

        /**
            Prints all three fields of the Dog object by calling
            each get method of the Dog object.
        */
        System.out.println("Dog Object");
        System.out.println("Animal " + dog.getAnimal());
        System.out.println("Name " + dog.getName());
        System.out.println("Age " + dog.getAge());

        /**
            Program Output:
            Dog Object
            Age 0      
            Cat Object 
            Animal cat 
            Name fluffy
            Age 14     
            Dog Object 
            Animal dog 
            Name Fido  
            Age 2  
        */
    }
}
