class LinkedList {

    // Declaring head
    Node head;
    // Declaring size as variable so to got size time complexity is O(1)
    int size;

    // Node class
    class Node {

        // Data of Node
        String data;
        Node next;

        // Constructer
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

        // Printing the last remaning linked list as above condition will fail to print
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
        for (int i = 0; i < Data.length; i++) {
            this.addNode(Data[i]);
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

    LinkedList() {
        this.head = new Node(null);
        this.size = 0;
    }

    LinkedList(String Data) {
        this.head = new Node(Data);
        this.size = 1;
    }

}

public class LL {
    public static void main(String args[]) {
        LinkedList names = new LinkedList("This");
        names.addNode("is");
        names.addNode("a");
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
    }
}
