class stack{

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

    stack(int Data){
        this.head = new Node(Data);
    }
}

public class St{
    public static void main(String args[]){
        stack Stack = new stack(6);
        Stack.push(7);
        Stack.push(8);
        Stack.push(9);
        // int peek = Stack.peek();
        // System.out.println(peek);
        // int data = Stack.pop();
        // System.out.println(data);
        // data = Stack.pop();
        // System.out.println(data);
        // data = Stack.pop();
        // System.out.println(data);
        // data = Stack.pop();
        // System.out.println(data);
        // // Stack.clear();
        // Stack.peek();
        // Stack.pop();
        Stack.pushBottom(5);
        Stack.pushBottom(4);
        Stack.pushBottom(3);
        Stack.pushBottom(2);
        Stack.pushBottom(1);
        Stack.pushBottom(0);
        Stack.pushBottom(-1);
        Stack.reverse();
        while(!Stack.isEmpty()){
            System.out.println(Stack.pop());
        }

    }    
}
