import java.util.Scanner;

class String_concatenation{
    public static void main(String args[]){

        Scanner sn = new Scanner(System.in);
        String names[] = new String[7];
        int answer = 0;
        
        for(int i = 0; i < 7; i++){

            System.out.println("Enter name "+ (i + 1));
            String name = sn.nextLine();
            System.out.println();

            names[i] = name;
            answer += name.length();
        }
        System.out.println(answer);


        sn.close();

    }
}