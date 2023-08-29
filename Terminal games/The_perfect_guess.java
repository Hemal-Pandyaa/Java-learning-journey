import java.util.Scanner;
import java.util.Random;

public class The_perfect_guess {
    public static void main(String[] args){
        System.out.println("Welcome, to the Perfect Guess");
        Scanner sn = new Scanner(System.in);
        int Guess = -1;
        Random rn = new Random();
        int random = rn.nextInt(100) + 1;

        
        while(Guess != random){
            System.out.println("Enter Your Guess!");
            Guess = sn.nextInt();

            if(Guess > random){
                System.out.println("Try, A smaller number!");
            }
            else if(Guess < random){
                System.out.println("Try, A bigger number!");
            }
            else{
                System.out.println("Congratulations, on your win number is: " + Guess);
                break;
            }
            
        }
    sn.close();
    }
}
