import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// For utilities
public class Utilities {
    private static final Scanner scan = new Scanner(System.in);

    //Todo add more comments

    Recipes recipes = new Recipes();

        //Constructor
    public Utilities(){
        greeting();
        decision();
        exitMessage();
    }

    // greeting setter
    private void greeting() {
        System.out.println("Welcome to our recipe app!");
    }
    // ToDo make this better
    public void decision(){
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
                    cuisineSelection();
                    int subChoice1 = scan.nextInt();
                    switch (subChoice1) {
                        case 1:
                            displayBreakfastAmericanName();
                            int finalChoice1 = scan.nextInt();
                            switch (finalChoice1){
                                case 1:
                                    displayBreakfastAmericanRecipe();
                                    break outerLoop;
                            }
                        case 2:
                            displayBreakfastItalianName();
                            int finalChoice2 = scan.nextInt();
                            switch (finalChoice2){
                                case 1:
                                    displayBreakfastItalianRecipe();
                                    break outerLoop;
                        }
                        case 3:
                            System.out.println("Japanese selected.");
                            break outerLoop;
                        case 4:
                            System.out.println("Chinese selected.");
                            break outerLoop;
                        case 5:
                            continue outerLoop;
                        default:
                            System.out.println("Invalid Cuisine!");
                    }
                    break;
                case 2:
                    cuisineSelection();
                    int subChoice2 = scan.nextInt();
                    switch (subChoice2) {
                        case 1:
                            System.out.println("American selected");
                            break outerLoop;
                        case 2:
                            System.out.println("Italian selected");
                            break outerLoop;
                        case 3:
                            System.out.println("Japanese selected");
                            break outerLoop;
                        case 4:
                            System.out.println("Chinese selected");
                            break outerLoop;
                        case 5:
                            continue outerLoop;
                        default:
                            System.out.println("Invalid Cuisine!");
                    }
                    break;
                case 3:
                    cuisineSelection();
                    int subChoice3 = scan.nextInt();
                    switch (subChoice3) {
                        case 1:
                            System.out.println();
                            break outerLoop;
                        case 2:
                            System.out.println("Italian selected");
                            break outerLoop;
                        case 3:
                            System.out.println("Japanese selected");
                            break outerLoop;
                        case 4:
                            System.out.println("Chinese selected");
                            break outerLoop;
                        case 5:
                            continue outerLoop;
                        default:
                            System.out.println("Invalid Cuisine!");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid Meal!");
            }
        }
    }
    private void cuisineSelection(){
        System.out.println("""
                            Please select what cuisine you want!
                            \t1. American
                            \t2. Italian
                            \t3. Japanese
                            \t4. Chinese
                            \t5. Back
                            """);
    }
    private void displayBreakfastAmericanName(){
        recipes.setRecipeName("Something");
        recipes.setRecipeName("else");
        recipes.setRecipeName("another");
        System.out.println(recipes.getRecipeName());
    }
    private void displayBreakfastAmericanRecipe(){
        recipes.setAmerican("something",0);
        recipes.setAmerican("else",1);
        recipes.setAmerican("Another",2);
    }
    private void displayBreakfastItalianName(){
        recipes.setRecipeName("""
                \t1. stuff
                \t2. other""");
        System.out.println(recipes.getRecipeName());
    }
    private void displayBreakfastItalianRecipe(){

    }
    private void displayBreakfastJapaneseName(){

    }
    private void displayBreakfastJapaneseRecipe(){

    }
    private void displayBreakfastChineseName(){

    }
    private void displayBreakfastChineseRecipe(){

    }
    private void displayLunchAmericanName(){

    }
    private void displayLunchAmericanRecipe(){

    }
    private void displayLunchItalianName(){

    }
    private void displayLunchItalianRecipe(){

    }
    private void displayLunchJapaneseName(){

    }
    private void displayLunchJapaneseRecipe(){

    }
    private void displayLunchChineseName(){

    }
    private void displayLunchChineseRecipe(){

    }
    private void displayDinnerAmericanName(){

    }
    private void displayDinnerAmericanRecipe(){

    }
    private void displayDinnerItalianName(){

    }
    private void displayDinnerItalianRecipe(){

    }
    private void displayDinnerJapaneseName(){

    }
    private void displayDinnerJapaneseRecipe(){

    }
    private void displayDinnerChineseName(){

    }
    private void displayDinnerChineseRecipe(){

    }

    // toString for exiting message
    private void exitMessage(){
        System.out.println("Thanks for using the app!");
    }
}
