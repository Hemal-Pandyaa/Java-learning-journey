import java.util.Scanner;

public class Hollow_rectengle {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a number(Incase you are wondering. Why?, Then stop wondering)");
        int n = sn.nextInt();
        for(int i = 0;i < n; i++){

            for (int j = 0;j<n;j++){

                if(j == 0 || j == n - 1|| i == 0 ||i == n - 1){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
        sn.close();
    }
}