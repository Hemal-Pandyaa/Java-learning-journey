public class all_subset {
    public static void subsets(int n,String subset){
        if(n == 0){
            System.out.println(subset);
            return;
        }
        // want to be
        subsets(n - 1, subset + n);
        // do not want to be
        subsets(n - 1,subset);
        
    }

    public static void main(String args[]){
        int n = 4;
        subsets(n, "");
    }
}
