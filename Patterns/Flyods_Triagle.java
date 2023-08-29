import java.util.Scanner;

class Floyds_Triangle{
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sn.nextInt();
        int k = 1 ;
        for(int i = 0; i < n; i ++){
            for(int j = 0; j <= i ; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
        sn.close();
    }
}