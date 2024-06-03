package package_person_homework;

public class personHomework {

    String name;
    char gender;
    int age;
    int car;
    boolean violations;
    double creditScore;


    public void display() {

        System.out.println("Customer name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Violations: " + violations);
        System.out.println("Credit Score: " + creditScore);
        System.out.println("Car Year: " + car);
    }

    public double getRate(double monthlyRate) {
        if (violations == true && creditScore <= 700) {
            monthlyRate = 500.00;
        } else {
            monthlyRate = 100.00;

        }
        return monthlyRate;

    }

    public double assumeGender(double adjustedRate) {
        if (gender == 'M' && age <= 25) {
            adjustedRate = 125;
        } else {
            adjustedRate = 0;


        }
        return adjustedRate;
    }

    public double adjustRateForCar(double rate) {
        double adjustedRate = rate;
        int currentYear = 2024;
        int carAge = currentYear - car;
        if (carAge <= 5) {
            adjustedRate += 125;
        } else if (carAge > 10) {
            adjustedRate -= 125; // if the car is older than 10 years, the insurance rate is decreased by $100
        }
        return adjustedRate;
    }
}