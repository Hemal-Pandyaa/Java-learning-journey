public class QuickSort {

    public static int Sort(int arr[],int start,int end){
        int pidx = end,i=start - 1;
        for(int j = start; j < end; j++){
            if(arr[j] < arr[pidx]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[pidx];
        arr[pidx] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void quickSort(int arr[], int start, int end){
        if(end < start){
            return;
        }else{
            int pivot = Sort(arr, start, end);

            // Number smaller than pivot
            quickSort(arr, start, pivot-1);

            // Number larger than pivot
            quickSort(arr,  pivot+1, end);

        }
        
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };

        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
