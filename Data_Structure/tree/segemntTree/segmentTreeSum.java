// This segment tree will find maximum element in query
// None of the node have any date they only have left and right indexes and their division to the next left and right
// constructing tree will replace all the old elements

class SegmentTree{
    Node root;
    private int arr[];
    class Node{
        int data;
        int li;
        int ri;
        Node left;
        Node right;

        Node(int data,int li,int ri){
            this.data = data;
            this.li = li;
            this.ri = ri;
            this.left = null;
            this.right = null;
        }
    }


    private void constructArr(int data[]){
        this.arr = new int[data.length];
        // changes will be reflected on main array
        this.arr = data.clone();
    }
    private Node constructTree(int data[],int start,int end){
        if(this.root == null){
            constructArr(data);
        }
        if(start == end){
            Node leafNode = new Node(arr[start],start,start);
            return leafNode;
        }
        int mid = (start+end)/2;
        Node left = constructTree(data, start, mid);
        Node right = constructTree(data,mid+1,end);
        int maxData =left.data + right.data;
        Node currNode = new Node(maxData,left.li,right.ri);
        currNode.left = left;
        currNode.right = right;
        return currNode;
        

    }


    // For quering we will check the li and ri of left and then li and ri of the right if li is small that left index and ri
    public int Query(int start,int end){
        return this.Query(this.root,start,end);
    }

    private int Query(Node currNode,int start,int end){
        if(currNode.ri < start || currNode.li > end){
            return 0;
        }else if(currNode.li >= start && currNode.ri <= end){
            return currNode.data;
        }else{
            int left = Query(currNode.left, start, end);
            int right =  Query(currNode.right, start, end);
            return right+left;
        }
    }



    SegmentTree(int data[]){
        this.root = this.constructTree(data,0,data.length - 1);
    }
}

public class segmentTreeSum {


    public static void main(String args[]){
        int arr[] = {1,2,4,7,8,2,3,6,1,7};
        SegmentTree tree = new SegmentTree(arr);
        System.out.println(tree.Query(3,8));
    }
}
