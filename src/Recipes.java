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
    private List<String> american;
    private List<String> italian;
    private List<String> japanese;
    private List<String> chinese;

    // Constructor
    public Recipes() {
        this.recipeName = new ArrayList<>();
        this.american = new ArrayList<>();
        this.italian = new ArrayList<>();
        this.japanese = new ArrayList<>();
        this.chinese = new ArrayList<>();
    }
    public String getRecipeName(){
        StringBuilder recipe = new StringBuilder();
        for (int i = 0; i < recipeName.size(); i++) {
            recipe.append(i + 1).append(". ").append(recipeName.get(i));
            if (i < recipeName.size() - 1) {
                recipe.append("\n");
            }
        }
        return recipe.toString();
    }
    public void setRecipeName(String recipeName){
        this.recipeName.add(recipeName);
    }
    public String getAmerican() {
        StringBuilder recipe = new StringBuilder();
        for (int i = 0; i < american.size(); i++) {
            recipe.append(american.get(i));
            if (i < american.size() - 1) {
                recipe.append("");
            }
        }
        return recipe.toString();
    }

    public void setAmerican(String american, int index) {
        this.american.add(american);
        // This breaks everything for now
        /*if (index >= 0 && index < american.size()) {
            System.out.println(american.get(index));
        } else {
            System.out.println("Invalid recipe");
        }*/
    }

    public String getItalian() {
        StringBuilder recipe = new StringBuilder();
        for (int i = 0; i < italian.size(); i++) {
            recipe.append(i + 1).append(". ").append(italian.get(i));
            if (i < italian.size() - 1) {
                recipe.append("\n");
            }
        }
        return recipe.toString();
    }

    public void setItalian(List<String> italian) {
        this.italian = italian;
    }

    public String getJapanese() {
        StringBuilder recipe = new StringBuilder();
        for (int i = 0; i < japanese.size(); i++) {
            recipe.append(i + 1).append(". ").append(japanese.get(i));
            if (i < japanese.size() - 1) {
                recipe.append("\n");
            }
        }
        return recipe.toString();
    }

    public void setJapanese(List<String> japanese) {
        this.japanese = japanese;
    }

    public String getChinese() {
        StringBuilder recipe = new StringBuilder();
        for (int i = 0; i < chinese.size(); i++) {
            recipe.append(i + 1).append(". ").append(chinese.get(i));
            if (i < chinese.size() - 1) {
                recipe.append("\n");
            }
        }
        return recipe.toString();
    }

    public void setBreakfastChinese(List<String> chinese) {
        this.chinese = chinese;
    }
}