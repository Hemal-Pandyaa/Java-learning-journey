public class Tower_of_hanoi {
    public static void towerOfHanoi(int n, String src, String Dest, String Help){
        if(n == 1){
            System.out.println("Transffered disk 1 from " + src + " source " + Dest);
            return;
        }
        towerOfHanoi(n - 1, src, Help, Dest);
        System.out.println("Transferring disk " + (n) + " from " + src + " to " + Dest);
        towerOfHanoi(n - 1, Help, Dest, src);
        return;
        }

    public static void main(String args[]){
        int n = 5;
        towerOfHanoi(n, "S", "D", "H");
    }
}
