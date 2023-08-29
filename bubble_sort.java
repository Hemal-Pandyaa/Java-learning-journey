public class bubble_sort {
    public static void main(String args[]){
        int arr[] = {7,8,3,1,2};
        boolean swap = false;

        // bubble sort 
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                // already sorted 
                if(arr[j] <= arr[j+1]){
                    continue;
                }else{
                    // swapping 
                    swap = true;
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                }
            // to save interation is specefic scenario or when array is sorted 
            if(swap == false){
                    break;
                }
            }
        }
        // printing array 
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
