import java.util.Scanner;

public class Half_Pyramid {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sn.nextInt();
        for(int i = 0;i <n;i++){
            // We cannot multiply strings in java as python
            for(int j = 0; j <= i; j ++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sn.close();
    }
}
