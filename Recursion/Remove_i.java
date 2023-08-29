import java.util.Scanner;

public class Remove_i {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        String string = sn.nextLine();
        String answer = ""; 

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == 'e'){
                answer +='i';
            } else{
                answer += string.charAt(i);
            }
        }
        System.out.println(answer);
        sn.close();
    }
}
