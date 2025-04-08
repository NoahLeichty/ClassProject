import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Loop:
        {
            System.out.println("""
                    Please select what meal you want!
                    \t1. Breakfast
                    \t2. Brunch
                    \t3. Lunch
                    \t4. Dinner
                    \t5. Exit
                    """);

            int choice;
            choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    breakfast();
                    return;
                case 2:
                    brunch();
                    return;
                case 3:
                    lunch();
                    return;
                case 4:
                    dinner();
                    return;
                case 5:
                    System.out.println("Thanks for using our app!");
                    break Loop;
                default:
                    System.out.println("Invalid choice! Exiting...");

            }
        }

    }
    // Method for breakfast recipes
    private static void breakfast(){
    }
    // Method for brunch recipes
    private static void brunch(){

    }
    // Method for lunch recipes
    private static void lunch(){
        System.out.println("What culture or cuisine?");
        scan.nextLine();
    }
    // Method for dinner recipes
    private static void dinner(){

    }
}