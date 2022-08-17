import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Java Dealership");
        System.out.println(" . Select option 'a' to buy a car");
        System.out.println(" . Select option 'b' to sell a car");
        String option = scan.nextLine();
        switch (option){
            case "a":
                System.out.println("what is your budget?");
                int budget = scan.nextInt();
                if (budget >= 10000) {
                    System.out.println("Great! A Nissan Altima is available");
                    System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a licence? Write 'yes' or 'no'");
                    String licence = scan.nextLine();
                    System.out.println("\nwhat is your credit score");
                    int creditScore = scan.nextInt();
                    if (insurance.equals("yes") && licence.equals("yes") && creditScore > 660){
                        System.out.println("\nSold, pleasure doing business with you");
                    }else {
                        System.out.println("\nWe're sorry, You're not eligible");
                    }
                }else {
                    System.out.println("No cars available in this price!");
                }
                break;
            case "b":
                System.out.println("What is your car valued at?");
                int value = scan.nextInt();
                System.out.println("\nwhat is your selling price?");
                int price = scan.nextInt();

                if (value > price && price < 30000) {
                    System.out.println("\nWe will buy your car. Pleasure doing business with you!");
                }else {
                    System.out.println("\nSorry, we're noy interested!");
                }
                break;
            default: System.out.println("invalid option");
        }
        scan.close();
    }
}
