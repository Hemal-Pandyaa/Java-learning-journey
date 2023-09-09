// This problem states to implement stack in such a way that it can return minimum element in O(1) time complexity

class stack {
    Node head;
    class Node{
        int Data;
        Node next;

        Node(int Data){
            this.Data = Data;
            this.next = null;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

  public void push(int data) {
    Node newNode = new Node(data);

    if (isEmpty() || data <= head.Data) {
        newNode.next = head;
        head = newNode;
        return;
    }

    Node currNode = head;

    while (currNode.next != null && data > currNode.next.Data) {
        currNode = currNode.next;
    }

    newNode.next = currNode.next;
    currNode.next = newNode;
}


    public int peek(){
        if(this.isEmpty()){
            return -1;
        }else{
            return this.head.Data;
        }
    }

    public int pop(){

        try{
        int top = head.Data;
        this.head = this.head.next;

        return top;
        }
        catch(NullPointerException ex){
            System.out.println("ERROR : Stack is Empty!");
        }

        return -1;
    }

    
}

public class St_ascending {

    public static void main(String args[]){
        stack st = new stack();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        st.push(6);

        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
