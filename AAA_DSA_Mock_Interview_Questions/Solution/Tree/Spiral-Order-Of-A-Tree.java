class Node
{
    int key;
    Node left = null, right = null;
 
    Node(int data) {
        this.key = data;
    }
}
 
class Main
{
    public static boolean printLevelLeftToRight(Node root, int level)
    {
        if (root == null) {
            return false;
        }
 
        if (level == 1)
        {
            System.out.print(root.key + " ");
            return true;
        }
 
        boolean left = printLevelLeftToRight(root.left, level - 1);
        boolean right = printLevelLeftToRight(root.right, level - 1);
 
        return left || right;
    }
 
    public static boolean printLevelRightToLeft(Node root, int level)
    {
        if (root == null) {
            return false;
        }
 
        if (level == 1)
        {
            System.out.print(root.key + " ");
            return true;
        }
        boolean right = printLevelRightToLeft(root.right, level - 1);
        boolean left = printLevelRightToLeft(root.left, level - 1);
 
        return right || left;
    }
 
    public static void spiralOrderTraversal(Node root)
    {
        if (root == null) {
            return;
        }

        int level = 1;
 

        while (printLevelLeftToRight(root, level++) && printLevelRightToLeft(root, level++));
    }
 
    public static void main(String[] args)
    {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);
 
        spiralOrderTraversal(root);
    }
}