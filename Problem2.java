
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get it table(In case you are wondering): ");
        int n = sc.nextInt();
        for(int i = 1;i < 10 + 1;i++){
            System.out.println(n + " X " + i + " = " + (i*n) );
        }
        sc.close();
    }
        
}
