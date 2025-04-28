import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Utilities {
    private static final Scanner scan = new Scanner(System.in);

    public static void getRecipes(){

    }

    //Constructor
    public Utilities(){
        greeting();
        getRecipes();
        Recipes recipes = new Recipes();
    }

    // Setter
    private void greeting() {
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
                    break Loop;
                default:
                    System.out.println("Invalid choice! Exiting...");

            }
        }

    }
    // Method for breakfast recipes
    public void breakfast(){
    }
    // Method for brunch recipes
    public void brunch(){

    }
    // Method for lunch recipes
    private void lunch(){
        System.out.println("What culture or cuisine?");
        String choice = scan.nextLine();
        Recipes recipes = new Recipes();

        if (choice.toLowerCase().startsWith("A")){
            System.out.println();
        }
    }
    // Method for dinner recipes
    private void dinner(){
    }

    // toString for greeting
    public String toString(){
        return "Thanks for using our app!";
    }
}
