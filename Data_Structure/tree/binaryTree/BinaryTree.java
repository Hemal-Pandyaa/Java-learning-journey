import java.util.LinkedList;
import java.util.Queue;
class Node{
    int Data;
    Node left;
    Node right;

    Node(int Data){
        this.Data = Data;
        this.left = null;
        this.right = null;
    }
}

class BT{
    Node root;
    private static int idx = 0;

    public Node BuildPreorder(int[] arr){
         if(arr[idx] == -1){
            idx++;
            return null;
         }else{
            Node newNode = new Node(arr[idx++]);
            newNode.left = BuildPreorder(arr);
            newNode.right = BuildPreorder(arr);
            return newNode;
         }
    }

    public void PrintPreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.Data + " ");
        PrintPreOrder(root.left);
        PrintPreOrder(root.right);
    }

    public void PrintInOrder(Node root){
        if(root == null){
            return;
        }
        PrintInOrder(root.left);
        System.out.print(root.Data+" ");
        PrintInOrder(root.right);
    }

    public void PrintPostOrder(Node root){
        if(root == null){
            return;
        }
        PrintPostOrder(root.left);
        PrintPostOrder(root.right);
        System.out.print(root.Data + " ");
    }

    public void PrintLevelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            Node currNode = queue.remove();
            if(currNode == null){
                if(queue.isEmpty()){
                    break;
                }else{
                    System.out.println("");
                    queue.add(null);
                }
            }else{
                System.out.print(currNode.Data + " ");
                if(currNode.left != null){
                    queue.add(currNode.left); 
                }
                if(currNode.right != null){
                    queue.add(currNode.right);
                }
            }
        }

    }

    public int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int lc = countNodes(root.left);
        int rc = countNodes(root.right);
        return rc + lc + 1;
    }

    public int countHeight(Node root){
        if(root == null){
            return 0;
        }else{
            int lf = countHeight(root.left);
            int rf = countHeight(root.right);
            return Math.max(lf, rf) + 1;
        }
    }

    public int addKthLevel(Node root,int k){
        if(k == 0){
            return root.Data;
        }else if(k < 0){
            return -1;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int i = 0;
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                i++;
                if(i == k){
                    int sum = 0;
                    while(!q.isEmpty()){
                        sum += q.remove().Data;
                    }       
                    return sum;
                }else{
                    q.add(null);
                    continue;
                }
            }
            if(currNode.left != null)
            q.add(currNode.left);
            if(currNode.right != null)
            q.add(currNode.right);
        }
        return -1;
    }


    class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int height,int diameter){
            this.ht = height;
            this.diam = diameter;
        }
    }
    public TreeInfo diameter(Node root){
        if(root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo leftInfo = diameter(root.left);
        TreeInfo rightInfo = diameter(root.right);
        
        int height = Math.max(rightInfo.ht,leftInfo.ht) + 1;

        int diam = Math.max((rightInfo.ht + leftInfo.ht) + 1,Math.max(leftInfo.diam,rightInfo.diam));

        return new TreeInfo(height,diam);
    }   

}

public class BinaryTree{
    public static void main(String args[]){
        BT tree = new BT();
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = tree.BuildPreorder(nodes);
        System.out.println("PreOrder : ");
        tree.PrintPreOrder(root);
        System.out.println("\nInOrder : ");
        tree.PrintInOrder(root);
        System.out.println("\nPostOrder : ");
        tree.PrintPostOrder(root);
        System.out.println("\nLevelOrder : ");
        tree.PrintLevelOrder(root);
        System.out.println();


        int count = tree.countNodes(root);
        System.out.println("Count of all Node is : " + count);

        int height = tree.countHeight(root);
        System.out.println("Height of the tree is: " + height );

        BT.TreeInfo diameter = tree.diameter(root);
        System.out.println("Diameter of the tree is: " + diameter.diam);

        int k = 0;
        System.out.println("The sum of all elements at level " + k + " is " + tree.addKthLevel(root, k));

    }
}