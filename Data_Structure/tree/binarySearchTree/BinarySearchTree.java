class BST{
    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int Data){
            this.data = Data;
            this.left = null;
            this.right = null;
        }
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void buildTree(int ...Data){
        if(Data.length == 0){
            return;
        }
        int j = 0;
        if(this.root == null){
            root = new Node(Data[0]);
            j = 1;
        }
        while(j != Data.length){
            Node currNode = this.root;
            while(currNode != null){
                if(Data[j] > currNode.data){
                    if(currNode.right == null){
                        currNode.right = new Node(Data[j]);
                        break;
                    }
                    currNode = currNode.right;
                }else{
                    if(currNode.left == null){
                        currNode.left = new Node(Data[j]);
                        break;
                    }
                    currNode = currNode.left;
                }
            }
            j++;
        }
    }

    public void inOrderTraversal(Node currNode){
        if(currNode == null){
            return;
        }else{
            inOrderTraversal(currNode.left);
            System.out.print(currNode.data + " ");
            inOrderTraversal(currNode.right);
        }
    }

    public void preOrderTraversal(Node currNode){
        if(currNode == null){
            return;
        }else{
            System.out.print(currNode.data + " ");
            preOrderTraversal(currNode.left);
            preOrderTraversal(currNode.right);
        }
    }

    public void postOrderTraversal(Node currNode){
        if(currNode == null){
            return;
        }else{
            postOrderTraversal(currNode.left);
            postOrderTraversal(currNode.right);
            System.out.print(currNode.data + " ");
        }
    }

    public void insert(int ...data){
        this.buildTree(data);
        return;
    }

    public boolean search(int key){
        if(root == null){
            return false;
        }
        if(key == root.data){
            return true;
        }
        Node currNode = root;
        while(currNode != null){
            if(currNode.data == key){
                return true;
            }
            if(currNode.data > key){
                currNode = currNode.left;
            }else{
                currNode = currNode.right;
            }
        }
        return false;
    }

    public Node delete(Node currNode,int target){
        if(currNode == null){
            return null;
        }
        if(currNode.data == target){
            // case 1
            if(currNode.left == null && currNode.right == null){
                return null;
            }

            // Case 2
            if(currNode.left == null){
                return currNode.right;
            }else if(currNode.right == null){
                return currNode.left;
            }

            // Case 3
            Node IS = inOrderSuccesor(currNode.right);
            delete(currNode, IS.data);
            currNode.data = IS.data;
            return currNode;
        }
        else if(currNode.data > target){
            currNode.left = delete(currNode.left, target);
            return currNode;
        }else{
            currNode.right = delete(currNode.right, target);
            return currNode;
        }
    }

    public Node inOrderSuccesor(Node currNode){
        while(currNode.left != null){
            return inOrderSuccesor(currNode.left);
        }
        if(currNode.left == null){
            return currNode;
        }
        return null;
    }
}

public class BinarySearchTree {
    public static void main(String args[]){
        BST tree = new BST();
        tree.buildTree(5,2,1,3,4,6,7,8);
        tree.insert(12,24,0);
        System.out.println("In Order : ");
        tree.inOrderTraversal(tree.root);
        System.out.println("\nPre Order : ");
        tree.preOrderTraversal(tree.root);
        System.out.println("\nPost Order");
        tree.postOrderTraversal(tree.root); 
        System.out.println();

        int key = 7;
        System.out.println("Found "  + key + " " + tree.search(key));
        
        System.out.println("In order Traversal  : ");
        tree.root = tree.delete(tree.root, 2);
        tree.inOrderTraversal(tree.root);



    }
}
