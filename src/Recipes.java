import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Recipes {

    // Lists for recipes
    private final List<String> american;
    private final List<String> italian;
    private final List<String> japanese;
    private final List<String> chinese;

    // Constructor
    public Recipes(){
        this.chinese=new ArrayList<>();
        this.japanese=new ArrayList<>();
        this.italian=new ArrayList<>();
        this.american=new ArrayList<>();
    }
    // Setter for American
    public void setAmerican(String recipe) {
        Utilities utilities = new Utilities();
        this.american.add(recipe);
    }
    // Getter for American
    public List<String> getAmerican(){
        Utilities utilities = new Utilities();
        return this.american;
    }
    // Setter for Italian
    public void setItalian(String recipe){
        this.italian.add(recipe);
    }
    // Getter for Italian
    public String getItalian(){
        return this.italian.toString();
    }
    // Setter for Japanese
    public void setJapanese(String recipe){
        this.japanese.add(recipe);
    }
    // Getter for Japanese
    public String getJapanese(){
        return this.japanese.toString();
    }
    // Setter for Chinese
    public void setChinese(String recipe){
        this.chinese.add(recipe);
    }
    // Getter for Chinese
    public String getChinese(){
        return this.chinese.toString();
    }
}
