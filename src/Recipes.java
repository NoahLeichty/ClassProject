import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Recipes {
    private List<String> setBreakfast;
    private List<String> setLunch;
    private List<String> setDinner;


    public Recipes(){
        this.setBreakfast = new ArrayList<>();
        this.setLunch = new ArrayList<>();
        this.setDinner = new ArrayList<>();
    }

    public void setBreakfast(){
        // american cuisine list
        List <String> american = new ArrayList<>();
        // italian cuisine list
        List <String> italian = new ArrayList<>();
        // japanese cuisine list
        List <String> japanese = new ArrayList<>();
        // chinese cuisine list
        List <String> chinese = new ArrayList<>();
    }
    public String getBreakfast(){
        return "";
    }
    public void setLunch(List<String> setLunch){
        this.setLunch = setLunch;
        // american cuisine list
        List <String> american = new ArrayList<>();
        american.add("example");
        // italian cuisine list
        List <String> italian = new ArrayList<>();
        italian.add("example");
        // japanese cuisine list
        List <String> japanese = new ArrayList<>();
        japanese.add("example");
        // chinese cuisine list
        List <String> chinese = new ArrayList<>();
        chinese.add("example");
    }
    public String getLunch(){
        return String.join("", this.setLunch);
    }
    public void setDinner(){
        // american cuisine list
        List <String> american = new ArrayList<>();
        // italian cuisine list
        List <String> italian = new ArrayList<>();
        // japanese cuisine list
        List <String> japanese = new ArrayList<>();
        // chinese cuisine list
        List <String> chinese = new ArrayList<>();
    }
    public String getDinner(){
        return "";
    }
}