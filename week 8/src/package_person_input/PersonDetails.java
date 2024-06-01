package package_person_input;

import java.util.Scanner;

public class PersonDetails {

    public static void main(String[] args){


        // create an object from Person

        Person customer;
        customer = new Person();

        // add the additonal variables

        int states = 0;
        double surcharge = 0;

        // initializing the additional variables

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        customer.name = input.next();
        System.out.print("Please enter your age: ");
        customer.age = input.nextInt();
        System.out.print("Please enter your gender by entering F or M or N: ");


        customer.gender = input.next().charAt(0);
        System.out.print("Please enter your 5-digit zipcode: ");
        customer.zipCode = input.next();

        System.out.print("Any traffic violations? Please enter true for yes and false for no: ");
        customer.violations = input.nextBoolean();
        if (customer.violations == true){
            System.out.print("Please type true if you had a DUI, or false if not: ");
            customer.violationDUI = input.nextBoolean();
            System.out.print("Please type true if you had a red light violation, or false if not: ");
            customer.violationRedLight = input.nextBoolean();
            System.out.print("Please type true if you have received a speeding ticket, or false if not: ");
            customer.violationSpeeding = input.nextBoolean();

        } else {
            customer.violationDUI = false;
            customer.violationRedLight= false;
            customer.violationSpeeding = false;
        }

        System.out.print("Please enter your credit score: ");
        customer.creditScore = input.nextDouble();

        customer.display();

        customer.identifyRegion(states);
        System.out.println("Your regional surcharge is " +customer.californiaRegion(surcharge)+ " dollars");


    } // end main
}
