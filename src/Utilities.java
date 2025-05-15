import javax.swing.plaf.synth.SynthUI;
import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// For utilities
public class Utilities {
    private static final Scanner scan = new Scanner(System.in);

    //Todo add more comments

    Recipes recipes = new Recipes();
    FileHandling fileHandling = new FileHandling();

    //Constructor
    public Utilities(){
        greeting();
        decision();
        exitMessage();
    }

    // greeting message
    private void greeting() {
        System.out.println("Welcome to our recipe app!");
    }
    // ToDo make this better
    /* This entire method is overcomplicated, annoying, and dumb
    There are probably a billion better ways to do this
    But it works and I don't have time to figure out and do anything else
    A map or hashmap would probably have been better
     */
    public void decision(){
        outerLoop:
        while (true) {
            System.out.println("""
                    Please select what meal you want:
                    1. Breakfast
                    2. Lunch
                    3. Dinner
                    4. Exit
                    """);
            int mainChoice = scan.nextInt();
            scan.nextLine();
            // Select which cuisine for breakfast
            switch (mainChoice) {
                case 1:
                    cuisineSelection();
                    int subChoice1 = scan.nextInt();
                    // Display Breakfast American names of recipes
                    switch (subChoice1) {
                        case 1:
                            recipeSelection();
                            recipes.displayBreakfastAmericanRecipeNames();
                            int finalChoice1 = scan.nextInt();
                            // Display individual breakfast american recipes
                            switch (finalChoice1){
                                case 1:
                                    recipes.displayBlueberryPancakesRecipe();
                                    break outerLoop;
                                case 2:
                                    recipes.displayBreakfastBurritoRecipe();
                                    break outerLoop;
                                case 3:
                                    recipes.displayClassicWafflesRecipe();
                                    break outerLoop;
                                case 4:
                                    recipes.displayFrenchToastRecipe();
                                    break outerLoop;
                                case 5:
                                    recipes.displayEggsBenedictRecipe();
                                    break outerLoop;
                                case 6:
                                    recipes.displayBiscuitsAndGravyRecipe();
                                    break outerLoop;
                                case 7:
                                    recipes.displayBreakfastCasseroleRecipe();
                                    break outerLoop;
                                case 8:
                                    recipes.displayOmeletRecipe();
                                    break outerLoop;
                                case 9:
                                    recipes.displayBagelsWithCreamCheeseRecipe();
                                    break outerLoop;
                                case 10:
                                    recipes.displayPumpkinMuffinsRecipe();
                                    break outerLoop;
                                default:
                                    System.out.println("Invalid Recipe");
                                    break outerLoop;
                            }
                            // Display breakfast italian recipe names
                        case 2:
                            recipeSelection();
                            recipes.displayBreakfastItalianRecipeNames();
                            int finalChoice2 = scan.nextInt();
                            // Display individual breakfast italian recipes
                            switch (finalChoice2){
                                case 1:
                                    recipes.displayItalianBreakfastBruschettaRecipe();
                                    break outerLoop;
                                case 2:
                                    recipes.displayItalianBreakfastFrittataRecipe();
                                    break outerLoop;
                                case 3:
                                    recipes.displayCornettoRecipe();
                                    break outerLoop;
                                case 4:
                                    recipes.displayBiscottiRecipe();
                                    break outerLoop;
                                case 5:
                                    recipes.displayRicotaaToastWithJamRecipe();
                                    break outerLoop;
                                case 6:
                                    recipes.displayEggsInPurgatoryRecipe();
                                    break outerLoop;
                                case 7:
                                    recipes.displayItalianHotChocolateRecipe();
                                    break outerLoop;
                                case 8:
                                    recipes.displayPanettoneRecipe();
                                    break outerLoop;
                                case 9:
                                    recipes.displayItalianBreakfastCasserole();
                                    break outerLoop;
                                case 10:
                                    recipes.displayCappuccinoRecipe();
                                    break outerLoop;
                                default:
                                    System.out.println("Invalid Recipe");
                                    break outerLoop;
                        }
                        // Display Breakfast Japanese names of recipes
                        case 3:
                            recipeSelection();
                            recipes.displayBreakfastJapaneseRecipeNames();
                            int finalChoice3 = scan.nextInt();
                            switch (finalChoice3) {
                                // Display individual recipes for breakfast japanese
                                case 1:
                                    recipes.displayTamagoyakiRecipe();
                                    break outerLoop;
                                case 2:
                                    recipes.displayMisoSoupRecipe();
                                    break outerLoop;
                                case 3:
                                    recipes.displayBreakfastOnigiriRecipe();
                                    break outerLoop;
                                case 4:
                                    recipes.displayNattoWithRiceRecipe();
                                    break outerLoop;
                                case 5:
                                    recipes.displayJapanesePancakesRecipe();
                                    break outerLoop;
                                case 6:
                                    recipes.displayGrilledFishRecipe();
                                    break outerLoop;
                                case 7:
                                    recipes.displayRicePorridge();
                                    break outerLoop;
                                case 8:
                                    recipes.displayJapaneseFruitSandwich();
                                    break outerLoop;
                                case 9:
                                    recipes.displayEggsInPurgatoryJapaneseRecipe();
                                    break outerLoop;
                                case 10:
                                    recipes.displayJapaneseHotChocolate();
                                    break outerLoop;
                                default:
                                    System.out.println("Invalid Recipe");
                                    break outerLoop;
                            }
                            // Display Breakfast Chinese names
                        case 4:
                            recipeSelection();
                           recipes.displayBreakfastChineseRecipeNames();
                            int finalChoice4 = scan.nextInt();
                            switch (finalChoice4) {
                                // Display individual Breakfast Chinese recipes
                                case 1:
                                    recipes.displayCongeeRecipe();
                                    break outerLoop;
                                case 2:
                                    recipes.displayYoutiaoRecipe();
                                    break outerLoop;
                                case 3:
                                    recipes.displayJianbingRecipe();
                                    break outerLoop;
                                case 4:
                                    recipes.displayBaoziRecipe();
                                    break outerLoop;
                                case 5:
                                    recipes.displayDoujiangRecipe();
                                    break outerLoop;
                                case 6:
                                    recipes.displayScallionRecipe();
                                    break outerLoop;
                                case 7:
                                    recipes.displayTangyuanRecipe();
                                    break outerLoop;
                                case 8:
                                    recipes.displayZhaCaiRouSiMianRecipe();
                                    break outerLoop;
                                case 9:
                                    recipes.displayTeaEggsRecipe();
                                    break outerLoop;
                                case 10:
                                    recipes.displayMantouRecipe();
                                    break outerLoop;
                                default:
                                    System.out.println("Invalid Recipe");
                                    break outerLoop;
                            }
                        case 5:
                            continue;
                        default:
                            System.out.println("Invalid Cuisine!");
                    }
                    break;
                    // Cuisine selection for lunch
                case 2:
                    cuisineSelection();
                    int subChoice2 = scan.nextInt();
                    switch (subChoice2) {
                        // Display Lunch American recipe names
                        case 1:
                            recipeSelection();
                            recipes.displayLunchAmericanRecipeNames();
                            int finalChoice5 = scan.nextInt();
                            switch (finalChoice5) {
                                // Display individual Lunch American names
                                case 1:
                                    recipes.displayClassicBLTSandwichRecipe();
                                    break outerLoop;
                                case 2:
                                    recipes.displayChickenCaesarSaladRecipe();
                                    break outerLoop;
                                case 3:
                                    recipes.displaySloppyJoesRecipe();
                                    break outerLoop;
                                case 4:
                                    recipes.displayGrilledCheeseSandwichRecipe();
                                    break outerLoop;
                                case 5:
                                    recipes.displayMacAndCheeseRecipe();
                                    break outerLoop;
                                case 6:
                                    recipes.displayPulledPorkSandwich();
                                    break outerLoop;
                                case 7:
                                    recipes.displayBuffaloChickenWrap();
                                    break outerLoop;
                                case 8:
                                    recipes.displayChiliRecipe();
                                    break outerLoop;
                                case 9:
                                    recipes.displayClubSandwichRecipe();
                                    break outerLoop;
                                case 10:
                                    recipes.displayPhillyCheeseSteakRecipe();
                                    break outerLoop;
                                default:
                                    System.out.println("Invalid Recipe");
                                    break outerLoop;
                            }
                            // Display Lunch Italian recipe names
                        case 2:
                            recipeSelection();
                            recipes.displayLunchItalianRecipeNames();
                            int finalChoice6 = scan.nextInt();
                            switch (finalChoice6) {
                                // Display individual Lunch Italian recipes
                                case 1:
                                    recipes.displayCapreseSaladRecipe();
                                    break outerLoop;
                                case 2:
                                    recipes.displayPastaCarbonaraRecipe();
                                    break outerLoop;
                                case 3:
                                    recipes.displayMargheritaPizzaRecipe();
                                    break outerLoop;
                                case 4:
                                    recipes.displayMinestroneSoupRecipe();
                                    break outerLoop;
                                case 5:
                                    recipes.displayPaniniWithProsciuttoAndMozzarellaRecipe();
                                    break outerLoop;
                                case 6:
                                    recipes.displayRisottoAllaMilaneseRecipe();
                                    break outerLoop;
                                case 7:
                                    recipes.displayEggplantParmesanRecipe();
                                    break outerLoop;
                                case 8:
                                    recipes.displayGnocchiWithPestoRecipe();
                                    break outerLoop;
                                case 9:
                                    recipes.displayItalianMeatballsRecipe();
                                    break outerLoop;
                                case 10:
                                    recipes.displayBruschettaAlPomodoroRecipe();
                                    break outerLoop;
                                default:
                                    System.out.println("Invalid Recipe");
                                    break outerLoop;
                            }
                            // Display Lunch Japanese recipe names
                        case 3:
                            recipeSelection();
                            recipes.displayLunchJapaneseRecipeNames();
                            int finalChoice7 = scan.nextInt();
                            switch (finalChoice7) {
                                // Display individual Lunch Japanese recipes
                                case 1:
                                    recipes.displayGyudonRecipe();
                                    break outerLoop;
                                case 2:
                                    recipes.displayTonkatsuRecipe();
                                    break outerLoop;
                                case 3:
                                    recipes.displayOyakodonRecipe();
                                    break outerLoop;
                                case 4:
                                    recipes.displayYakisobaRecipe();
                                    break outerLoop;
                                case 5:
                                    recipes.displayLunchOnigiriRecipe();
                                    break outerLoop;
                                case 6:
                                    recipes.displayJapaneseCurryRiceRecipe();
                                    break outerLoop;
                                case 7:
                                    recipes.displayMisoSoupWithTofuAndSeaweedRecipe();
                                    break outerLoop;
                                case 8:
                                    recipes.displayTamagoSandoRecipe();
                                    break outerLoop;
                                case 9:
                                    recipes.displayTeriyakiSalmonRecipe();
                                    break outerLoop;
                                case 10:
                                    recipes.displayKaraageRecipe();
                                    break outerLoop;
                                default:
                                    System.out.println("Invalid Recipe");
                                    break outerLoop;
                            }
                            // Display Lunch Chinese recipe Names
                        case 4:
                            recipeSelection();
                            recipes.displayLunchChineseRecipeNames();
                            int finalChoice8 = scan.nextInt();
                            switch (finalChoice8) {
                                // Display individual Lunch Chinese recipes
                                case 1:
                                    recipes.displayKungPaoChickenRecipe();
                                    break outerLoop;
                                case 2:
                                    recipes.displaySweetAndSourPorkRecipe();
                                    break outerLoop;
                                case 3:
                                    recipes.displayEggFriedRiceRecipe();
                                    break outerLoop;
                                case 4:
                                    recipes.displayMapoTofuRecipe();
                                    break outerLoop;
                                case 5:
                                    recipes.displayBeefAndBroccoliStirFryRecipe();
                                    break outerLoop;
                                case 6:
                                    recipes.displayHotAndSourSoupRecipe();
                                    break outerLoop;
                                case 7:
                                    recipes.displaySpringRollsRecipe();
                                    break outerLoop;
                                case 8:
                                    recipes.displayLoMeinRecipe();
                                    break outerLoop;
                                case 9:
                                    recipes.displayCharSiuRecipe();
                                    break outerLoop;
                                case 10:
                                    recipes.displayWontonSoupRecipe();
                                    break outerLoop;
                                default:
                                    System.out.println("Invalid Recipe");
                                    break outerLoop;
                            }
                        case 5:
                            continue;
                        default:
                            System.out.println("Invalid Cuisine!");
                    }
                    break;
                case 3:
                    // Cuisine selection for Dinner
                    cuisineSelection();
                    int subChoice3 = scan.nextInt();
                    switch (subChoice3) {
                        // Display Dinner American Recipe names
                        case 1:
                            recipeSelection();
                            recipes.displayDinnerAmericanRecipeNames();
                            int finalChoice9 = scan.nextInt();
                            switch (finalChoice9) {
                                // Display individual Dinner American recipes
                                case 1:
                                    recipes.displayClassicCheeseburgerRecipe();
                                    break outerLoop;
                                case 2:
                                    recipes.displayBBQPulledPorkSandwichesRecipe();
                                    break outerLoop;
                                case 3:
                                    recipes.displayDinnerMacAndCheeseRecipe();
                                    break outerLoop;
                                case 4:
                                    recipes.displayDinnerSloppyJoesRecipe();
                                    break outerLoop;
                                case 5:
                                    recipes.displayBakedZitiRecipe();
                                    break outerLoop;
                                case 6:
                                    recipes.displayChickenCaesarSaladWrapsRecipe();
                                    break outerLoop;
                                case 7:
                                    recipes.displayLoadedPotatoCasseroleRecipe();
                                    break outerLoop;
                                case 8:
                                    recipes.displayDinnerPhillyCheeseSteakRecipe();
                                    break outerLoop;
                                case 9:
                                    recipes.displayOnePanChickenAndVegetablesRecipe();
                                    break outerLoop;
                                case 10:
                                    recipes.displaySlowCookerChiliRecipe();
                                    break outerLoop;
                                default:
                                    System.out.println("Invalid Recipe");
                                    break outerLoop;
                            }
                            // Display Dinner Italian recipe names
                        case 2:
                            recipeSelection();
                            recipes.displayDinnerItalianRecipeNames();
                            int finalChoice10 = scan.nextInt();
                            switch (finalChoice10) {
                                // Displays individual Dinner Italian recipe names
                                case 1:
                                    break outerLoop;
                                case 2:
                                    break outerLoop;
                                case 3:
                                    break outerLoop;
                                case 4:
                                    break outerLoop;
                                case 5:
                                    break outerLoop;
                                case 6:
                                    break outerLoop;
                                case 7:
                                    break outerLoop;
                                case 8:
                                    break outerLoop;
                                case 9:
                                    break outerLoop;
                                case 10:
                                    break outerLoop;
                                default:
                                    System.out.println("Invalid Recipe");
                                    break outerLoop;
                            }
                            // Display Dinner Japanese recipe names
                        case 3:
                            recipeSelection();
                            recipes.displayDinnerJapaneseRecipeNames();
                            int finalChoice11 = scan.nextInt();
                            switch (finalChoice11) {
                                // Display individual Dinner Japanese recipe names
                                case 1:
                                    break outerLoop;
                                case 2:
                                    break outerLoop;
                                case 3:
                                    break outerLoop;
                                case 4:
                                    break outerLoop;
                                case 5:
                                    break outerLoop;
                                case 6:
                                    break outerLoop;
                                case 7:
                                    break outerLoop;
                                case 8:
                                    break outerLoop;
                                case 9:
                                    break outerLoop;
                                case 10:
                                    break outerLoop;
                                default:
                                    System.out.println("Invalid Recipe");
                                    break outerLoop;
                            }
                            // Display Dinner Chinese recipe names
                        case 4:
                            recipeSelection();
                            recipes.displayDinnerChineseRecipeNames();
                            int finalChoice12 = scan.nextInt();
                            switch (finalChoice12) {
                                // Display individual Chinese recipes
                                case 1:
                                    break outerLoop;
                                case 2:
                                    break outerLoop;
                                case 3:
                                    break outerLoop;
                                case 4:
                                    break outerLoop;
                                case 5:
                                    break outerLoop;
                                case 6:
                                    break outerLoop;
                                case 7:
                                    break outerLoop;
                                case 8:
                                    break outerLoop;
                                case 9:
                                    break outerLoop;
                                case 10:
                                    break outerLoop;
                                default:
                                    System.out.println("Invalid Recipe");
                                    break outerLoop;
                            }
                        case 5:
                            continue;
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
                            Please select what cuisine you want:
                            1. American
                            2. Italian
                            3. Japanese
                            4. Chinese
                            5. Back
                            """);
    }
    private void recipeSelection(){
        System.out.println("Please select which recipe you want:");
    }
    // Exiting message
    private void exitMessage(){
        System.out.println("\nThanks for using the app!");
        System.out.println("""
                                           _          _
                                           (c)___c____(c)
                                            \\ ........../
                                             |.........|
                                              |.......|
                                              |.......|
                                              |=======|
                                              |=======|
                                             __o)""\""::?
                                            C__    c)::;
                                               >--   ::     /\\
                                               (____/      /__\\
                                               } /""|      |##|
                                    __/       (|V ^ )\\     |##|
                                    o | _____/ |#/ / |     |##|
                           @        o_|}|_____/|/ /  |     |##|
                                          _____/ /   |     ~!!~
                              ======ooo}{|______)#   |     /`'\\
                          ~~~~ ;    ;          ###---|8     ""
                        ____;_____;____        ###====     /:|\\
                       (///0///@///@///)       ###@@@@|
                       |~~~~~~~~~~~~~~~|       ###@@@@|
                        \\             /        ###@@@@|               +
                         \\___________/         ###xxxxx      /\\      //
                           H H   H  H          ###|| |      /  \\    //
                           H H   H  H           | || |     /____\\  /~_^_
                           H H   H  H           C |C |     _|@@|_ /__|#|_
                           H H   H  H            || ||    /_|@@|_/___|#|/|
                 v    \\/   H(o) (o) H            || ::   |:::::::::::::|#|
                 ~    ~~  (o)      (o)        Ccc__)__)   |:::::::::::::|#|
                  \\|/      ~   @* & ~                    |:::::::::::::|/  \\|/
                   ~           \\|/        !!        \\ !/  ~~~~~~~~~~~~~    ~~~
                               ~~~        ~~         ~~           ~~
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");
    }
}
