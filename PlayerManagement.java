import java.util.Scanner;

class Player {
    private String name;
    private int age;
    private double height;
    private String country;



    public Player(String name, int age, double height, String country) {
        if (age <= 0 || height <= 0) {
            throw new IllegalArgumentException("Age and height must be positive.");
    }
        this.name = name;
        this.age = age;
        this.height = height;
        this.country = country;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");
        System.out.println("Country: " + country);
    }
}
class Cricket extends Player {
    private int wickets;
    private int runs;

    public Cricket(String name, int age, double height, String country, int wickets, int runs) {
        super(name, age, height, country);
        if (wickets < 0 || runs < 0) throw new IllegalArgumentException("Wickets and runs must be non-negative.");
        this.wickets = wickets;
        this.runs = runs;
    }
    public void displayCricketStats() {
        super.displayInfo();
        System.out.println("Wickets: " + wickets);
        System.out.println("Runs: " + runs);
    }
}

class Football extends Player {
    private int goals;
    private String position;

    public Football(String name, int age, double height, String country, int goals, String position) {
        super(name, age, height, country);
        if (goals < 0) throw new IllegalArgumentException("Goals must be non-negative.");
        this.goals = goals;
        this.position = position;
    }
    public void displayFootballStats() {
        displayInfo();
        System.out.println("Goals: " + goals);
        System.out.println("Position: " + position);
    }
}
public class PlayerManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Cricket player details:");
            System.out.print("Name: ");
            String cName = sc.nextLine();
            System.out.print("Age: ");
            int cAge = sc.nextInt();
            System.out.print("Height (cm): ");
            double cHeight = sc.nextDouble();
            sc.nextLine(); 
            System.out.print("Country: ");
            String cCountry = sc.nextLine();
            System.out.print("Wickets: ");
            int wickets = sc.nextInt();
            System.out.print("Runs: ");
            int runs = sc.nextInt();
            sc.nextLine();
            System.out.println();
            
            Cricket cricketer = new Cricket(cName, cAge, cHeight, cCountry, wickets, runs);
            System.out.println("\nEnter Football player details:");
            System.out.print("Name: ");
            String fName = sc.nextLine();
            System.out.print("Age: ");
            int fAge = sc.nextInt();
            System.out.print("Height (cm): ");
            double fHeight = sc.nextDouble();
            sc.nextLine();
            System.out.print("Country: ");
            String fCountry = sc.nextLine();
            System.out.print("Goals: ");
            int goals = sc.nextInt();
            sc.nextLine();
            System.out.print("Position: ");
            String position = sc.nextLine();

            Football footballer = new Football(fName, fAge, fHeight, fCountry, goals, position);

            System.out.println("\n--- Cricket Player Stats ---");
            cricketer.displayCricketStats();
            System.out.println("\n--- Football Player Stats ---");
            footballer.displayFootballStats();


        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid data types.");
        }
        sc.close();
    }
}
