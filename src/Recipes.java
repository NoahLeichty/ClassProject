import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SimpleTimeZone;

// Stores recipes
public class Recipes {

    // ToDo add allergy option
    // ToDo make this better
    // ToDo add ascii art
    // ToDo add more comments

    private List<String> recipeName;
    private List<String> recipes;

    // Constructor
    public Recipes() {
        this.recipeName = new ArrayList<>();
        this.recipes = new ArrayList<>();
    }
    public String getRecipeName(int index){
        if (index >= 0 && index < recipeName.size()) {
            return recipeName.get(index);
        } else {
            System.out.println("Invalid recipe");
        }
        StringBuilder recipe = new StringBuilder();
        for (int i = 0; i < recipeName.size(); i++) {
            recipe.append(i + 1).append(". ").append(recipeName.get(i));
            if (i < recipeName.size() - 1) {
                recipe.append("\n");
            }
        }
        return recipe.toString();

    }
    public void setRecipeName(String recipeName, int index){
        this.recipeName.add(recipeName);
    }
    public String getRecipes(int index) {
        StringBuilder recipe = new StringBuilder();
        for (int i = 0; i < recipes.size(); i++) {
            recipe.append(recipes.get(i));
            if (i < recipes.size() - 1) {
                recipe.append("");
            }
        }
        if (index >= 0 && index < recipes.size()) {
            return recipes.get(index);
        } else {
            System.out.println("Invalid recipe");
        }
        return recipe.toString();
    }
    public void setRecipes(String recipe, int index) {
        this.recipes.add(recipe);
    }
}