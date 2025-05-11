import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// For utilities
public class Utilities {
    private static final Scanner scan = new Scanner(System.in);

    Recipes recipes = new Recipes();



        //Constructor
    public Utilities(){
        greeting();
    }

    // greeting setter
    private void greeting() {
        outerLoop:
        while (true) {
            System.out.println("""
                    Please select what meal you want!
                    \t1. Breakfast
                    \t2. Lunch
                    \t3. Dinner
                    \t4. Exit
                    """);
            int mainChoice = scan.nextInt();
            scan.nextLine();

            switch (mainChoice) {
                case 1:
                    System.out.println("""
                            Please select what cuisine you want!
                            \t1. American
                            \t2. Italian
                            \t3. Japanese
                            \t4. Chinese
                            \t5. Back
                            """);
                    String subChoice1 = scan.nextLine();
                    switch (subChoice1) {
                        case "1":
                            System.out.println(recipes.getBreakfast());
                            break outerLoop;
                        case "2":
                            System.out.println("Italian selected.");
                            break outerLoop;
                        case "3":
                            System.out.println("Japanese selected.");
                            break outerLoop;
                        case "4":
                            System.out.println("Chinese selected.");
                            break outerLoop;
                        case "5":
                            continue outerLoop;
                        default:
                            System.out.println("Invalid Cuisine!");
                    }
                    break;
                case 2:
                    System.out.println("""
                            Please select what cuisine you want!
                            \t1. American
                            \t2. Italian
                            \t3. Japanese
                            \t4. Chinese
                            \t5. Back
                            """);
                    String subChoice2 = scan.nextLine();
                    switch (subChoice2) {
                        case "1":
                            System.out.println("American selected");
                            break outerLoop;
                        case "2":
                            System.out.println("Italian selected");
                            break outerLoop;
                        case "3":
                            System.out.println("Japanse selected");
                            break outerLoop;
                        case "4":
                            System.out.println("Chinese selected");
                            break outerLoop;
                        case "5":
                            continue outerLoop;
                        default:
                            System.out.println("Invalid Cuisine!");
                    }
                    break;
                case 3:
                    System.out.println("""
                            Please select what cuisine you want!
                            \t1. American
                            \t2. Italian
                            \t3. Japanese
                            \t4. Chinese
                            \t5. Back
                            """);
                    String subChoice3 = scan.nextLine();
                    switch (subChoice3) {
                        case "1":
                            System.out.println(recipes.getAmerican());
                            break outerLoop;
                        case "2":
                            System.out.println("Italian selected");
                            break outerLoop;
                        case "3":
                            System.out.println("Japanese selected");
                            break outerLoop;
                        case "4":
                            System.out.println("Chinese selected");
                            break outerLoop;
                        case "5":
                            continue outerLoop;
                        default:
                            System.out.println("Invalid Cuisine!");
                    }
                    break;
                case 4:
                    toString();
                    return;
                default:
                    System.out.println("Invalid Meal!");
            }
        }
    }

    // toString for exiting message
    public String toString(){
        return "Thanks for using our app!";
    }
}
