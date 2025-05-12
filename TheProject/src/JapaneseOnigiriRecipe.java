public class JapaneseOnigiriRecipe implements Recipe {
    public String getTitle() {
        return "Japanese Onigiri";
    }
    // Displays ingredients
    public String getIngredients() {
        return "- Cooked rice (Jasmine or personal preference)\n- Nori (Seaweed)\n- Filling (e.g. pickled plum, salmon, or personal preference)";
    }
    // Displays instructions
    public String getInstructions() {
        return "1. Shape the rice into a triangle.\n2. Insert chosen filling as desired.\n3. Wrap the rice triangle with nori.\n4. Enjoy!!";
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