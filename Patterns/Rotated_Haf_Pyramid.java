import java.util.Scanner;

class Rotated_Half_Pyramid{
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sn.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print("  ");
            }
            for(int j = 0; j <= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sn.close();
    }
}