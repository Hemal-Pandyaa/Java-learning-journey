public class X_pow_n {

    public static int findPow(int x,int n){
        System.out.println("I used " + n + " iteration or recursion");
        if(n == 1){
            return x;
        }
        else if(n == 0){
            return 1;
        }
        return x * x * findPow(x, n - 2);
    }
    public static void main(String args[]){
        int x = 10;
        int n = 26;
        int c  = findPow(x,n);
        System.out.println(c);
    }
}
