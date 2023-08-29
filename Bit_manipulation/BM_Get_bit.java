public class BM_Get_bit {
    public static int Get_bit(int n, int position){
        int bit_mask = 1<<position;
        if((bit_mask & n) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int set_bit(int n, int position){
        int bit_mask = 1<<position;
        int answer = bit_mask | n;
        return answer;
    } 

    public static int clear_bit(int n, int position){
        int bit_mask = 1<<position;
        int answer = ~bit_mask & n;
        return answer;
    } 

    public static int update_bit(int n,int position){
        int bit = Get_bit(n, position);
        if(bit == 0){
            int answer = set_bit(n, position);
            return answer;
        }else{
            int answer = clear_bit(n, position);
            return answer;
        }
        
    }

    public static void main(String args[]){
        int n = 5;
        int position = 2;
        System.out.println("This is get bit function to get bit of " + n + " at position " + position + " which is "+Get_bit(n, position));
        System.out.println();
        position = 1;
        System.out.println("This is function to set bit of " + n + " at position " + position + " and makes the bit to " + set_bit(n, position));
        System.out.println();
        position = 3;
        System.out.println("This is clear bit function it clears the bit of " + n + " at position " + position + " which makes it " + clear_bit(n, position));
        System.out.println();
        position = 0;
        System.out.println("This is update bit function it updates the bit and make 0 to 1 and 1 to 0 it updates " + n + " at position  " + position + " to " + update_bit(n,position));
    }
}
