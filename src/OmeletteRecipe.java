    //A class for the Omelette recipe.
public class OmeletteRecipe implements Recipe {
    public String getTitle() {
        return "Omelette";
    }
    // Displays ingredients
    public String getIngredients() {
        return "- 2 Large Eggs\n- Salt (As desired)\n- Vegetables (As desired)";
    }
    // Displays instructions
    public String getInstructions() {
        return "1. Beat eggs and combine with salt as desired.\n2. Add your choice of veggies.\n3. Cook in pan until set.\n4. Enjoy!!";
    }
    // A little ASCII art to liven it up ;)
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
