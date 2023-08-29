public class recursion {
    public static void print(int n){
        if(n == 0){
            return;
        }
        print(n - 1);
        System.out.print(n + " ");
    }
    
    public static void main(String args[]){
        print(14398); // 14398 is the max limit
    }
}
