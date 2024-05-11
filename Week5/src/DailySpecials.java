import java.util.Scanner;

public class DailySpecials {

    public static void main(String[] args) {
        String specials;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day of week excluding weekends (Monday - Friday only!)");
        specials = input.next();


        //In the world of coffee, I need a name of a coffee beverage and a price
        String coffee;
        double price;
        double order;
        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");
        if (saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend");
            specials = input.next();
        }
        switch (specials) {
            //my cases wil be the day of the week
            case "monday":
                coffee = "latte";
                price = 4.95;
                System.out.println(specials+ "'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ " would you like to order?");
                order = input.nextInt();
                if (order == 0){
                    System.out.println("Looks like you don't like " +coffee+ "s! So sad!!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                }else {
                    System.out.print(order + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f dollars!", order*price);
                }
                break;
            case "tuesday":
                coffee = "Frappe";
                price = 5.95;
                System.out.println(specials+ "'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ " would you like to order?");
                order = input.nextInt();
                if (order == 0){
                    System.out.println("Looks like you don't like " +coffee+ "s! So sad!!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                }else {
                    System.out.print(order + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f dollars!", order*price);
                }
                break;
            case "wednesday":
                coffee = "cappuccino";
                price = 4.35;
                System.out.println(specials+ "'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ " would you like to order?");
                order = input.nextInt();
                if (order == 0){
                    System.out.println("Looks like you don't like " +coffee+ "s! So sad!!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                }else {
                    System.out.print(order + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f dollars!", order*price);
                }
                break;
            case "thursday":
                coffee = "regular joe";
                price = 2.95;
                System.out.println(specials+ "'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ " would you like to order?");
                order = input.nextInt();
                if (order == 0){
                    System.out.println("Looks like you don't like " +coffee+ "s! So sad!!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                }else {
                    System.out.print(order + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f dollars!", order*price);
                }
                break;
            case "friday":
                coffee = "matcha latte";
                price = 6.95;
                System.out.println(specials+ "'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ " would you like to order?");
                order = input.nextInt();
                if (order == 0){
                    System.out.println("Looks like you don't like " +coffee+ "s! So sad!!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                }else {
                    System.out.print(order + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f dollars!", order*price);
                }
                break;

            default:
                System.out.println("Please enter a valid day or check your spelling");
        }
    }
}
