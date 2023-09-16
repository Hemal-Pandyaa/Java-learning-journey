import java.util.EmptyStackException;
import java.util.Stack;


class QueueArray {
    int rear = -1;
    int size;
    int arr[];
    public boolean isEmpty(){
        return rear == -1;
    }

    public boolean isFull(){
        return this.rear == this.size;
    }

    public void enque(int... Data){
        if(this.isFull()){
            System.out.println("Queue is Full!");
        }else{
            for(int i = 0; i < Data.length;i++){
                if(this.isFull()){
                    System.out.println("Queue Does not have enough space to store all");
                }
                arr[++rear] = Data[i];
            }
        }
    }

    public int deque(){
        if(this.isEmpty()){
            System.out.println("Queue is Empty!!");
            return -1;
        }else{
            int temp = arr[0];
            int j = 0;
            for(int i = 1 ;i <= this.rear; i++,j++){
                arr[j] = arr[i];
            }
            this.arr[rear--] = 0;
            return temp;
        }
    }

    public int peek(){
        if(this.isEmpty()){
            System.out.println("Queue is Empty!!");
            return -1;
        }else{
            return arr[0];
        }
    }


    QueueArray(int size){
        this.size = size;
        this.arr = new int[size];
    }
}
class QueueStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public boolean isEmpty(){
        return s1.empty();
    }

    public void enque(int... Data){
        while(!s1.empty()){
            s2.push(s1.pop());
        }

        for(int i = 0; i < Data.length; i++){
            s2.push(Data[i]);
        }

        while(!s2.empty()){
            s1.push(s2.pop());
        }
    }

    public int deque(){
        try{
            return s1.pop();
        }catch(EmptyStackException e){
            System.out.println("Stack is Empty!!!");
            return -1;
        }
    }

    public int peek(){
        try{
            return s1.peek();
        }catch(EmptyStackException e){
            System.out.println("Stack is Empty!!");
            return -1;
        }
    }
}

class QueueLL{
    Node head;
    Node tail;
    class Node{
        int Data;
        Node next;
    
    Node(int Data){
        this.Data = Data;
        this.next = null;
        }
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void enque(int... Data){
        for(int i = 0; i < Data.length; i++){
            Node newNode = new Node(Data[i]);
            if(this.tail == null ){
                this.head = this.tail = newNode;
                continue;
            }
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    public int deque(){
        if(this.isEmpty()){
            System.out.println("Queue is Empty!!");
            return -1;
        }else{
            int temp = this.head.Data;
            this.head = this.head.next;
            return temp;
        }
    }

    public int peek(){
    if(this.isEmpty()){
        System.out.println("Queue is Empty!!");
        return -1;
    }else{
        return this.head.Data;
    }
    }
}

public class Queue {
    public static void main(String args[]){
        QueueArray Queue = new QueueArray(6);
        Queue.enque(0);
        Queue.enque(1);
        Queue.enque(2,3,4,5);
        while(!Queue.isEmpty()){

            System.out.println(Queue.peek());

            Queue.deque();
        }
    }
        
    }


