public class Subsequences {
    public static void subsequences(String str, int idx, String subsequence){
        if(idx == str.length()){
            System.out.println(subsequence);
            return;
        }

        // Let's belive in our function that it will return me everything it two where in one case the next character will be in str and in one it will be not
        
        // Case 1
        // This add ths next char
        char currChar = str.charAt(idx);
        subsequences(str,idx + 1,subsequence + currChar);

        // Case 2 is the same except we dont add the character
        subsequences(str,idx + 1,subsequence);
    }

    public static void main(String args[]){
        String test = "abcd";
        subsequences(test, 0, "");
    }
}
