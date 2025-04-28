import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Will have user select recipes
public class Main {
    private static final Scanner scan = new Scanner(System.in);

    // Call constructor of Utilities
    public static void getUtilities(){
        Utilities utilities = new Utilities();
        System.out.println(utilities);
    }

    public static void main(String[] args) {
        // Call Utilities
        getUtilities();
    }
}