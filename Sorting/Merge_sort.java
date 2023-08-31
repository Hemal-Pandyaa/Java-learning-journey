public class Merge_sort {

    public static void Conquer(int arr[], int start,int mid,int end){
        int merged[]= new int[end-start + 1];
        int p = start,q=mid+1,x=0;
        while(p<=q && p <= mid && q <= end){
            if(arr[p] <= arr[q]){
                merged[x++] = arr[p++];
            }else{
                merged[x++] = arr[q++];
            }
        }

        while(p <= mid){
            merged[x++] = arr[p++];
        }

        while(q <= end){
            merged[x++] = arr[q++];
        }

        for(int i = 0,j=start; i < merged.length; i++,j++){
            arr[j] = merged[i];
        }
    }

    public static void mergeSort(int arr[],int start,int end){
        if(start >= end){
            return;
        }
        // Divide
        int mid = start + (end - start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        // Conquer
        Conquer(arr,start,mid,end);
        

    }



    public static void main(String args[]){
        int arr[] = {6,3,5,9,2,8};
        mergeSort(arr,0,arr.length-1);
        for(int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
        }
    }
}