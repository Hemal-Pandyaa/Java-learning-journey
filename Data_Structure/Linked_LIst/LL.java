class LinkedList {

    // Declaring head
    Node head;
    // Declaring size as variable so to got size time complexity is O(1)
    int size;

    // Node class
    static class Node {

        // Data of Node
        String data;
        Node next;
        public int count;

        // Constructor
        Node(String Data) {
            this.data = Data;
            this.next = null;
        }
    }

    // Add Node function
    public void addNode(String Data) {

        // Creating new Node as new linked list
        Node newNode = new Node(Data);

        // if linked list is empty
        if (head.data == null) {
            head.data = Data;
            head.next = null;
            this.size = 1;
            return;
        }

        // keeping current node to keep track of nodes 1 by 1
        Node currNode = head;

        // iterate over whole list
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        // adding newly created linked to end of current linked list
        currNode.next = newNode;
        this.size++;

    }

    // To print list
    public void printList() {
        if (head.data == null) {
            System.out.println("Empty!");
            return;
        }
        // current node to keep track of all the node
        Node currNode = head;

        // iterating over whole list
        while (currNode.next != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }

        // Printing the last remaining linked list as above condition will fail to print
        // the last element in linked list
        System.out.println(currNode.data);

    }

    public void remove(int idx) {
        // current node to keep track of node and count to keep track of idx
        Node currNode = head;
        int count = 0;

        // if idx == 0;
        if (idx == 0) {
            this.head = head.next;
            size--;
            return;
        }

        // iterating through while list until we reach desired index
        while (count < this.size) {
            // if node to remove is last
            if (count == idx - 1) {
                if (currNode.next == null) {
                    return;
                }
                currNode.next = currNode.next.next;
                size--;
                return;
            }
            currNode = currNode.next;
            count += 1;
        }
        System.out.println("Index out of range!");
    }

    public void clear() {
        this.head = new Node(null);
        this.size = 0;
    }

    // To add multiple elements at same time
    public void addAll(String... Data) {
        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }
        for (String datum : Data) {
            this.addNode(datum);
        }
    }

    // insert node at any index
    public void insert(int idx, String Data) {
        Node currNode = head;
        int count = 0;
        if (idx == 0) {
            Node newNode = new Node(Data);
            newNode.next = head;
            head = newNode;
        }
        while (count <= this.size) {
            if (count == idx - 1) {
                Node newNode = new Node(Data);
                newNode.next = currNode.next;
                currNode.next = newNode;
                this.size++;
                return;
            }
            currNode = currNode.next;
            count++;
        }

    }

    public int search(String Data) {
        Node currNode = head;
        int idx = 0;
        while (currNode.next != null) {
            if (currNode.data.equals(Data)) {
                return idx;
            }
            currNode = currNode.next;
            idx++;
        }
        return -1;
    }

    public void removeGreater(int num) {
        Node currNode = head;
        int count = 0;

        while (count <= this.size && currNode != null) {
            if (Integer.parseInt(currNode.data) > num) {
                this.remove(count);
                currNode = currNode.next;
                continue;
            }
            currNode = currNode.next;
            count++;
        }
    }

    public void reverseWithIteration() {
        if (this.head == null || this.head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = prevNode.next;
        Node nextNode = currNode.next;

        while (nextNode.next != null) {
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
            nextNode = nextNode.next;
        }

        currNode.next = prevNode;
        nextNode.next = currNode;
        head.next = null;
        this.head = nextNode;
    }

    public void reverseWithRecursion(Node currNode, Node prevNode) {
        if (currNode == null) {
            return;
        }
        if (currNode.next == null) {
            currNode.next = prevNode;
            head.next = null;
            this.head = currNode;
            return;
        }
        reverseWithRecursion(currNode.next, currNode);
        currNode.next = prevNode;
    }

    public void swapPair() {
        if (size <= 0) {
            return;
        }

        Node prevNode = null;
        Node currNode = head;

        while (currNode != null && currNode.next != null) {
            Node nextNode = currNode.next;

            currNode.next = nextNode.next;
            nextNode.next = currNode;

            if (prevNode == null) {
                this.head = nextNode;
            } else {
                prevNode.next = nextNode;
            }

            prevNode = currNode;
            currNode = currNode.next;

        }

    }

    public void removeNthFromLast(int n){
        // n the from start = size - n(if size = 5 and n is 2 we will get 3)
        this.remove(this.size - n);
    }

    public void reversePart(int right,int left){
        if(head == null || head.next == null){
            return;
        }
        int count = 1;
        Node currNode = this.head;
        while(count < right - 1){
            currNode = currNode.next;
            count++;
        }
        
        Node prevNode = currNode;
        Node rightNode = prevNode;
        Node leftNode = prevNode.next;
        currNode = prevNode.next;
        
        if(right == 1){
            prevNode = head;
            rightNode = null;
            leftNode = head;
            currNode = head.next;
        }
        
        while(count < left  && currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
            
            count++;
        }
        if(rightNode != null){
        rightNode.next = prevNode;
        }else{
            this.head = prevNode;
        }
        leftNode.next = currNode;

    }
    

    LinkedList() {
        this.head = new Node(null);
        this.size = 0;
    }

    LinkedList(String Head, String... Data) {
        this.head = new Node(Head);
        this.size = Data.length + 1;
        this.addAll(Data);

    }

}

public class LL {
    public static void main(String args[]) {
        // Tests
        LinkedList names = new LinkedList("This","is","a");
        names.addNode("list");
        names.printList();
        System.out.println(names.size);
        names.remove(3);
        names.printList();
        System.out.println(names.size);
        names.clear();
        names.printList();
        System.out.println(names.size);
        names.addAll("This", "is", "a", "list");
        names.printList();
        System.out.println(names.size);
        names.insert(3, "Linked");
        names.printList();
        System.out.println(names.size);
        names.clear();
        names.addAll("1", "5", "7", "3" , "8", "2", "3");
        String value = "7";
        System.out.println(value + " Found at index " + names.search(value));
        names.clear();
        names.addAll("1","7","9","10","23","29","36","43","50");
        names.removeGreater(25);
        names.printList();
        names.clear();
        names.addAll("1","2","3","4","5","6","7","8");
        names.printList();
        names.reverseWithIteration();
        names.printList();
        names.reverseWithRecursion(names.head.next,names.head);
        names.printList();
        names.swapPair();
        names.printList();
        names.removeNthFromLast(2);
        names.printList();
        names.reversePart(2,5);
        names.printList();

    }
}
