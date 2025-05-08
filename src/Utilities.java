import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Utilities {
    private static final Scanner scan = new Scanner(System.in);

    //Constructor
    public Utilities(){
        greeting();
    }

    // greeting setter
    private void greeting() {
        Loop:
        {
            System.out.println("""
                    Please select what meal you want!
                    \t1. Breakfast
                    \t2. Lunch
                    \t3. Dinner
                    \t4. Exit
                    """);

            int choice;
            choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    getBreaksfast();
                    return;
                case 2:
                    getLunch();
                    return;
                case 3:
                    getDinner();
                    return;
                case 4:
                    break Loop;
                default:
                    System.out.println("Invalid choice! Exiting...");
            }
        }
    }
    private void setBreakfast() {
    }
    public String getBreaksfast(){
        return "";
    }
    private void setLunch(String lunch){
    }
    public String getLunch() {
        return "";
    }
    private void setDinner(){

    }
    public String getDinner(){
        return "";
    }

    // toString for exiting message
    public String toString(){
        return "Thanks for using our app!";
    }
}
