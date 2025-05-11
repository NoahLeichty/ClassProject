import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SimpleTimeZone;

// Stores recipes
public class Recipes {

    String recipe;
    private List<String> italian;
    private List<String> japanese;
    private List<String> chinese;

    // Constructor
    public Recipes() {
        this.recipe = recipe;
        this.italian = new ArrayList<>();
        this.japanese = new ArrayList<>();
        this.chinese = new ArrayList<>();
    }
    private void setBreakfast(String recipe){
        this.recipe = recipe;
        List<String> breakfastAmerican = new ArrayList<>();
        breakfastAmerican.add("Something");
        this.recipe = breakfastAmerican.toString();
        List<String> breakfastItalian = new ArrayList<>();
        breakfastItalian.add("Something else");
    }
    public String getBreakfast(){
        return String.join("""
                //:""" , recipe);
    }
    private void setLunch(){

    }
    public String getLunch(){
        return "";
    }
    private void setDinner(){
    }
    public String getDinner(){
        return "";
    }

    public void setAmerican(List<String> american) {
        //this.american = american;// Create a copy to avoid external modification
    }
    public String getAmerican() {
        //return String.join("""
                //:""" , american);
        return "";
    }
    public void setItalian(List<String> newLunch) {
        this.italian = new ArrayList<>(newLunch);
    }
    public String getItalian() {
        return String.join("""
                :""" , italian);
    }
    public void setJapanese(List<String> newDinner) {
        this.japanese = new ArrayList<>(newDinner);
    }
    public String getJapanese() {
        return String.join("""
                :
                """ , japanese);
    }
    public void setChinese(List<String> newDinner) {
        this.chinese = new ArrayList<>(newDinner);
    }
    public String getChinese() {
        return String.join(""" 
                :
                """, chinese);
    }
}