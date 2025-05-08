import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Recipes {
    // Variables
    private String name;
    private List<String> ingredients;
    private String instructions;

    // Constructor
    public Recipes(String name, List<String> ingredients, String instructions) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }
    // Getter for recipe name
    public String getName(){
        return name;
    }
    // Getter for recipe ingredients
    public List<String> getIngredients(){
        return ingredients;
    }
    // getter for instructions
    public String getInstructions(){
        return instructions;
    }
}