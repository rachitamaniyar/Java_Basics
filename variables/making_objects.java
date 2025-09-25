package Java_basics;

import java.util.Scanner;

public class making_objects {
    public static void main(String[] args) {
        //System.in as a parameter allows one to give input via console
        //Creating an object of type Scanner, which will read the input from the console.
        Scanner scanner = new Scanner(System.in); //Caution: The class should be imported by writing import java.util.Scanner!

        boolean bool;

        System.out.print("Please write your first name: "); 
        String firstname = scanner.next(); //.next() allows only one word to be stored here.
        System.out.print("Please write your Last name: ");
        String lastname = scanner.next(); 

        //Strings can be combined into 1 string
        String name = firstname + " " + lastname;

        //How long is the content of the string?
        //name.length() returns a number based on the number of characters in the string
        bool = name.length() > 10; //If name.length() is bigger than 10, then True otherwise False

        //Output
        System.out.println("THe length is bigger than 10: "+bool+" and the exact length is: "+name.length());
        
        //making everything case-insensitive
        System.out.println("Willkommen "+name.toUpperCase()); 
        System.out.println("Willkommen "+name.toLowerCase());
    }
}
