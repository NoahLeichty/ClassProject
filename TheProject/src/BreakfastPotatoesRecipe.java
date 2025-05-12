public class BreakfastPotatoesRecipe implements Recipe {
    public String getTitle() {
        return "Breakfast Potatoes";
    }
    // Displays ingredients
    public String getIngredients() {
        return "- Potatoes\n- Oil (Olive, Canola, or personal preference)\n- Seasoning (As desired)\n- Cheese (Optional)";
    }
    // Displays instructions
    public String getInstructions() {
        return "1. Dice potatoes.\n2. Fry in oil until crispy and golden.\n3. Season and sprinkle your choice of cheese on top.\n4. Enjoy!!";
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