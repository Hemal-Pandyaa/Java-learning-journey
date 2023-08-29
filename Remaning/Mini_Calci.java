import java.util.*;

public class Mini_Calci {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value for a:");
        int a =sn.nextInt();
        System.out.println("Enter the value for b:");
        int b = sn.nextInt();
        System.out.println("Enter operand:");
        char operand = sn.next().charAt(0);

        switch(operand){
            case '+' : System.out.println(a + b);
            break;
            case '-' : System.out.println(a - b);
            break;
            case '*' : System.out.println(a * b);
            break;
            case '/' : System.out.println(a / b);
            break;
            case '%' : System.out.println(a % b);
            break;
            default:
                System.out.println("Sorry, Invalid operand !!");
        }
        sn.close();

    }
}
