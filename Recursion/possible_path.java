public class possible_path {
    public static int possPath(int curr_location[], int n, int m,int count){

        if((curr_location[0] == n - 1) && (curr_location[1] == m - 1)){
            count++;
            return count;
        }

        if(curr_location[0] < n - 1){
            curr_location[0]++;
            count = possPath(curr_location,n,m,count);
            curr_location[0]--;
        }
        if(curr_location[1] < m){
            curr_location[1]++;
            count = possPath(curr_location,n,m,count);
            curr_location[1]--;
        }
        return count;
    }

    public static void main(String args[]){
        int n = 4, m = 3;
        int arr[] = {0,0};
        int a = possPath(arr, n, m, 0);
        System.out.println(a);
    }
}
