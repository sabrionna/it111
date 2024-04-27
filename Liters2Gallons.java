public class Liters2Gallons {

    public static void main(String[] args) {

        double gallon = 1.0;
        double liter = 3.78541;
        double gallons = liter * gallon;
        int counter = 4;
        System.out.println(String.format("%.2f Liters = %.1f Gallon", liter, gallon));

        for(gallon = 1.0; gallon <= 100.0; ++gallon) {
            liter = gallon * gallons;
            System.out.println(String.format("%.2f Liters = %.1f Gallons", liter, gallon));
            if (counter == 5) {
                System.out.println();
                counter = 0;
            }

            ++counter;

        }
    }
}
