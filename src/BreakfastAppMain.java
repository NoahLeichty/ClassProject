//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.*;
import java.util.*;

public class BreakfastAppMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The recipes are grouped by region (to keep it organized)
        Map<String, Map<String, Recipe>> regionRecipes = new HashMap<>();

        // North America Recipes
        Map<String, Recipe> naRecipes = new HashMap<>();
        naRecipes.put("pancakes", new PancakesRecipe());
        naRecipes.put("omelette", new OmeletteRecipe());
        naRecipes.put("breakfast potatoes", new BreakfastPotatoesRecipe());
        regionRecipes.put("north america", naRecipes);

        // Asia Recipes
        Map<String, Recipe> asiaRecipes = new HashMap<>();
        asiaRecipes.put("japanese onigiri", new JapaneseOnigiriRecipe());
        asiaRecipes.put("chinese shaobing", new ChineseShaobingRecipe());
        regionRecipes.put("asia", asiaRecipes);

        // A warm welcome
        System.out.println("Welcome to What's Cookin'!");

        // Prompts user for random recipe first (if no, continue to region/meal selection)
        System.out.print("Would you like a random recipe? (yes/no): ");
        String randomChoice = scanner.nextLine().trim().toLowerCase();

        if (randomChoice.startsWith("y")) {
            List<Recipe> allRecipes = new ArrayList<>();
            for (Map<String, Recipe> recipeMap : regionRecipes.values()) {
                allRecipes.addAll(recipeMap.values());
            }
            //If "Yes" is chosen for random recipe
            if (!allRecipes.isEmpty()) {
                while (true) {
                    Random random = new Random();
                    Recipe recipe = allRecipes.get(random.nextInt(allRecipes.size()));
                    System.out.println("\nRight on! Random recipe selected: " + recipe.getTitle() + "\n");
                    recipe.display();

                    System.out.print("\nWould you like to prepare this recipe? (yes/no): ");
                    String prepareChoice = scanner.nextLine().trim().toLowerCase();
                    logPreparedRecipe(recipe);

                    if (prepareChoice.startsWith("y")) {
                        System.out.println("Great! Enjoy preparing " + recipe.getTitle() + "!\n" +
                                      ".ssSSSSss.\n" +
                                "    .ER'      `AM.\n" +
                                "  .ST'          `CS.\n" +
                                " .E'  .S.    .S.  `S.\n" +
                                ".L'   SSS    SSS   `S.\n" +
                                "S'    `S'    `S'    `S\n" +
                                "S                    S\n" +
                                "S                    S\n" +
                                "S.  s.          .s   S\n" +
                                "`S. `\"s.      .s\"'  S'\n" +
                                " `S.  `\"ss..ss\"'  .S'\n" +
                                "  `SS.    ~~    .SS'\n" +
                                "    `SS.      .SS'\n" +
                                "      `SSssssSS'");
                        scanner.close();
                        return; // Leaves recipe instructions on display
                    } else {
                        System.out.print("No problem! Would you like to view another random recipe? (yes/no): ");
                        String anotherRandom = scanner.nextLine().trim().toLowerCase();

                        if (prepareChoice.startsWith("y")) {
                            System.out.println("Returning to region/meal selection...\n");
                            break; // Exits the random loop; goes to manual region/meal path
                        }
                    }
                }
            } else {
                System.out.println("No recipes here...");
                scanner.close();
                return;
            }
        }

        // Ask for region
        String chosenRegion;
        Map<String, Recipe> selectedRegionRecipes = null;

        while (true) {
            System.out.print("Which region would you like your meal from? (North America, Asia): ");
            chosenRegion = scanner.nextLine().trim().toLowerCase();

            if (regionRecipes.containsKey(chosenRegion)) {
                selectedRegionRecipes = regionRecipes.get(chosenRegion);
                break;
            } else {
                System.out.println("I don't think we have that Region yet... Please try again.");
            }
        }

        // Ask for meal type (For breakfast enjoyers only (can only choose breakfast...))
        while (true) {
            System.out.print("Which meal type would you like a recipe for? (Breakfast, Lunch, Dinner): ");
            String mealType = scanner.nextLine().trim().toLowerCase();

            if (mealType.equals("breakfast")) {
                break;
            } else {
                System.out.println("Sorry, we only have breakfast for now. Please try again.");
            }
        }

        // Displays the available recipes in chosen region
        System.out.println("Here are the recipes in " + chosenRegion + ":");
        for (String recipeName : selectedRegionRecipes.keySet()) {
            System.out.println("- " + recipeName);
        }
        
        // Prompts user to choose recipe they wish to view
        while (true) {
            System.out.print("Which recipe would you like to view?: ");
            String chosenRecipe = scanner.nextLine().trim().toLowerCase();

            Recipe recipe = selectedRegionRecipes.get(chosenRecipe);

            if (recipe != null) {
                recipe.display();

                System.out.print("\nWould you like to prepare this recipe? (yes/no): ");
                String prepareChoice = scanner.nextLine().trim().toLowerCase();
                logPreparedRecipe(recipe);

                if (prepareChoice.startsWith("y")) {
                    System.out.println("Great! Enjoy preparing " + recipe.getTitle() + "!\n" +
                                  ".ssSSSSss.\n" +
                            "    .ER'      `AM.\n" +
                            "  .ST'          `CS.\n" +
                            " .E'  .S.    .S.  `S.\n" +
                            ".L'   SSS    SSS   `S.\n" +
                            "S'    `S'    `S'    `S\n" +
                            "S                    S\n" +
                            "S                    S\n" +
                            "S.  s.          .s   S\n" +
                            "`S. `\"s.      .s\"'  S'\n" +
                            " `S.  `\"ss..ss\"'  .S'\n" +
                            "  `SS.    ~~    .SS'\n" +
                            "    `SS.      .SS'\n" +
                            "      `SSssssSS'");
                    break;
                } else {
                    System.out.println("\nNo problem! Let's choose another recipe.\n");
                }
            } else {
                System.out.println("Sorry, I don't think we have that recipe in " + chosenRegion + ". Try again.\n");
            }
        }
    }


    public void loadRecipesFromFile(Map<String, Map<String, Recipe>> regionRecipes) {
        try (BufferedReader reader = new BufferedReader(new FileReader("recipes.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;

                String title = line.trim();
                String ingredients = reader.readLine().trim();
                String instructions = reader.readLine().trim();
                reader.readLine(); // skips blank line

                Recipe recipe = new CustomRecipe(title, ingredients, instructions);

                // Add to both regions, or conditionally based on region keywords
                regionRecipes.get("north america").put(title.toLowerCase(), recipe);
                regionRecipes.get("asia").put(title.toLowerCase(), recipe);
                loadRecipesFromFile(regionRecipes);
            }
        } catch (IOException e) {
            System.out.println("Error reading recipes file: " + e.getMessage());
        }
    }

    public static void logPreparedRecipe(Recipe recipe) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Recipe_Log.txt", true))) {
            String time = java.time.LocalDateTime.now()
                    .format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
            writer.write("Prepared: " + recipe.getTitle() + " at " + time);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to log file: " + e.getMessage());
        }
    }
}

