public class party_pair {
    public static int invitingWays(int n){
        if(n <= 0){
            return 1;
        }

        //invite alone 
        int count = invitingWays(n - 1);
        //invite with i
        count += (n-1) * invitingWays(n - 2);
        return count;
    }

    public static void main(String args[]){
        int n = 4;
        System.out.println(invitingWays(n));
    }
    
}
