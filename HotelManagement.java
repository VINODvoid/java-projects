public class HotelManagement {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String[] menu = { "Burger", "Pizza", "Pasta", "Soup", "Exit" };
        double[] prices = { 5.0, 8.0, 6.5, 4.0, 0.0 };
        double total = 0.0;
        
        while (true) {
            System.out.println("Select an item:");
            for (int i = 0; i < menu.length; i++) {    
                System.out.println((i+1) + ". " + menu[i] + (i < menu.length - 1 ? " - $" + prices[i] : ""));
            }
            System.out.println("Enter Corresponding Number for your food items");
            int choice = sc.nextInt();
            if (choice == menu.length ) {
                System.out.println("Total bill: $ " + total);
                break;
            } else if (choice > 0 && choice < menu.length) {
                System.out.println("Enter the quantity of the food");
                int quantity =sc.nextInt();
                total += prices[choice - 1]*quantity;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
