/**
 *    author:  Abhishek Chauhan
 *    created: Sun Mar 27 22:25:35 IST 2022
**/


/* ........this is Tree.............
                1
			   /\
			  /	 \
			 2    3
			/\	   \
		   /  \		\
		  4    5     6
*/


import java.util.*;
import java.io.*;
public class Main{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
/*
.........................Build Tree.........................................
............................................................................
*/
    static class TreeDataStructure{
        static int index=-1;
        static Node BuildTree(int nodes[]){
            index++;
            if(nodes[index]==-1){
                return null;
            }


            Node newNode=new Node(nodes[index]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);
            return newNode;
        }
    }
/*
    time Complexity...................O(n)
.........................pre Order Traversal.........................................
.....................................................................................

*/
    public static void preOrderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }


/*
    time Complexity...................O(n)
.........................in Order Traversal.........................................
.....................................................................................

*/
    public static void inOrderTraversal(Node root){
        if(root==null){
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }



/*
    time Complexity...................O(n)
.........................Post Order Traversal.........................................
.....................................................................................

*/
    public static void postOrdertraversal(Node root){
        if(root==null){
            return;
        }

        postOrdertraversal(root.left);
        postOrdertraversal(root.right);
        System.out.print(root.data+" ");

    }

/*
.........................Check element Present Or Not in a tree.........................................
........................................................................................................

*/
    static boolean checkElementPresentOrNot(Node node ,int element){
        if(node.data==element){
            return true;
        }

        boolean second=checkElementPresentOrNot(node.left,element);
        if(second)
        {
            return second;
        }
        boolean third=checkElementPresentOrNot(node.right,element);
        return third;
    }


/*
.........................Get Full Node in a tree........................................................
........................................................................................................

*/
    public static int getfullCount(Node root)
    {
        if (root == null)
        return 0;
    
        int res = 0;
        if (root.left != null && root.right != null)
        res++;
    
        res += (getfullCount(root.left) + getfullCount(root.right));
        return res;
    }


/*
.........................Count Nodes in a tree........................................................
........................................................................................................

*/
    public static int countNodes(Node root) {
        
        if(root == null) return 0;
        
        return countNodes(root.left) + countNodes(root.right) + 1;
    }


/*
.........................Sum of all Nodes in a tree........................................................
........................................................................................................

*/
    static int addBT(Node root)
    {
        if (root == null)
            return 0;
        return (root.data + addBT(root.left) +addBT(root.right));
    }


/*
.........................Claculate Hight in a tree........................................................
........................................................................................................

*/
    public static int CalculateHight(Node root){
        if(root==null){
            return 0;
        }

        int leftHight=CalculateHight(root.left);
        int rightHight=CalculateHight(root.right);
        return Math.max(leftHight,rightHight)+1;
    }



/*
.........................Diameter Of a Binarytree........................................................
........................................................................................................

*/
    static int max = 0;
    public static int diameterOfBinaryTree(Node root) {
        maxDepth(root);
        return max;
    }
    private static int maxDepth(Node root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }



/*
.........................LeftView Of a Binarytree........................................................
........................................................................................................

*/
    static int maxlevel = 0;
    public static void leftViewUtil(Node node, int level){
        if (node == null){
            return;
        }
 
        if (maxlevel < level) {
            System.out.print(node.data+" ");
            maxlevel = level;
        }

        leftViewUtil(node.left, level + 1);
        leftViewUtil(node.right, level + 1);
    }


/*
.........................RightView Of a Binarytree........................................................
........................................................................................................

*/
    public static void rightViewUtility(Node node, int level){  
     
        if(node == null){  
             return;  
        }  
    
        if(maxlevel < level){
                System.out.print(node.data + " ");   
                maxlevel = level;  
            }  
     
        rightViewUtility(node.right, level + 1);    
        rightViewUtility(node.left, level + 1);  
    }  



    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        TreeDataStructure t1=new TreeDataStructure();
        Node root=t1.BuildTree(nodes);

        // preOrderTraversal(root);
        // System.out.println();


        // inOrderTraversal(root);
        // System.out.println();


        // postOrdertraversal(root);
        // System.out.println();


        // int p=getfullCount(root);
        // int p=countNodes(root);
        // System.out.print(p);


        // p=addBT(root);
        //   System.out.print(p);


        // int p=CalculateHight(root);
        // System.out.print(p);

        // int l=diameterOfBinaryTree(root);
        // System.out.println(l);


        /*if(checkElementPresentOrNot(root,2)){
            System.out.print("Present");
        }else{
            System.out.println("Not Present");
        }*/
	}
}