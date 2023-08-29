public class n_sum {
    public static int nSum(int n){
        if(n == 0){
            return 0;
        }
        return n + nSum(n-1);
    }

    public static void main(String args[]){
        int n = 5;
        System.out.println(nSum(n));
    }
}
