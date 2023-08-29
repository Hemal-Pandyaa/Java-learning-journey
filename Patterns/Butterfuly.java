import java.util.Scanner;

public class Butterfuly {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sn.nextInt();   

        for(int i = 0; i < n; i++){

            // loop 1
            for(int j = 0; j <i; j++){
            System.out.print("* ");
            }

            // loop 2
            for(int j = 0; j <n-i;j++){
                System.out.print("  ");
            }

            // loop 3
            for(int j = 0; j < n - i; j ++){
                System.out.print("  ");
            }

            // loop 4
            for(int j = 0; j <i; j++){
            System.out.print("* ");
            }

            System.out.println();
        } 
        for(int i = 0; i < n; i++){

            
            // loop 5
            for(int j = 0; j <n-i;j++){
                System.out.print("* ");
            }

            // loop 6
            for(int j = 0; j <i; j++){
                System.out.print("  ");
            }

            // loop 7
            for(int j = 0; j <i; j++){
                System.out.print("  ");
            }

            // loop 8
            for(int j = 0; j <n-i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
      
        sn.close();
    }
}
