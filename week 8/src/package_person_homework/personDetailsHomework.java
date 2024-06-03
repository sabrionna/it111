package package_person_homework;

public class personDetailsHomework {

    // INCLUDING MAIN METHOD!!!

    public static void main (String []args){



        personHomework firstPerson;
        personHomework secondPerson;
        firstPerson = new personHomework();
        secondPerson = new personHomework();

        // the peoples details are from my person regular file

        firstPerson.name = "Cathy";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car = 2024;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall";
        secondPerson.gender = 'M';
        secondPerson.age = 22;
        secondPerson.car = 2017;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        firstPerson.display();
        double monthlyRateFirstPerson = firstPerson.getRate(0);
        double genderAdjustmentFirstPerson = firstPerson.assumeGender(0);
        double finalRateFirstPerson = firstPerson.adjustRateForCar(monthlyRateFirstPerson + genderAdjustmentFirstPerson);
        double carAdjustmentFirstPerson = firstPerson.adjustRateForCar(0);
        System.out.println("The preliminary insurance rate for " + firstPerson.name + ": $" + monthlyRateFirstPerson);
        System.out.println("Adjustments for age/ gender: $" + genderAdjustmentFirstPerson);
        System.out.println("Adjustments based on age of car: " + carAdjustmentFirstPerson);
        System.out.println("For " + firstPerson.name + " the total monthly premium is: $" + finalRateFirstPerson);
        System.out.println();

        secondPerson.display();
        double monthlyRateSecondPerson = secondPerson.getRate(0);
        double genderAdjustmentSecondPerson = secondPerson.assumeGender(0);
        double finalRateSecondPerson = secondPerson.adjustRateForCar(monthlyRateSecondPerson + genderAdjustmentSecondPerson);
        double carAdjustmentSecondPerson = secondPerson.adjustRateForCar(0);
        System.out.println("The preliminary insurance rate for " + secondPerson.name + ": $" + monthlyRateSecondPerson);
        System.out.println("Adjustments for age/ gender: $" + genderAdjustmentSecondPerson);
        System.out.println("Adjustments based on age of car: " + carAdjustmentSecondPerson);
        System.out.println("For " + secondPerson.name + " the total monthly premium is: $" + finalRateSecondPerson);
        System.out.println();






    }

}
