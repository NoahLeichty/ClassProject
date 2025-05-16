    //A class for the Pancakes recipe.
public class PancakesRecipe implements Recipe {
    public String getTitle() {
        return "Pancakes";
    }
    // Displays ingredients
    public String getIngredients() {
        return "- 1 Cup of Flour\n- 1 Large Egg\n- 1 Cup of Milk";
    }
    // Displays instructions
    public String getInstructions() {
        return "1. Mix ingredients into large bowl.\n2. Heat a skillet at medium-low temperature.\n3. Pour batter and cook until golden.\n4. Enjoy!!";
    }
    // A little ASCII art to liven it up before displaying instructions/ingredients
    public void display() {
        System.out.println("       _\n" +
                           "      / )\n" +
                           "|||| / /\n" +
                           "||||/ /\n" +
                          "\\__(_/\n" +
                           " ||//\n" +
                           " ||/\n" +
                           " ||\n" +
                           "(||   \n" +
                           " \"\"" + getTitle());
        System.out.println("Ingredients:\n" + getIngredients());
        System.out.println("Instructions:\n" + getInstructions());
    }
}