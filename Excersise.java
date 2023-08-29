import java.util.Scanner;

public class Excersise {

    public static int Findaverage(int a,int b,int c){
        return (a + b + c) / 3;
    }
    public static void printodd(int n){
        for(int i = 0; i<n ; i++){
            if(i % 2==0){
                continue;
            }else{
                System.out.println(i);
            }
        }
    }

    public static int greater(int n,int m){
        return Math.max(n,m);
    }

    public static double circumfrence(float r){
        return (r * Math.PI) * 2;
    }

    public static void main(String[] args){

        // problem 1 
        System.out.println("Problem 1");
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter 3 number:");
        int n = sn.nextInt();
        int m = sn.nextInt();
        int k = sn.nextInt();

        int average = Findaverage(n,m,k);
        System.out.println(average + " is the average of " + n + "," + m + " and " + k);

        // problem 2 
        System.out.println("\nProblem 2");
        System.out.println("Enter a number: ");
        n = sn.nextInt();
        printodd(n );
         // problem 3 
        System.out.println("\n Problem 3");
        System.out.println("Enter 2 number:");
        n = sn.nextInt();
        m = sn.nextInt();
        System.out.println(greater(n,m) + " is greater among " + n + " and " + m);

        // problem 4
        System.out.println("\nProblem 4");
        float r = sn.nextFloat();
        System.out.println(circumfrence(r));
        sn.close();

    }

}
