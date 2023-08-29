public class print_all_permutation {

    public static void printPermutations(String str, String permute){
        if(str.length() == 0){
            System.out.println(permute);
            return;
        }
        for(int i = 0; i < str.length();i++){
            char currChar = str.charAt(i);
            String temp = str.substring(0, i) + str.substring(i + 1 );
            printPermutations(temp, permute + currChar);
        }
    }
    public static void main(String args[]){
        String str = "abcd";
        printPermutations(str, "");

    }
    
}
