import java.util.Scanner;

public class Half_Pyramid_with_number {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sn.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i;j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        sn.close();
    }
}
