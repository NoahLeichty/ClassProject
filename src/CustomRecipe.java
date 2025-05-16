import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class CustomRecipe implements Recipe {
    private final String ingredients;
    private final String instructions;

    public CustomRecipe(String title, String ingredients, String instructions) {
        super();
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public String getIngredients() {
        return "";
    }

    @Override
    public String getInstructions() {
        return "";
    }

    @Override
    public void display() {
        System.out.println("Recipe: " + title);
        System.out.println(ingredients);
        System.out.println(instructions);
    }
}
