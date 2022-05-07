// ZigZag Level Order Traversal BT
// Given a binary tree, return the zigzag level order traversal of its nodes’ values.
//  (ie, from left to right, then right to left for the next level and alternate between).

// Example : 
/*

            8
          /   \
       1.         2
      / \       /   \
    3    4     5     6
   /\   / \   / \   / \
  7  8 9  10 11 12 13 14
  
OUTPUT:
8
2 1
3 4 5 6
14 13 12 11 10 9 8 7

    3
   / \
  9  20
    /  \
   15   7
*/

class Node{
    int data;
    Node left=null;
    Node right=null;

    Node(int data){
        this.data=data;
    }
}
public class Main{
    
public static void solve(Node root) {
    
    if(root==null){
        return;
    }
    int level=1;

    while(printalllevels(root,level++) && printRightevels(root,level++));

}

public static boolean printalllevels(Node root,int level){

    if(root==null){
        return false;
    }
    if(level==1){
        System.out.print(root.data+" ");
        return true;
    }

    boolean left=printalllevels(root.left,level-1);
    boolean right=printalllevels(root.right,level-1);

    return left||right;
}


public static boolean printRightevels(Node root,int level){

    if(root==null){
        return false;
    }
    if(level==1){
        System.out.print(root.data+" ");
        return true;
    }

     boolean right=printRightevels(root.right,level-1);
    boolean left=printRightevels(root.left,level-1);
   

    return left||right;
}

public static void main(String[] args){
    Node root=new Node(8);
    root.left=new Node(1);
    root.right=new Node(2);
    root.left.left=new Node(3);
    root.left.right=new Node(4);
    root.right.left=new Node(5);
    root.right.right=new Node(6);
    root.left.left.left=new Node(7);
    root.left.left.right=new Node(8);
    root.left.right.left=new Node(9);
    root.left.right.right=new Node(10);
    solve(root);
}

}