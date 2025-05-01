import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Will have user select recipes
public class Main {
    private static final Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        Utilities utilities = new Utilities();
        Recipes recipes = new Recipes();
        System.out.println(recipes.getLunch());
    }
}