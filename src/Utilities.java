import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Utilities {
    private static final Scanner scan = new Scanner(System.in);

    Recipes recipes = new Recipes();

    public static void getRecipes(){
        Recipes recipes = new Recipes();
    }

    //Constructor
    public Utilities(){
        greeting();
        getRecipes();
    }

    // greeting setter
    private void greeting() {
        Loop:
        {
            System.out.println("""
                    Please select what meal you want!
                    \t1. Breakfast
                    \t2. Lunch
                    \t3. Dinner
                    \t4. Exit
                    """);

            int choice;
            choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    recipes.getBreakfast();
                    return;
                case 2:
                    recipes.getLunch();
                    return;
                case 3:
                    recipes.getDinner();
                    return;
                case 4:
                    break Loop;
                default:
                    System.out.println("Invalid choice! Exiting...");
            }
        }

    }

    // toString for exiting message
    public String toString(){
        return "Thanks for using our app!";
    }
}
