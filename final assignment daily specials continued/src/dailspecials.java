import java.util.Scanner;

public class dailspecials {

    public static void main(String[] args) {

        String specials;


        Scanner input = new Scanner(System.in);

        String coffee = null;

        double price = 0;

        int quantity;

        boolean wrongDay = true;


        while (wrongDay) {
            System.out.println("Please enter a day of the week, ex: Monday - Friday");
            specials = input.next();


            switch (specials) {

                case "Monday" -> {
                    wrongDay = false;
                    coffee = "Latte";
                    price = 4.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                }
                case "Tuesday" -> {
                    wrongDay = false;
                    coffee = "Frappe";
                    price = 5.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                }
                case "Wednesday" -> {
                    wrongDay = false;
                    coffee = "Cappuccino";
                    price = 4.35;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                }
                case "Thursday" -> {
                    wrongDay = false;
                    coffee = "Regular Joe";
                    price = 2.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                }
                case "Friday" -> {
                    wrongDay = false;
                    coffee = "Matcha Latte";
                    price = 6.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

                }
            }
        }


        System.out.println("How many " +coffee+ "s would you like to order?");
        int number = input.nextInt();
        double money = number * price;



        if (number == 0) {
            System.out.println("Looks like you don't like " +coffee+ "s, sooo sad!! :(");

        } else if (number > 0 && number <5) {
            System.out.println(number + " " +coffee+ " coming up, your total is $" +money+ " :)");

        } else if (number >=5 && number <10) {

            double moneyWithDiscount = money * 0.9;

            System.out.println("You get a 10% discount, your regular price is $" +money+ " :0");
            System.out.print("You have ordered " + number + " drinks with 10% off, so your new total is $");
            System.out.printf("%.2f", moneyWithDiscount);
            System.out.println("!:D");

        } else if(number >= 10) {
            double moneyWithDiscount = money * 0.8;

            System.out.print("You get bigger group discount of 20%, your regular price is $");
            System.out.printf("%.2f", money);
            System.out.println("!:o");
            System.out.print("You have ordered " + number + " drinks with a 20% off, so your new total is $");
            System.out.printf("%.2f", moneyWithDiscount);
            System.out.println("!!! >.<");
        }

    }
}
