import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Recipes {

    // Constructor
    public Recipes(){
        setLunchRecipes();
    }
    // Setter
    public void setLunchRecipes() {
        List<String> american = new ArrayList<>();
        american.add("Not-So-Sloppy Joes");
        american.add("Homemade Beef Burger");
        american.add("Tater Tot Casserole");

        // Italian cuisine
        List<String> italian = new ArrayList<>();
        italian.add("Italian BLT Sandwich");
        italian.add("Italian Rosemary Chicken Wings");
        italian.add("Italian Sausage and Caramelized Onion Pizza");

        //Japanese cuisine
        List<String> japanese = new ArrayList<>();
        japanese.add("Furikake Salmon");
        japanese.add("Spicy Tuna Onigiri (Japanese Rice Balls)");
        japanese.add("Teriyaki Spam Musubi");

        //Chinese cuisine
        List<String> chinese = new ArrayList<>();
        chinese.add("Egg Rolls");
        chinese.add("Szechwan Shrimp");
        chinese.add("Potstickers (Chinese Dumplings)");
    }
}
