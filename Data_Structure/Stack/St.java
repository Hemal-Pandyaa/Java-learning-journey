import java.util.ArrayList;
class StackArrayList {
    int top = -1;
    ArrayList<Integer> arr = new ArrayList<>();

    public boolean isEmpty(){
        return this.top == -1;
    }

    public void push(int... Data){
        for(int i = 0; i < Data.length; i++){
            arr.add(Data[i]);
            top++; 
        }
    }

    public int pop(){
        if(this.isEmpty()){
            System.out.println("Error: Stack is Empty!!");
            return -1;
        }
        return arr.get(top--);
    }

    public int peek(){
        if(this.isEmpty()){
            System.out.println("Error: Stack is Empty!!");
            return -1;
        }
        return arr.get(top);
    }
}


class StackArray {
    int size;
    int top = -1;
    int arr[];

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int... Data){
        for(int i = 0; i < Data.length; i++){
            arr[++top] = Data[i];
        }

        
    }

    public int pop(){
        if(this.isEmpty()){
            System.out.println("Stack is Empty!!!!!");
            return -1;
        }else{
            int temp = arr[top--];
            return temp;
        }
    }

    public int peek(){
        if(this.isEmpty()){
            System.out.println("Stack is Empty!!!!!");
            return -1;
        }else{
            return arr[top];
        }
    }

    StackArray(int Size,int... Data){
        this.size = Size;
        this.arr = new int[size];
        this.push(Data);
    }
}


class stackLL{

    Node head;

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    public boolean isEmpty(){
        return this.head == null;
    }

    public void push(int Data){
        Node newNode = new Node(Data);

        if(this.isEmpty()){
            this.head = newNode;
            return;
        }

        newNode.next = this.head;
        this.head = newNode;
    }

    public int pop(){

        try{
        int top = head.data;
        this.head = this.head.next;

        return top;
        }
        catch(NullPointerException ex){
            System.out.println("ERROR : Stack is Empty!");
            
        }

        return -1;
    }

    public int peek(){
        try{

        return head.data;
        }
        catch(NullPointerException ex){
            System.out.println("ERROR : Stack is Empty!");
        }

        return -1;
    }

    // Used BackTracking
    public void pushBottom(int Data){
        if(this.isEmpty()){
            this.push(Data);
            return;
        }
        int currData = this.pop();
        pushBottom(Data);
        this.push(currData);

    }

    public void reverse(){
        if(this.isEmpty()){
            return;
        }
        int currData = this.pop();
        reverse();
        this.pushBottom(currData);
    }

    public void clear(){
        this.head = null;
    }

    stackLL(int Data){
        this.head = new Node(Data);
    }
}

public class St{
    public static void main(String args[]){
        stackLL Stack = new stackLL(6);
        Stack.push(7);
        Stack.push(8);
        Stack.push(9);
        int peek = Stack.peek();
        System.out.println(peek);
        int data = Stack.pop();
        System.out.println(data);
        data = Stack.pop();
        System.out.println(data);
        data = Stack.pop();
        System.out.println(data);
        data = Stack.pop();
        System.out.println(data);
        // Stack.clear();
        Stack.peek();
        Stack.pop();
        Stack.pushBottom(5);
        Stack.pushBottom(4);
        Stack.pushBottom(3);
        Stack.pushBottom(2);
        Stack.pushBottom(1);
        Stack.pushBottom(0);
        Stack.pushBottom(8);
        Stack.reverse();
        while(!Stack.isEmpty()){
            System.out.println(Stack.pop());
        }


        System.out.println("Array 2 Stack");
        StackArray stack2 = new StackArray(5);
        stack2.push(1);
        stack2.push(2);
        stack2.push(3,4,5);

        while(!stack2.isEmpty()){
            System.out.println(stack2.peek());
            stack2.pop();
        }

        System.out.println("Stack 3 Array List");
        StackArrayList stack3 = new StackArrayList();
        stack3.push(1);
        stack3.push(2);
        stack3.push(3,4,5);

        while(!stack3.isEmpty()){
            System.out.println(stack3.peek());
            stack3.pop();
        }
        stack3.peek();
        stack3.pop();
    }    
}
