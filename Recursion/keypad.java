public class keypad {
    public static String[] layout = {".","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz,"};
    public static void combination(String pressed, int idx, String combination){
        if(idx == pressed.length()){
            System.out.println(combination);
            return;
        }
        int currNumber = Character.getNumericValue(pressed.charAt(idx));
        String currcharacters = layout[currNumber];
        for(int i = 0; i < currcharacters.length(); i++){
            combination(pressed,idx + 1, combination + currcharacters.charAt(i));
        }
    }

    public static void main(String args[]){
        String str = "23";
        combination(str,0,"");
    }
}
