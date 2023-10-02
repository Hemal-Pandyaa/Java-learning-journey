// Options : Use arrayList for unlimeted childrens
// Option 2: Use Array and make it specefic amout of children
// Option 2 is better as option will provide lack of fucntionality and memeory wastage

import java.util.ArrayList;

class GeneralTree {
    Node root;
    class Node{
        String data;
        ArrayList<Node> children;
        Node parent;

        Node(String Data){
            this.data = Data;
            this.children = new ArrayList<>();
            this.parent = null;
        }
    }

    // String parent will specify where to add child,currNode to keep track and value is the data of the child
    public void addChild(Node currNode,String parent,String value){
        if(currNode.data == parent){
            Node newNode = new Node(value);
            currNode.children.add(newNode);
            newNode.parent = currNode;
            return;
        }else{
            for(int i = 0; i < currNode.children.size(); i++){
                addChild(currNode.children.get(i), parent, value);
            }
        }
    }

    public void delete(Node currNode,String value){
         if(currNode.data == value){
            try{
            currNode.parent.children.remove(currNode);
            } catch(Exception NullPointerException){
                System.out.println("Cannot delete root");
            }
        }else{
            for(int i = 0; i < currNode.children.size(); i++){
                delete(currNode.children.get(i), value);
            }
        }
    }       


    GeneralTree(String Root){
        this.root = new Node(Root);
    }

}

public class tree {
    public static void main(String args[]){
        GeneralTree tree = new GeneralTree("Electronics");
        tree.addChild(tree.root, "Electronics", "Mobile");
        System.out.println(tree.root.children);
        tree.delete(tree.root, "Mobile");
        System.out.println(tree.root.children);
        tree.delete(tree.root,"Electronics"); // Will throw error


        
    }
}
