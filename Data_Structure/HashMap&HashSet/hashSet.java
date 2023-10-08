import java.util.HashSet;

public class hashSet {
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();
        set.add(7);
        set.add(5);
        set.add(9);
        set.add(8);
        System.out.println(set);
        for(int i:set){
            System.out.println(i);
        }
    }
}