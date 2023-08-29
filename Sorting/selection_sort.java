public class selection_sort {

    public static void main(String main[]){
        int arr[] = {7,8,3,1,2};
        int smallest = Integer.MAX_VALUE;
        int smallest_index = arr.length;

        for(int i = 0; i < arr.length; i++){
            smallest = Integer.MAX_VALUE;
            smallest_index = arr.length;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < smallest){
                    smallest_index = j;
                    smallest = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest_index];
            arr[smallest_index] = temp;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
        
}
