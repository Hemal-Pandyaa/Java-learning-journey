import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_scissor {
    public static void main(String[] args){
        System.out.println("\t\t\t\t\t\t\t\tWelcome,to the game of Rock,Paper,Sissor");
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter s for sissor r for Rock p for Paper");
        String uselect = sn.nextLine();
        sn.close();
        Random rn = new Random();
        int random = rn.nextInt(3) + 1;
        String r = "a";
        if(random == 1){
            r = "r";
        }
        else if(random == 2){
            r = "s";
        }
        else{
            r = "p";
        }
                
        if(uselect.equals("s") && r.equals("r")){
            System.out.println("You Selected: " + uselect + "\nComputer Selected: " + r + "\nResult: Lose");
        }
        else if(uselect.equals("s") && r.equals("p")){
            System.out.println("You Selected: " + uselect + "\nComputer Selected: " + r + "\nResult: Win");
        }
        else if(uselect.equals("p") && r.equals("r")){
            System.out.println("You Selected: " + uselect + "\nComputer Selected: " + r + "\nResult: Win");
        }
        else if(uselect.equals("p") && r.equals("s")){
            System.out.println("You Selected: " + uselect + "\nComputer Selected: " + r + "\nResult: Lose");
        }
        else if(uselect.equals("r") && r.equals("p")){
            System.out.println("You Selected: " + uselect + "\nComputer Selected: " + r + "\nResult: Lose");
        }
        else if(uselect.equals("r") && r.equals("s")){
            System.out.println("You Selected: " + uselect + "\nComputer Selected: " + r + "\nResult: Win");
        }
        else{
            System.out.println("You Selected: " + uselect + "\nComputer Selected: " + r + "\nResult: Draw");
        }

    }
}
