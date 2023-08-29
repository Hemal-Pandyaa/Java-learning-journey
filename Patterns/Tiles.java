public class Tiles {
    public static int ways(int n, int m,int curr,int count,String test){
        if(curr >= n){
            System.out.println(test);
            count++;
            return count;
        }else{
            // Horizontal Placment
            if(n - curr >= 1 ){
                count = ways(n, m, curr + 1, count,test+="H");
                test = test.substring(0, test.length() - 1);
            }
            // Vertical Placment
            if(n - curr >= 2){
                count = ways(n, m, curr + 2, count,test+="V");
            }

            return count;
        }
    }

    public static void main(String args[]){
        int Horizontal = 10;
        int Vertical = 10;
        System.out.println(ways(Vertical, Horizontal, 0, 0,""));
    }
}
