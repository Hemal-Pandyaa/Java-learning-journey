import java.util.Scanner;

public class make_username {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        String email = sn.nextLine();
        String username = "";

        for(int i = 0; i < email.length() ; i++){
            if(email.charAt(i) == '@'){
                break;
            }else{

                username += email.charAt(i);
            }
        }
        System.out.println(username);
        sn.close();
    }
}
