public class Sorted_or_not {
    // assumes the arr to to be int!
    public static void sortedOrNot(int arr[],int first_element,int idx){
        if(idx == arr.length){
            System.out.println("True");
            return;
        }
        if(arr[idx] > first_element){
            sortedOrNot(arr, arr[idx], idx + 1);
        }else{
            System.out.println("False");
            return;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,3,2,4,5};
        sortedOrNot(arr,0,1);
    }
}
