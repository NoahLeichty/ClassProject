import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SimpleTimeZone;

// Stores recipes
public class Recipes {
    FileHandling fileHandling = new FileHandling();

    // ToDo add allergy option
    // ToDo make this better
    // ToDo add more comments

    // Lists
    private List<String> recipeName;
    private List<String> recipes;

    // Constructor
    public Recipes() {
        this.recipeName = new ArrayList<>();
        this.recipes = new ArrayList<>();
    }
    // Method to get the recipe name which prints it numerically
    private String getRecipeName(){
        StringBuilder recipe = new StringBuilder();
        for (int i = 0; i < recipeName.size(); i++) {
            recipe.append(i + 1).append(". ").append(recipeName.get(i));
            if (i < recipeName.size() - 1) {
                recipe.append("\n");
            }
        }
        return recipe.toString();

    }
    // setter for recipe name
    private void setRecipeName(String recipeName){
        this.recipeName.add(recipeName);
    }
    // getter for recipes
    private String getRecipes() {
        StringBuilder recipe = new StringBuilder();
        for (int i = 0; i < recipes.size(); i++) {
            recipe.append(recipes.get(i));
            if (i < recipes.size() - 1) {
                recipe.append("");
            }
        }
        return recipe.toString();
    }
    // Setter for recipes
    private void setRecipes(String recipe) {
        this.recipes.add(recipe);
    }
    /*
    This is probably a very dumb and bad way to set all the recipes
    But I don't have time to think of another way to do ths, and it works
    However it is very long and complicated
     */
    /// Displaying recipe names for Breakfast American
    public void displayBreakfastAmericanRecipeNames(){
        setRecipeName("Blueberry Pancakes");
        setRecipeName("Breakfast Burrito");
        setRecipeName("Classic Waffles");
        setRecipeName("French Toast");
        setRecipeName("Eggs Benedict");
        setRecipeName("Biscuits and Gravy");
        setRecipeName("Breakfast Casserole");
        setRecipeName("Omelet");
        setRecipeName("Bagels with Cream Cheese");
        setRecipeName("Pumpkin Muffins");
        System.out.println(getRecipeName());
    }
    /// Displaying recipes for Breakfast American
    // Displays BlueberryPancake Recipe
    public void displayBlueberryPancakesRecipe(){
        setRecipes("""
                You Selected Blueberry Pancakes!
                Ingredients: Flour, baking powder, sugar, salt, milk, eggs, butter, blueberries
                Cooking Time: 20 minutes
                Description: Fluffy pancakes packed with juicy blueberries, served with butter and maple syrup.""");
        System.out.println(getRecipes());
    }
    //Displays Breakfast burrito Recipe
    public void displayBreakfastBurritoRecipe(){
        setRecipes("""
                You Selected Breakfast Burrito!
                Ingredients: Tortilla, scrambled eggs, cheese, bacon or sausage, salsa
                Cooking Time: 15 minutes
                Description: A warm tortilla filled with eggs, cheese, and meat, perfect for a grab-and-go breakfast.
                """);
        System.out.println(getRecipes());
    }
    // Displays Classic Waffles Recipe
    public void displayClassicWafflesRecipe(){
        System.out.println("""
                You Selected Classic Waffles!
                Ingredients: Flour, baking powder, sugar, salt, eggs, milk, butter
                Cooking Time: 25 minutes
                Description: Crispy on the outside, fluffy on the inside, best served with syrup and fruit.
                """);
        System.out.println(getRecipes());
    }
    // Displays French Toast Recipe
    public void displayFrenchToastRecipe(){
        System.out.println("""
                You selected French Toast!
                Ingredients: Bread, eggs, milk, cinnamon, vanilla extract, butter
                Cooking Time: 15 minutes
                Description: Thick slices of bread soaked in a sweet egg mixture and fried to golden perfection.
                """);
        System.out.println(getRecipes());
    }
    // Displays Eggs Benedict Recipe
    public void displayEggsBenedictRecipe(){
        System.out.println("""
                You Selected Eggs Benedict!
                Ingredients: English muffins, poached eggs, ham, hollandaise sauce
                Cooking Time: 30 minutes
                Description: A rich and indulgent breakfast with creamy hollandaise sauce over poached eggs.
                """);
        System.out.println(getRecipes());
    }
    // Displays Biscuits and Gravy Recipe
    public void displayBiscuitsAndGravyRecipe(){
        System.out.println("""
                You selected Biscuits and Gravy!
                Ingredients: Flour, butter, milk, sausage, biscuits
                Cooking Time: 30 minutes
                Description: Fluffy biscuits smothered in a creamy sausage gravy, a Southern favorite.
                """);
        System.out.println(getRecipes());
    }
    // Displays Breakfast Casserole Recipe
    public void displayBreakfastCasseroleRecipe(){
        System.out.println("""
                You Selected Breakfast Casserole!
                Ingredients: Eggs, cheese, sausage, hash browns, milk
                Cooking Time: 40 minutes
                Description: A baked dish combining eggs, cheese, and sausage for a hearty breakfast.
                """);
        System.out.println(getRecipes());
    }
    // Displays Omelet Recipe
    public void displayOmeletRecipe(){
        System.out.println("""
                You Selected Omelet!
                Ingredients: Eggs, cheese, vegetables (bell peppers, onions, mushrooms), butter
                Cooking Time: 10 minutes
                Description: A customizable egg dish filled with cheese and veggies, cooked to perfection.
                """);
        System.out.println(getRecipes());
    }
    // Displays Bagel With Cream Cheese Recipe
    public void displayBagelsWithCreamCheeseRecipe(){
        System.out.println("""
                You Selected Bagels with Cream Cheese!
                - Ingredients: Flour, yeast, sugar, salt, water, cream cheese
                - Cooking Time: 45 minutes
                - Description: Chewy homemade bagels, perfect with a spread of cream cheese.
                """);
        System.out.println(getRecipes());
    }
    // Displays Pumpkin Muffins Recipe
    public void displayPumpkinMuffinsRecipe(){
        System.out.println("""
                You Selected Pumpkin Muffins!
                Ingredients: Flour, pumpkin puree, sugar, eggs, baking powder, cinnamon
                Cooking Time: 30 minutes
                Description: Moist and flavorful muffins with warm spices, great for fall mornings.
                """);

    }
    /// Displaying recipe names for Breakfast Italian
    public void displayBreakfastItalianRecipeNames(){
        setRecipeName("Italian Breakfast Bruschetta");
        setRecipeName("Italian Breakfast Frittata");
        setRecipeName("Cornetto (Italian Croissant)");
        setRecipeName("Biscotti (Italian Biscuits)");
        setRecipeName("Ricotta Toast with Jam");
        setRecipeName("Eggs in Purgatory (Italian Shakshuka)");
        setRecipeName("Italian Hot Chocolate (Cioccolata Calda)");
        setRecipeName("Panettone (Italian Sweet Bread)");
        setRecipeName("Italian Breakfast Casserole");
        setRecipeName("Cappuccino");
        System.out.println(getRecipeName());
    }
    /// Displaying recipes for Breakfast Italian
    // Displays Italian brekafast Bruschetta Recipe
    public void displayItalianBreakfastBruschettaRecipe(){
        setRecipes("""
                You Selected Italian Breakfast Bruschetta!
                Ingredients: Bread, tomatoes, basil, olive oil, garlic, salt, pepper
                Cooking Time: 15 minutes
                Description: A simple and hearty breakfast toast topped with fresh tomatoes and basil
                """);
        System.out.println(getRecipes());
    }
    // Displays Italian breakfast Frittata Recipe
    public void displayItalianBreakfastFrittataRecipe(){
        setRecipes("""
                You Selected Italian Breakfast Frittata!
                Ingredients: Eggs, cheese, vegetables (spinach, mushrooms, onions), olive oil
                Cooking Time: 30 minutes
                Description: A baked egg dish loaded with fresh vegetables and cheese
                """);
        System.out.println(getRecipes());
    }
    // Displays Cornetto Recipe
    public void displayCornettoRecipe(){
        setRecipes("""
                You Selected Cornetto!
                Ingredients: Flour, butter, sugar, yeast, milk, eggs
                Cooking Time: 2 hours (including proofing)
                Description: A flaky, buttery pastry similar to a croissant, often enjoyed with coffee
                """);
        System.out.println(getRecipes());
    }
    // Displays Biscotti Recipe
    public void displayBiscottiRecipe(){
        setRecipes("""
                You Selected Biscotti!
                Ingredients: Flour, sugar, eggs, almonds, baking powder
                Cooking Time: 45 minutes
                Description: Crunchy, twice-baked cookies perfect for dipping in coffee
                """);
        System.out.println(getRecipes());
    }
    // Displays Ricootta Toast with jam Recipe
    public void displayRicotaaToastWithJamRecipe(){
        setRecipes("""
                You Selected Rcotaa Toast with Jam!
                Ingredients: Bread, ricotta cheese, fruit jam, honey
                Cooking Time: 10 minutes
                Description: A creamy and sweet breakfast toast with ricotta and jam
                """);
        System.out.println(getRecipes());
    }
    // Displays Eggs in Purgatory Recipe
    public void displayEggsInPurgatoryRecipe(){
        setRecipes("""
                You Selected Eggs in Purgatory (Italian)
                Ingredients: Eggs, tomato sauce, garlic, olive oil, chili flakes
                Cooking Time: 20 minutes
                Description: Eggs poached in a rich tomato sauce, best enjoyed with crusty bread
                """);
        System.out.println(getRecipes());
    }
    // Displays Italian Hot Chocolate Recipe
    public void displayItalianHotChocolateRecipe(){
        setRecipes("""
                You Selected Italian Hot Chocolate
                Ingredients: Milk, cocoa powder, sugar, cornstarch, dark chocolate
                Cooking Time: 10 minutes
                Description: A thick, pudding-like hot chocolate, rich and indulgent
                """);
        System.out.println(getRecipes());
    }
    // Displays Panettone Recipe
    public void displayPanettoneRecipe(){
        setRecipes("""
                You Selected Panettone
                Ingredients: Flour, sugar, eggs, butter, yeast, dried fruit
                Cooking Time: 3 hours (including proofing)
                Description: A traditional Italian sweet bread, often enjoyed during holidays
                """);
        System.out.println(getRecipes());
    }
    // Displays Italian Breakfast Casserole Recipe
    public void displayItalianBreakfastCasserole(){
        setRecipes("""
                You Selected Italian Breakfast Casserole!
                Ingredients: Eggs, sausage, cheese, bread, milk
                Cooking Time: 55 minutes
                Description: A baked dish combining eggs, sausage, and cheese for a hearty breakfast
                """);
        System.out.println(getRecipes());
    }
    // Displays Cappuccino Recipe
    public void displayCappuccinoRecipe(){
        setRecipes("""
                You Selected Cappuccino!
                Ingredients: Espresso, steamed milk, milk foam
                Cooking Time: 5 minutes
                Description: A classic Italian coffee drink, creamy and rich, perfect for mornings
                """);
        System.out.println(getRecipes());
    }
    /// Displaying recipe names for Breakfast Japanese
    public void displayBreakfastJapaneseRecipeNames(){
        setRecipeName("Tamagoyaki (Japanese Rolled Omelette)");
        setRecipeName("Miso Soup");
        setRecipeName("Onigiri (Rice Balls)");
        setRecipeName("Natto with Rice");
        setRecipeName("Japanese Pancakes (Souffle Pancakes)");
        setRecipeName("Grilled Fish (Shiozake - Salted Salmon)");
        setRecipeName("Rice Porridge (Okayu)");
        setRecipeName("Japanese Fruit Sandwich (Fruit Sando)");
        setRecipeName("Eggs in Purgatory (Japanese Style)");
        setRecipeName("Japanese Hot Chocolate (Cioccolata Calda - Thick Hot Chocolate)");
        System.out.println(getRecipeName());
    }
    /// Displaying Breakfast Japanese recipes
    // Displays Tamagoyaki Recipe
    public void displayTamagoyakiRecipe(){
        setRecipes("""
                You Selected Tamagoyaki!
                Ingredients: Eggs, soy sauce, mirin, sugar, oil
                Cooking Time: 10 minutes
                Description: A slightly sweet, layered omelette, often served in bento boxes or alongside rice
                """);
        System.out.println(getRecipes());
    }
    // Displays Miso Recipe
    public void displayMisoSoupRecipe(){
        setRecipes("""
                You Selected Miso Soup!
                Ingredients: Miso paste, dashi stock, tofu, seaweed, green onions
                Cooking Time: 15 minutes
                Description: A warm, umami-rich soup made with fermented soybean paste and dashi broth
                """);
        System.out.println(getRecipes());
    }
    // Displays Onigiri Recipe
    public void displayBreakfastOnigiriRecipe(){
        setRecipes("""
                You Selected Onigiri!
                Ingredients: Cooked rice, nori (seaweed), fillings (salmon, tuna, pickled plum)
                Cooking Time: 10 minutes
                Description: Hand-formed rice balls with various fillings, wrapped in seaweed
                """);
        System.out.println(getRecipes());
    }
    // Displays Natto with Rice Recipe
    public void displayNattoWithRiceRecipe(){
        setRecipes("""
                You Select Natto With Rice!
                - Ingredients: Fermented soybeans (natto), cooked rice, soy sauce, mustard
                - Cooking Time: 5 minutes
                - Description: A traditional dish featuring sticky, fermented soybeans served over rice
                """);
        System.out.println(getRecipes());
    }
    // Displays Japanese Pancakes Recipe
    public void displayJapanesePancakesRecipe(){
        setRecipes("""
                You Selected Japanese Pancakes!
                Ingredients: Flour, eggs, sugar, milk, baking powder
                Cooking Time: 20 minutes
                Description: Fluffy, airy pancakes with a soufflé-like texture, often topped with syrup or fruit
                """);
        System.out.println(getRecipes());
    }
    // Displays Grilled Fish Recipe
    public void displayGrilledFishRecipe(){
        setRecipes("""
                You Selected Grilled Fish!
                Ingredients: Salmon fillet, salt, oil
                Cooking Time: 15 minutes
                Description: Lightly salted and grilled salmon, commonly served with rice and miso soup.
                """);
        System.out.println(getRecipes());
    }
    // Displays Rice Porridge Recipe
    public void displayRicePorridge(){
        setRecipes("""
                You Selected Rice Porridge!
                Ingredients: Rice, water, salt, toppings (plum, seaweed, sesame seeds)
                Cooking Time: 30 minutes
                Description: A simple, comforting rice porridge, often eaten when feeling unwell
                """);
        System.out.println(getRecipes());
    }
    // Displays Japanese Fruit Sandwich Recipe
    public void displayJapaneseFruitSandwich(){
        setRecipes("""
                You Selected Japanese Fruit Sandwich!
                Ingredients: Milk bread, whipped cream, fresh fruit (strawberries, kiwi, banana)
                Cooking Time: 10 minutes
                Description: A soft sandwich filled with fresh fruit and lightly sweetened whipped cream
                """);
        System.out.println(getRecipes());
    }
    // Displays Eggs in Purgatory Japanese Recipe
    public void displayEggsInPurgatoryJapaneseRecipe(){
        setRecipes("""
                You Selected Eggs In Purgatory (Japanese)!
                Ingredients: Eggs, tomato sauce, garlic, olive oil, chili flakes
                Cooking Time: 20 minutes
                Description: Poached eggs in a rich tomato sauce, served with rice or toast
                """);
        System.out.println(getRecipes());
    }
    // Displays Japanese Hot Chocolate Recipe
    public void displayJapaneseHotChocolate(){
        setRecipes("""
                You Selected Japanese Hot Chocolate
                Ingredients: Milk, cocoa powder, sugar, cornstarch, dark chocolate
                Cooking Time: 10 minutes
                Description: A thick, pudding-like hot chocolate, rich and indulgent.
                """);
        System.out.println(getRecipes());
    }
    /// Displaying recipe names for Breakfast Chinese
    public void displayBreakfastChineseRecipeNames(){
        setRecipeName("Congee (Rice Porridge)");
        setRecipeName("Youtiao (Chinese Fried Dough Sticks)");
        setRecipeName("Jianbing (Chinese Savory Crepes)");
        setRecipeName("Baozi (Steamed Buns)");
        setRecipeName("Doujiang (Soy Milk)");
        setRecipeName("Scallion Pancakes");
        setRecipeName("Tangyuan (Sweet Glutinous Rice Balls)");
        setRecipeName("Zha Cai Rou Si Mian (Pickled Mustard Green Noodles)");
        setRecipeName("Tea Eggs");
        setRecipeName("Mantou (Steamed Plain Buns)");
        System.out.println(getRecipeName());
    }
    /// Displaying Breakfast Chinese recipes
    // Displays Congee Recipe
    public void displayCongeeRecipe(){
        setRecipes("""
                You Selected Congee!
                Ingredients: Rice, water, salt, toppings (century egg, pickled vegetables, peanuts)
                Cooking Time: 30 minutes
                Description: A comforting, slow-cooked rice porridge often enjoyed with savory toppings
                """);
        System.out.println(getRecipes());
    }
    // Displays Youtiao Recipe
    public void displayYoutiaoRecipe(){
        setRecipes("""
                You Selected Youtiao!
                Ingredients: Flour, baking powder, salt, water, oil
                Cooking Time: 40 minutes
                Description: Crispy, golden-brown fried dough sticks, commonly paired with soy milk
                """);
        System.out.println(getRecipes());
    }
    // Displays Jianbing Recipe
    public void displayJianbingRecipe(){
        setRecipes("""
                You Selected Jianbing!
                Ingredients: Flour, eggs, scallions, hoisin sauce, crispy wonton
                Cooking Time: 15 minutes
                Description: A thin, crispy crepe filled with eggs, scallions, and savory sauces
                """);
        System.out.println(getRecipes());
    }
    // Displays Baozi Recipe
    public void displayBaoziRecipe(){
        setRecipes("""
                You Selected Baozi!
                Ingredients: Flour, yeast, sugar, water, filling (pork, vegetables, red bean past)
                Cooking Time: 45 minutes
                Description: Soft, fluffy steamed buns with a vareity of sweet or savory fillings""");
        System.out.println(getRecipes());
    }
    // Displays Doujuian Recipe
    public void displayDoujiangRecipe(){
        setRecipes("""
                You Selected Doujiang!
                Ingredients: Soybeans, water, sugar (optional)
                Cooking Time: 20 minutes
                Description: Freshly made soy milk, often enjoyed warm with youtiao
                """);
        System.out.println(getRecipes());
    }
    // Displays Scallion Recipe
    public void displayScallionRecipe(){
        setRecipes("""
                You Selected Scallion!
                Ingredients: Flour, water, scallions, salt, oil
                Cooking Time: 30 minutes
                Description: Crispy, flaky pancakes infused with scallions, perfect for dipping in soy sauce
                """);
        System.out.println(getRecipes());
    }
    // Displays Tangyuan Recipe
    public void displayTangyuanRecipe(){
        setRecipes("""
                You Selected Tangyuan!
                Ingredients: Glutinous rice flour, water, filling (sesame paste, red bean paste)
                Cooking Time: 20 minutes
                Description: Soft, chewy rice balls filled with sweet fillings, often served in warm syrup
                """);
        System.out.println(getRecipes());
    }
    // Displays Zha Cai Rou Si Mian Recipe
    public void displayZhaCaiRouSiMianRecipe(){
        setRecipes("""
                You Selected Zha Cai Rou Si Mian!
                Ingredients: Noodles, pickled mustard greens, pork, soy sauce, garlic
                Cooking Time: 25 minutes
                Description: A flavorful noodle dish with pickled mustard greens and shredded pork
                """);
        System.out.println(getRecipes());
    }
    // Displays Tea Eggs Recipe
    public void displayTeaEggsRecipe(){
        setRecipes("""
                You Selected Tea Eggs!
                Ingredients: Eggs, black tea, soy sauce, star anise, cinnamon
                Cooking Time: 40 minutes
                Description: Hard-boiled eggs simmered in a fragrant tea and spice mixture
                """);
        System.out.println(getRecipes());
    }
    // Displays Mantou Recipe
    public void displayMantouRecipe(){
        setRecipes("""
                You Selected Mantou!
                Ingredients: Flour, yeast, sugar, water
                Cooking Time: 30 minutes
                Description: Soft, pillowy steamed buns, often eaten plain or with condiments
                """);
        System.out.println(getRecipes());
    }
    /// Displaying recipe names for Lunch American
    public void displayLunchAmericanRecipeNames(){
        setRecipeName("Classic BLT Sandwich");
        setRecipeName("Chicken Caesar Salad");
        setRecipeName("Sloppy Joes");
        setRecipeName("Grilled Cheese Sandwich");
        setRecipeName("Mac and Cheese");
        setRecipeName("Pulled Pork Sandwich");
        setRecipeName("Buffalo Chicken Wrap");
        setRecipeName("Chili");
        setRecipeName("Club Sandwich");
        setRecipeName("Philly Cheese Steak");
        System.out.println(getRecipeName());
    }
    /// Displaying recipes for Lunch American
    // Displays Classic BLT Sandwich Recipe
    // Reads from File
    public void displayClassicBLTSandwichRecipe(){
        String filePath = "Recipe/ClassicBLTSandwich.txt";
        fileHandling.printFileContent(filePath);
    }
    // Displays Classic BLT Sandwich Recipe
    // Reads from file
    public void displayChickenCaesarSaladRecipe(){
        String filePath = "Recipe/ChickenCaesarSalad.txt";
        fileHandling.printFileContent(filePath);
    }
    // Displays Sloppy Joes Recipe
    public void displaySloppyJoesRecipe(){
        setRecipes("""
                You Selected Sloppy Joes!
                Ingredients: Ground beef, onion, tomato sauce, Worcestershire sauce, hamburger buns
                Cooking Time: 20 minutes
                Description: A messy but delicious sandwich with seasoned ground beef in a rich tomato sauce
                """);
        System.out.println(getRecipes());
    }
    // Displays Grilled Cheese Sandwich Recipe
    public void displayGrilledCheeseSandwichRecipe(){
        setRecipes("""
                You Selected Grilled Cheese Sandwich!
                Ingredients: Bread, butter, cheddar cheese
                Cooking Time: 10 minutes
                Description: A golden, crispy sandwich with gooey melted cheese inside
                """);
        System.out.println(getRecipes());
    }
    // Displays Mac and Cheese Recipe
    public void displayMacAndCheeseRecipe(){
        setRecipes("""
                You Selected Mac and Cheese!
                Ingredients: Pasta, butter, milk, cheddar cheese, flour
                Cooking Time: 30 minutes
                Description: Creamy and cheesy pasta, a comforting American favorite.
                """);
        System.out.println(getRecipes());
    }
    // Displays Pulled Pork Sandwich Recipe
    public void displayPulledPorkSandwich(){
        setRecipes("""
                You Selected Pulled Pork Sandwich!
                Ingredients: Pork shoulder, barbecue sauce, hamburger buns, coleslaw
                Cooking Time: 4 hours (slow-cooked)
                Description: Tender, slow-cooked pork with smoky barbecue sauce, served on a bun
                """);
        System.out.println(getRecipes());
    }
    // Displays Buffalo Chicken Wrap Recipe
    public void displayBuffaloChickenWrap(){
        setRecipes("""
                You Selected Buffalo Chicken Wrap!
                Ingredients: Tortilla, cooked chicken, buffalo sauce, lettuce, ranch dressing
                Cooking Time: 15 minutes
                Description: A spicy and flavorful wrap with buffalo chicken and cool ranch dressing
                """);
        System.out.println(getRecipes());
    }
    // Displays Chili Recipe
    public void displayChiliRecipe(){
        setRecipes("""
                You Selected Chili!
                - Ingredients: Ground beef, kidney beans, tomatoes, chili powder, onion, garlic
                - Cooking Time: 45 minutes
                - Description: A hearty and spicy stew packed with beef, beans, and bold flavors
                """);
        System.out.println(getRecipes());
    }
    // Displays Club Sandwich Recipe
    public void displayClubSandwichRecipe(){
        setRecipes("""
                You Selected Club Sandwich!
                Ingredients: Bread, turkey, bacon, lettuce, tomato, mayonnaise
                Cooking Time: 15 minutes
                Description: A stacked sandwich with layers of turkey, bacon, and fresh veggies
                """);
        System.out.println(getRecipes());
    }
    // Displays Philly Cheese steak Recipe
    public void displayPhillyCheeseSteakRecipe(){
        setRecipes("""
                You Selected Philly Cheese Steak!
                Ingredients: Thinly sliced beef, hoagie roll, provolone cheese, onions, bell peppers
                Cooking Time: 20 minutes
                Description: A savory sandwich with tender beef, melted cheese, and sautéed onions
                """);
        System.out.println(getRecipes());
    }
    /// Displaying recipe names for Lunch Italian
    public void displayLunchItalianRecipeNames(){
        setRecipeName("Caprese Salad");
        setRecipeName("Pasta Carbonara");
        setRecipeName("Margherita Pizza");
        setRecipeName("Minestrone Soup");
        setRecipeName("Panini with Prosciutto and Mozzarella");
        setRecipeName("Risotto alla Milanese");
        setRecipeName("Eggplant Parmesan (Melanzane alla Parmigiana)");
        setRecipeName("Gnocchi with Pesto");
        setRecipeName("Italian Meatballs (Polpette al Sugo)");
        setRecipeName("Bruschetta al Pomodoro");
        System.out.println(getRecipes());
    }
    /// Displaying recipes for Lunch Italian
    // Displays Caprese Salad Recipe
    public void displayCapreseSaladRecipe(){
        setRecipes("""
                You Selected Caprese Salad!
                Ingredients: Fresh mozzarella, tomatoes, basil, olive oil, balsamic vinegar, salt, pepper
                Cooking Time: 10 minutes
                Description: A refreshing salad with creamy mozzarella, juicy tomatoes, and fragrant basil
                """);
        System.out.println(getRecipes());
    }
    // Displays Pasta Carbonara Recipe
    public void displayPastaCarbonaraRecipe(){
        setRecipes("""
                You Selected Pasta Carbonara!
                Ingredients: Spaghetti, eggs, pancetta, Parmesan cheese, black pepper
                Cooking Time: 20 minutes
                Description: A creamy, savory pasta dish with crispy pancetta and rich egg-based sauce
                """);
        System.out.println(getRecipes());
    }
    // Displays Margherita Pizza Recipe
    public void displayMargheritaPizzaRecipe(){
        setRecipes("""
                You Selected Margherita Pizza!
                - Ingredients: Pizza dough, tomato sauce, fresh mozzarella, basil, olive oil
                - Cooking Time: 25 minutes
                - Description: A classic Italian pizza with simple yet flavorful ingredients.
                """);
        System.out.println(getRecipes());
    }
    // Displays Minestrone Soup Recipe
    public void displayMinestroneSoupRecipe(){
        setRecipes("""
                You Selected Minestrone Soup!
                Ingredients: Vegetables (carrots, celery, zucchini), beans, pasta, tomatoes, broth
                Cooking Time: 40 minutes
                Description: A hearty vegetable soup packed with nutrients and Italian flavors
                """);
        System.out.println(getRecipes());
    }
    // Displays Panini with Prosciutto and Mozzarella Recipe
    public void displayPaniniWithProsciuttoAndMozzarellaRecipe(){
        setRecipes("""
                You Selected Panini with Prosciutto and Mozzarella!
                Ingredients: Ciabatta bread, prosciutto, mozzarella, arugula, olive oil
                Cooking Time: 15 minutes
                Description: A crispy, warm sandwich with salty prosciutto and creamy mozzarella
                """);
        System.out.println(getRecipes());
    }
    // Displays Risotto alla Milanese Recipe
    public void displayRisottoAllaMilaneseRecipe(){
        setRecipes("""
                You Selected Risotto alla Milanese!
                - Ingredients: Arborio rice, saffron, butter, Parmesan cheese, broth
                - Cooking Time: 35 minutes
                - Description: A creamy, golden risotto infused with saffron for a rich flavor.
                """);
        System.out.println(getRecipes());
    }
    // Displays Eggplant Parmesan Recipe
    public void displayEggplantParmesanRecipe(){
        setRecipes("""
                You Selected Eggplant Parmesan!
                Ingredients: Eggplant, tomato sauce, mozzarella, Parmesan cheese, breadcrumbs
                Cooking Time: 45 minutes
                Description: Layers of crispy eggplant, rich tomato sauce, and melted cheese
                """);
        System.out.println(getRecipes());
    }
    // Displays Gnocchi with Pesto Recipe
    public void displayGnocchiWithPestoRecipe(){
        setRecipes("""
                You Selected Gnocchi with Pesto!
                Ingredients: Potato gnocchi, basil pesto, Parmesan cheese, pine nuts
                Cooking Time: 20 minutes
                Description: Soft, pillowy gnocchi coated in fragrant basil pesto
                """);
        System.out.println(getRecipes());
    }
    // Displays Italian Meatballs Recipe
    public void displayItalianMeatballsRecipe(){
        setRecipes("""
                You Selected Italian Meatballs!
                Ingredients: Ground beef, breadcrumbs, eggs, garlic, tomato sauce
                Cooking Time: 40 minutes
                Description: Juicy meatballs simmered in a rich tomato sauce, perfect with pasta
                """);
        System.out.println(getRecipes());
    }
    // Displays Bruschetta al Pomodoro Recipe
    public void displayBruschettaAlPomodoroRecipe(){
        setRecipes("""
                You Selected Bruschetta al Pomodoro!
                Ingredients: Bread, tomatoes, garlic, basil, olive oil, salt, pepper
                Cooking Time: 10 minutes
                Description: A simple yet flavorful appetizer with fresh tomatoes and crispy bread
                """);
        System.out.println(getRecipes());
    }
    /// Displaying recipe names for Lunch Japanese
    public void displayLunchJapaneseRecipeNames(){
        setRecipeName("Gyudon (Beef Bowl)");
        setRecipeName("Tonkatsu (Breaded Pork Cutlet)");
        setRecipeName("Oyakodon (Chicken and Egg Rice Bowl)");
        setRecipeName("Yakisoba (Japanese Stir-Fried Noodles)");
        setRecipeName("Onigiri (Rice Balls)");
        setRecipeName("Japanese Curry Rice");
        setRecipeName("Miso Soup with Tofu and Seaweed");
        setRecipeName("Tamago Sando (Japanese Egg Sandwich)");
        setRecipeName("Teriyaki Salmon");
        setRecipeName("Karaage (Japanese Fried Chicken)");
        System.out.println(getRecipeName());
    }
    /// Displaying Recipes for Lunch Japanese
    // Displays Gyudon Recipe
    public void displayGyudonRecipe(){
        setRecipes("""
                You Selected Gyudon!
                Ingredients: Thinly sliced beef, onions, soy sauce, mirin, sugar, rice
                Cooking Time: 20 minutes
                Description: A savory beef and onion dish simmered in a sweet soy-based sauce, served over rice
                """);
        System.out.println(getRecipes());
    }
    // Displays Tonkatsu Recipe
    public void displayTonkatsuRecipe(){
        setRecipes("""
                You Selected Tonkatsu!
                Ingredients: Pork cutlet, flour, eggs, panko breadcrumbs, oil, tonkatsu sauce
                Cooking Time: 30 minutes
                Description: Crispy, golden-brown breaded pork cutlet, served with shredded cabbage and rice
                """);
        System.out.println(getRecipes());
    }
    // Displays Oyakodon Recipe
    public void displayOyakodonRecipe(){
        setRecipes("""
                You Selected Oyakodon!
                Ingredients: Chicken, eggs, onions, soy sauce, mirin, sugar, rice
                Cooking Time: 25 minutes
                Description: A comforting rice bowl with simmered chicken and eggs in a flavorful broth
                """);
        System.out.println(getRecipes());
    }
    // Displays Yakisoba Recipe
    public void displayYakisobaRecipe(){
        setRecipes("""
                You Selected Yakisoba!
                Ingredients: Yakisoba noodles, pork, cabbage, carrots, yakisoba sauce
                Cooking Time: 15 minutes
                Description: Stir-fried noodles with vegetables and meat, coated in a tangy sauce
                """);
        System.out.println(getRecipes());
    }
    // Displays Onigiri Recipe
    public void displayLunchOnigiriRecipe(){
        setRecipes("""
                You Selected Onigiri!
                Ingredients: Cooked rice, nori (seaweed), fillings (salmon, tuna, pickled plum)
                Cooking Time: 10 minutes
                Description: Hand-formed rice balls with various fillings, wrapped in seaweed
                """);
        System.out.println(getRecipes());
    }
    // Displays Japanese Curry Rice Recipe
    public void displayJapaneseCurryRiceRecipe(){
        setRecipes("""
                You Selected Japanese Curry Rice!
                Ingredients: Beef or chicken, potatoes, carrots, onions, Japanese curry roux, rice
                Cooking Time: 45 minutes
                Description: A rich and mildly spiced curry served over steamed rice
                """);
        System.out.println(getRecipes());
    }
    // Displays Miso Soup with Tofu and Seaweed Recipe
    public void displayMisoSoupWithTofuAndSeaweedRecipe(){
        setRecipes("""
                You Selected Miso Soup with Tofu and Seaweed!
                Ingredients: Miso paste, dashi stock, tofu, seaweed, green onions
                Cooking Time: 15 minutes
                Description: A warm, umami-rich soup made with fermented soybean paste and dashi broth
                """);
        System.out.println(getRecipes());
    }
    // Displays Tamago Sando Recipe
    public void displayTamagoSandoRecipe(){
        setRecipes("""
                You Selected Tamago Sando!
                Ingredients: Soft bread, boiled eggs, mayonnaise, salt, pepper
                Cooking Time: 10 minutes
                Description: A creamy and fluffy egg salad sandwich, popular in Japanese convenience stores.
                """);
        System.out.println(getRecipes());
    }
    // Displays Teriyaki Salmon Recipe
    public void displayTeriyakiSalmonRecipe(){
        setRecipes("""
                You Selected Teriyaki Salmon!
                Ingredients: Salmon fillet, soy sauce, mirin, sugar, ginger, garlic
                Cooking Time: 20 minutes
                Description: A flavorful glazed salmon dish with a sweet and savory teriyaki sauce
                """);
        System.out.println(getRecipes());
    }
    // Displays Karaage Recipe
    public void displayKaraageRecipe(){
        setRecipes("""
                You Selected Karaage!
                Ingredients: Chicken thigh, soy sauce, ginger, garlic, potato starch, oil
                Cooking Time: 30 minutes
                Description: Crispy, juicy fried chicken marinated in a soy-based seasoning
                """);
        System.out.println(getRecipes());
    }
    /// Displaying recipe names for Lunch Chinese
    public void displayLunchChineseRecipeNames(){
        setRecipeName("Kung Pao Chicken");
        setRecipeName("Sweet and Sour Pork");
        setRecipeName("Egg Fried Rice");
        setRecipeName("Mapo Tofu");
        setRecipeName("Beef and Broccoli Stir-Fry");
        setRecipeName("Hot and Sour Soup");
        setRecipeName("Spring Rolls");
        setRecipeName("Lo Mein (Stir-Fried Noodles)");
        setRecipeName("Char Siu (Chinese BBQ Pork)");
        setRecipeName("Wonton Soup");
        System.out.println(getRecipeName());
    }
    /// Displaying recipes for Lunch Chinese
    // Displays Kung Pao Chicken Recipe
    public void displayKungPaoChickenRecipe(){
        setRecipes("""
                You Selected Kung Pao Chicken!
                Ingredients: Chicken breast, peanuts, bell peppers, soy sauce, garlic, ginger, chili peppers
                Cooking Time: 25 minutes
                Description: A spicy and savory stir-fry with tender chicken, crunchy peanuts, and bold flavors
                """);
        System.out.println(getRecipes());
    }
    // Displays Sweet and Sour Pork Recipe
    public void displaySweetAndSourPorkRecipe(){
        setRecipes("""
                You Selected Sweet and Sour Pork!
                Ingredients: Pork, bell peppers, pineapple, vinegar, sugar, soy sauce, cornstarch
                Cooking Time: 30 minutes
                Description: Crispy pork coated in a tangy sweet-and-sour sauce with fresh vegetables
                """);
        System.out.println(getRecipes());
    }
    // Displays Egg Fried Rice Recipe
    public void displayEggFriedRiceRecipe(){
        setRecipes("""
                You Selected Egg Fried Rice!
                Ingredients: Cooked rice, eggs, scallions, soy sauce, garlic, oil
                Cooking Time: 15 minutes
                Description: A simple yet flavorful fried rice dish with scrambled eggs and aromatic seasonings
                """);
        System.out.println(getRecipes());
    }
    // Displays Mapo Tofu Recipe
    public void displayMapoTofuRecipe(){
        setRecipes("""
                You Selected Mapo Tofu!
                Ingredients: Tofu, ground pork, Sichuan peppercorns, chili bean paste, garlic, ginger
                Cooking Time: 20 minutes
                Description: A spicy and numbing tofu dish with ground pork and bold Sichuan flavors
                """);
        System.out.println(getRecipes());
    }
    // Displays Beef and Broccoli Stir-Fry Recipe
    public void displayBeefAndBroccoliStirFryRecipe(){
        setRecipes("""
                You Selected Beef and Broccoli Stir-Fry!
                Ingredients: Beef slices, broccoli, soy sauce, garlic, ginger, oyster sauce
                Cooking Time: 20 minutes
                Description: Tender beef and crisp broccoli tossed in a savory sauce
                """);
        System.out.println(getRecipes());
    }
    // Displays Hot and Sour Soup Recipe
    public void displayHotAndSourSoupRecipe(){
        setRecipes("""
                You Selected Hot and Sour Soup!
                Ingredients: Mushrooms, tofu, bamboo shoots, vinegar, soy sauce, chili paste, egg
                Cooking Time: 30 minutes
                Description: A flavorful soup with a balance of spicy and tangy notes
                """);
        System.out.println(getRecipes());
    }
    // Displays Spring Rolls Recipe
    public void displaySpringRollsRecipe(){
        setRecipes("""
                You Selected Spring Rolls!
                Ingredients: Cabbage, carrots, mushrooms, shrimp or pork, soy sauce, wrappers
                Cooking Time: 40 minutes
                Description: Crispy, golden-brown rolls filled with a mix of vegetables and protein
                """);
        System.out.println(getRecipes());
    }
    // Displays Lo Mein Recipe
    public void displayLoMeinRecipe(){
        setRecipes("""
                You Selected Lo Mein!
                Ingredients: Egg noodles, bell peppers, carrots, soy sauce, garlic, sesame oil
                Cooking Time: 20 minutes
                Description: Soft noodles stir-fried with vegetables and a savory sauce
                """);
        System.out.println(getRecipes());
    }
    // Displays Char Siu Recipe
    public void displayCharSiuRecipe(){
        setRecipes("""
                You Selected Char Siu!
                Ingredients: Pork loin, hoisin sauce, soy sauce, honey, five-spice powder
                Cooking Time: 1 hour
                Description: Sweet and savory roasted pork with a caramelized glaze
                """);
        System.out.println(getRecipes());
    }
    // Displays Wonton Soup Recipe
    public void displayWontonSoupRecipe(){
        setRecipes("""
                You Selected Wonton Soup!
                Ingredients: Wonton wrappers, ground pork, shrimp, ginger, garlic, broth
                Cooking Time: 40 minutes
                Description: A comforting soup with delicate wontons in a flavorful broth   
                """);
        System.out.println(getRecipes());
    }
    /// Displaying recipe names for Dinner American
    public void displayDinnerAmericanRecipeNames(){
        setRecipeName("Classic Cheeseburger");
        setRecipeName("BBQ Pulled Pork Sandwiches");
        setRecipeName("Mac and Cheese");
        setRecipeName("Sloppy Joes");
        setRecipeName("Baked Ziti");
        setRecipeName("Chicken Caesar Salad Wraps");
        setRecipeName("Loaded Potato Casserole");
        setRecipeName("Philly Cheese Steak");
        setRecipeName("One-Pan Chicken and Vegetables");
        setRecipeName("Slow Cooker Chili");
        System.out.println(getRecipeName());
    }
    ///  Displaying recipes for Dinner American
    // Displays Classic Cheeseburger recipe
    public void displayClassicCheeseburgerRecipe(){
        setRecipes("""
                You Selected Classic Cheeseburger!
                Ingredients: Ground beef, salt, pepper, hamburger buns, American cheese, lettuce, tomato, pickles, condiments
                Cooking Time: 15 minutes
                Description: A juicy beef patty grilled to perfection, topped with melted cheese and fresh toppings
                """);
        System.out.println(getRecipes());
    }
    // Displays BBQ Pulled Pork Sandwiches recipe
    public void displayBBQPulledPorkSandwichesRecipe(){
        setRecipes("""
                You Selected BBQ Pulled Pork Sandwiches!
                Ingredients: Pulled pork, BBQ sauce, sandwich rolls, coleslaw (optional)
                Cooking Time: 4 hours (slow-cooked)
                Description: Tender, smoky pulled pork coated in tangy BBQ sauce, served on a toasted bun
                """);
        System.out.println(getRecipes());
    }
    // Displays Mac and Cheese recipe
    public void displayDinnerMacAndCheeseRecipe(){
        setRecipes("""
                You Selected Mac and Cheese!
                Ingredients: Elbow macaroni, butter, milk, cheddar cheese, flour, salt, pepper
                Cooking Time: 30 minutes
                Description: Creamy, cheesy pasta baked to golden perfection
                """);
        System.out.println(getRecipes());
    }
    // Displays Sloppy Joes recipe
    public void displayDinnerSloppyJoesRecipe(){
        setRecipes("""
                You Selected Sloppy Joes!
                Ingredients: Ground beef, onion, tomato sauce, Worcestershire sauce, hamburger buns
                Cooking Time: 20 minutes
                Description: A messy but delicious sandwich with seasoned ground beef in a rich tomato sauce
                """);
        System.out.println(getRecipes());
    }
    // Displays Baked Ziti recipe
    public void displayBakedZitiRecipe(){
        setRecipes("""
                You Selected Baked Ziti!
                Ingredients: Ziti pasta, marinara sauce, ricotta cheese, mozzarella cheese, Parmesan cheese
                Cooking Time: 40 minutes
                Description: A comforting baked pasta dish layered with cheese and rich tomato sauce
                """);
        System.out.println(getRecipes());
    }
    // Displays Chicken Caesar Salad Wraps recipe
    public void displayChickenCaesarSaladWrapsRecipe(){
        setRecipes("""
                You Selected Chicken Caesar Salad Wraps!
                Ingredients: Cooked chicken, Caesar dressing, romaine lettuce, tortillas, Parmesan cheese
                Cooking Time: 15 minutes
                Description: A fresh and flavorful wrap with grilled chicken and tangy Caesar dressing
                """);
        System.out.println(getRecipes());
    }
    // Displays Loaded Potato Casserole recipe
    public void displayLoadedPotatoCasseroleRecipe(){
        setRecipes("""
                You Selected Loaded Potato Casserole!
                Ingredients: Russet potatoes, butter, sour cream, cheddar cheese, bacon, chives
                Cooking Time: 45 minutes
                Description: A hearty baked potato dish packed with creamy, cheesy goodness
                """);
        System.out.println(getRecipes());
    }
    // Displays Philly Cheese Steak recipe
    public void displayDinnerPhillyCheeseSteakRecipe(){
        setRecipes("""
                You Selected Philly Cheese Steak!
                Ingredients: Thinly sliced beef, hoagie roll, provolone cheese, onions, bell peppers
                Cooking Time: 20 minutes
                Description: A savory sandwich with tender beef, melted cheese, and sautéed onions
                """);
        System.out.println(getRecipes());
    }
    // Displays One-Pan Chicken and Vegetables recipe
    public void displayOnePanChickenAndVegetablesRecipe(){
        setRecipes("""
                You Selected One-Pan Chicken and Vegetables!
                Ingredients: Chicken thighs, mixed vegetables (carrots, bell peppers, zucchini), olive oil, Italian seasoning
                Cooking Time: 40 minutes
                Description: A simple yet flavorful roasted chicken dish with seasoned vegetables
                """);
        System.out.println(getRecipes());
    }
    // Displays Slow Cooker Chili recipe
    public void displaySlowCookerChiliRecipe(){
        setRecipes("""
                You Selected Slow Cooker Chili!
                Ingredients: Ground beef, kidney beans, tomatoes, chili powder, onion, garlic
                Cooking Time: 6 hours (slow-cooked)
                Description: A hearty and spicy stew packed with beef, beans, and bold flavors
                """);
        System.out.println(getRecipes());
    }

    /// Displaying recipe names for Dinner Italian
    public void displayDinnerItalianRecipeNames(){
        setRecipeName("Pasta al Pomodoro");
        setRecipeName("Spaghetti Carbonara");
        setRecipeName("Margherita Pizza");
        setRecipeName("Osso Buco (Braised Veal Shank)");
        setRecipeName("Risotto alla Milanese");
        setRecipeName("Eggplant Parmesan (Melanzane alla Parmigiana)");
        setRecipeName("Gnocchi with Pesto");
        setRecipeName("Chicken Piccata");
        setRecipeName("Stuffed Shells");
        setRecipeName("Shrimp Fra Diavolo");
        System.out.println(getRecipeName());
    }
    /// Displaying recipes for Dinner Italian
    // Displays Pasta al Pomodoro Recipe
    public void displayPastaAlPomodoroRecipe(){
        setRecipes("""
                You Selected Pasta al Pomodoro!
                Ingredients: Fresh tomatoes, garlic, olive oil, basil, salt, pepper, spaghetti
                Cooking Time: 20 minutes
                Description: A simple yet flavorful pasta dish with fresh tomatoes and basil
                """);
        System.out.println(getRecipes());
    }
    // Displays Spaghetti Carbonara Recipe
    public void displaySpaghettiCarbonaraRecipe(){
        setRecipes("""
                You Selected Spaghetti Carbonara!
                Ingredients: Spaghetti, eggs, pancetta, Parmesan cheese, black pepper
                Cooking Time: 25 minutes
                Description: A creamy, savory pasta dish with crispy pancetta and rich egg-based sauce
                """);
        System.out.println(getRecipes());
    }
    // Displays Margherita Pizza Recipe
    public void displayDinnerMargheritaPizzaRecipe(){
        setRecipes("""
                You Selected Margherita Pizza!
                Ingredients: Pizza dough, tomato sauce, fresh mozzarella, basil, olive oil
                Cooking Time: 30 minutes
                Description: A classic Italian pizza with simple yet flavorful ingredients
                """);
        System.out.println(getRecipes());
    }
    // Displays Osso Buco Recipe
    public void displayOssoBucoRecipe(){
        setRecipes("""
                You Selected Osso Buco!
                Ingredients: Veal shank, carrots, celery, onions, white wine, broth, tomatoes
                Cooking Time: 2 hours
                Description: A slow-braised veal dish with a rich, aromatic sauce
                """);
        System.out.println(getRecipes());
    }
    // Displays Risotto alla Milanese Recipe
    public void displayDinnerRisottoAllaMilaneseRecipe(){
        setRecipes("""
                You Selected Risotto alla Milanese!
                Ingredients: Arborio rice, saffron, butter, Parmesan cheese, broth
                Cooking Time: 35 minutes
                Description: A creamy, golden risotto infused with saffron for a rich flavor
                """);
        System.out.println(getRecipes());
    }
    // Displays Eggplant Parmesan Recipe
    public void displayDinnerEggplantParmesanRecipe(){
        setRecipes("""
                You Selected Eggplant Parmesan!
                Ingredients: Eggplant, tomato sauce, mozzarella, Parmesan cheese, breadcrumbs
                Cooking Time: 45 minutes
                Description: Layers of crispy eggplant, rich tomato sauce, and melted cheese
                """);
        System.out.println(getRecipes());
    }
    // Displays Gnocchi with Pesto Recipe
    public void displayDinnerGnocchiWithPestoRecipe(){
        setRecipes("""
                You Selected Gnocchi with Pesto!
                Ingredients: Potato gnocchi, basil pesto, Parmesan cheese, pine nuts
                Cooking Time: 20 minutes
                Description: Soft, pillowy gnocchi coated in fragrant basil pesto
                """);
        System.out.println(getRecipes());
    }
    // Displays Chicken Piccata Recipe
    public void displayChickenPiccataRecipe(){
        setRecipes("""
                You Selected Chicken Piccata!
                Ingredients: Chicken breast, lemon juice, capers, butter, white wine
                Cooking Time: 30 minutes
                Description: A tangy and buttery chicken dish with capers and lemon
                """);
        System.out.println(getRecipes());
    }
    // Displays Stuffed Shells Recipe
    public void displayStuffedShellsRecipe(){
        setRecipes("""
                You Selected Stuffed Shells!
                Ingredients: Pasta shells, ricotta cheese, mozzarella, spinach, marinara sauce
                Cooking Time: 40 minutes
                Description: Jumbo pasta shells stuffed with creamy ricotta and baked in marinara sauce
                """);
        System.out.println(getRecipes());
    }
    // Displays Shrimp Fra Diavolo Recipe
    public void displayShrimpFraDiavoloRecipe(){
        setRecipes("""
                You Selected Shrimp Fra Diavolo!
                Ingredients: Shrimp, garlic, tomatoes, red pepper flakes, olive oil, pasta
                Cooking Time: 30 minutes
                Description: A spicy seafood pasta dish with bold flavors
                """);
        System.out.println(getRecipes());
    }
    /// Displaying recipe names for Dinner Japanese
    public void displayDinnerJapaneseRecipeNames(){
        setRecipeName("Teriyaki Chicken");
        setRecipeName("Katsu Curry");
        setRecipeName("Sukiyaki");
        setRecipeName("Okonomiyaki (Japanese Savory Pancake)");
        setRecipeName("Shabu-Shabu (Japanese Hot Pot)");
        setRecipeName("Gyoza (Japanese Dumplings)");
        setRecipeName("Unagi Don (Grilled Eel Rice Bowl)");
        setRecipeName("Nabeyaki Udon");
        setRecipeName("Yakitori (Grilled Chicken Skewers)");
        setRecipeName("Chirashi Sushi (Scattered Sushi Bowl)");
        System.out.println(getRecipeName());
    }
    /// Displaying recipes for Dinner Japanese
    // Displays Teriyaki Chicken Recipe
    public void displayTeriyakiChickenRecipe(){
        setRecipes("""
                You Selected Teriyaki Chicken!
                Ingredients: Chicken thighs, soy sauce, mirin, sugar, garlic, ginger
                Cooking Time: 30 minutes
                Description: Juicy chicken glazed with a sweet and savory teriyaki sauce
                """);
        System.out.println(getRecipes());
    }
    // Displays Katsu Curry Recipe
    public void displayKatsuCurryRecipe(){
        setRecipes("""
                You Selected Katsu Curry!
                Ingredients: Pork cutlet, Japanese curry roux, potatoes, carrots, onions, rice
                Cooking Time: 45 minutes
                Description: Crispy breaded pork cutlet served with rich Japanese curry over rice
                """);
        System.out.println(getRecipes());
    }
    // Displays Sukiyaki Recipe
    public void displaySukiyakiRecipe(){
        setRecipes("""
                You Selected Sukiyaki!
                Ingredients: Thinly sliced beef, tofu, mushrooms, cabbage, soy sauce, mirin, sugar
                Cooking Time: 40 minutes
                Description: A flavorful hot pot dish with beef and vegetables simmered in a sweet soy-based broth
                """);
        System.out.println(getRecipes());
    }
    // Displays Okonomiyaki Recipe
    public void displayOkonomiyakiRecipe(){
        setRecipes("""
                You Selected Okonomiyaki!
                Ingredients: Flour, eggs, cabbage, pork belly, bonito flakes, okonomiyaki sauce
                Cooking Time: 30 minutes
                Description: A savory pancake packed with cabbage and topped with a rich sauce
                """);
        System.out.println(getRecipes());
    }
    // Displays Shabu-Shabu Recipe
    public void displayShabuShabuRecipe(){
        setRecipes("""
                You Selected Shabu-Shabu!
                Ingredients: Thinly sliced beef, napa cabbage, mushrooms, tofu, dipping sauces
                Cooking Time: 30 minutes
                Description: A communal hot pot dish where ingredients are quickly swirled in boiling broth
                """);
        System.out.println(getRecipes());
    }
    // Displays Gyoza Recipe
    public void displayGyozaRecipe(){
        setRecipes("""
                You Selected Gyoza!
                Ingredients: Ground pork, cabbage, garlic, ginger, soy sauce, dumpling wrappers
                Cooking Time: 35 minutes
                Description: Crispy pan-fried dumplings filled with a flavorful pork and vegetable mixture
                """);
        System.out.println(getRecipes());
    }
    // Displays Unagi Don Recipe
    public void displayUnagiDonRecipe(){
        setRecipes("""
                You Selected Unagi Don!
                Ingredients: Grilled eel, soy sauce, mirin, sugar, rice
                Cooking Time: 30 minutes
                Description: Tender grilled eel glazed with a sweet soy-based sauce, served over rice
                """);
        System.out.println(getRecipes());
    }
    // Displays Nabeyaki Udon Recipe
    public void displayNabeyakiUdonRecipe(){
        setRecipes("""
                You Selected Nabeyaki Udon!
                Ingredients: Udon noodles, dashi broth, chicken, mushrooms, tempura shrimp, egg
                Cooking Time: 40 minutes
                Description: A comforting noodle soup with a variety of toppings
                """);
        System.out.println(getRecipes());
    }
    // Displays Yakitori Recipe
    public void displayYakitoriRecipe(){
        setRecipes("""
                You Selected Yakitori!
                Ingredients: Chicken thigh, soy sauce, mirin, sugar, skewers
                Cooking Time: 25 minutes
                Description: Juicy grilled chicken skewers brushed with a flavorful sauce
                """);
        System.out.println(getRecipes());
    }
    // Displays Chirashi Sushi Recipe
    public void displayChirashiSushiRecipe(){
        setRecipes("""
                You Selected Chirashi Sushi!
                Ingredients: Sushi rice, assorted sashimi, cucumber, avocado, soy sauce
                Cooking Time: 30 minutes
                Description: A colorful sushi bowl with fresh fish and vegetables
                """);
        System.out.println(getRecipes());
    }
    /// Displaying recipe names for Dinner Chinese
    public void displayDinnerChineseRecipeNames(){

    }
}