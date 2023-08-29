public class print_in_reverse {

    public static void printReverse(String name, int idx){
        if(idx == 0){
            System.out.println(name.charAt(0));
            return;
        }
        System.out.println(name.charAt(idx));
        printReverse(name, idx - 1);
        return;
    }
    public static void main(String args[]){
        String name = "aydnaP lameH";
        printReverse(name,name.length() - 1);
    }
}