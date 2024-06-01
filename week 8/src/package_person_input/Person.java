package package_person_input;

public class Person {
    // this has no main method

    String name;
    char gender;
    int age;
    String zipCode;
    int cityCode;

    // now our individual violations and the main violations

    boolean violations;
    boolean violationDUI;
    boolean violationRedLight;
    boolean violationSpeeding;


    double creditScore;
    double baselineRate;

    // the display method is so that we can print

    public void display() {

        System.out.println("This is the information that you have provided:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("Your baseline rate is: " + baselineRate + " dollars");
        System.out.println("Your baseline rate may change based on: age, credit score, violations, and residence");
        System.out.println("Violations: " + violations);
        System.out.println("Violation DUI: " + violationDUI);
        System.out.println("Violation Red Light: " + violationRedLight);
        System.out.println("Violation Speeding: " + violationSpeeding);
        System.out.println("Credit Score: " + creditScore);
    }
    // create a method for violations + credit score

        public double getRate(double monthlyRate) {
            if (violations == true || creditScore <= 700) {
                monthlyRate = 300.00;
            } else {
                monthlyRate = 0;
            }
            return monthlyRate;

    }

    // in method for age, older people will pay more

    public double ageCategory(double adjustedRate) {
        if (age <= 25 || age >= 65) {
            adjustedRate = 300.00;
        } else {
            adjustedRate = 0;
        }
        return adjustedRate;
    }

    // method for state + zip code and changing your string to an integer
    // in California zip codes are 90-96, Oregon 97, Washington 98, 99

    public int identifyRegion(int states) {
        String zip2;
        zip2 = zipCode.substring(0, 2);
        cityCode = Integer.parseInt(zip2);

        if (cityCode >= 90 && cityCode < 97) {
            System.out.println("You entered " + zipCode + " and you are from California");
        } else if (cityCode >= 97 && cityCode < 98) {
            System.out.println("You entered " + zipCode + " and you are from Oregon");
        } else if (cityCode >= 98 && cityCode < 99) {
            System.out.println("You entered " + zipCode + " and you are from Washington");
        } else {
            System.out.println("You are not from the PNW. Please contact our national office.");
        }
        return states;
    }

    // method to create a surcharge for California due to number of cars, pollution, etc

    public double californiaRegion(double surcharge){
        if (cityCode >= 90 && cityCode < 97){
            surcharge = 200.00;
        } else{
            surcharge = 0;
        }
        return surcharge;
    }

}

