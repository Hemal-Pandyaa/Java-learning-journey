public class Delete_Dublicate {
    public static int[] map = new int[25];
    public static void removeDublicate(String str, int idx,String finalString){
        if(idx == str.length()){
            System.out.println(finalString);
            return;
        }

        int curridx = str.charAt(idx) - 'a';
        if(map[curridx] == 0){
            map[curridx]++;
            finalString += str.charAt(idx);
            removeDublicate(str, idx+1, finalString);
        }
        else{
            removeDublicate(str, idx+1, finalString);
        }
    }
    public static void main(String args[]){
        String str = "aabacdabcccssda";
        removeDublicate(str.toLowerCase(),0,"");
    }
}
