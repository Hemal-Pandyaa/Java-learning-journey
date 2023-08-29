public class find_first_and_last {

    public static int[] firstAndLast(String str, int idx, int first, int last, char element){
        if(idx == 0){
            if(str.charAt(idx) == element){
                first = 0;
                if(last == -1){
                    last = 0;
                }
            }
            int ans[] = {first,last};
            return ans;
        }

        if(str.charAt(idx) == element){
            first = idx;
            if(last == -1){
                last = idx;
            }
        }
        return firstAndLast(str, idx-1, first, last, element);


    }
    public static void main(String args[]){
        String str = "basdasdvasdfasdaaskjas";
        char element = 'a';
        int c[] = firstAndLast(str,str.length() - 1,-1,-1,element);
        System.out.println("The element \"" + element + "\" is first found at index " +c[0] + " and lastly at index " + c[1]);
    }
}
