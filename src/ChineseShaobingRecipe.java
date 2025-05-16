    //A class for the Shaobing recipe.
public class ChineseShaobingRecipe implements Recipe {
    public String getTitle() {
        return "Chinese Shaobing";
    }
    // Displays ingredients
    public String getIngredients() {
        return "- 1 Cup of Flour\n- 4 Tablespoons of Sesame seeds\n- Vegetable Oil";
    }
    // Displays instructions
    public String getInstructions() {
        return "1. Make dough and flatten it.\n2. Coat the top of the dough with sesame seeds.\n3. Bake the dough until golden.\n4. Enjoy!!";
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
        System.out.println("📝 Ingredients:\n" + getIngredients());
        System.out.println("👨‍🍳 Instructions:\n" + getInstructions());
    }
}
