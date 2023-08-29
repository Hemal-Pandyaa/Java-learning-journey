public class swap_with_bitwise {
    public static void main(String args[]){
        int a = 5; // 0101
        int b = 1; // 0001
        System.out.println(a);
        System.out.println(b);
        a = a ^ b; // 0101 ^ 0001 = 0100 = 4
        b = a ^ b; // 0100 ^ 0001 = 0101 = 5
        a = a ^ b; // 0100 ^ 0101 = 0001 = 1
        System.out.println(a);
        System.out.println(a);
        System.out.println(b);
    }
}

