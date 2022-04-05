import java.util.*;
class Node{
    int key;
    Node left = null, right = null;
 
    Node(int key) {
        this.key = key;
    }
}
 
class Main{
    public static void insertIntoMultiMap(Map<Integer, List<Integer>> map,Integer key, Integer value) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(value);
    }
 
    public static void printVertical(Node node, int dist,Map<Integer, List<Integer>> map)
    {
        if (node == null) {
            return;
        }

        insertIntoMultiMap(map, dist, node.key);
        printVertical(node.left, dist - 1, map);
        printVertical(node.right, dist + 1, map);
    }
 
    public static void printVertical(Node root)
    {
        Map<Integer, List<Integer>> map = new TreeMap<>();
 
        printVertical(root, 0, map);
        for (Collection<Integer> collection: map.values()) {
            System.out.println(collection);
        }
    }
 
    public static void main(String[] args)
    {
        /* Construct the following tree
                1
              /   \
             /     \
            2       3
                  /   \
                 /     \
                5       6
              /   \
             /     \
            7       8
                  /   \
                 /     \
                9      10
        */
 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
        root.right.left.right.left = new Node(9);
        root.right.left.right.right = new Node(10);
 
        printVertical(root);
    }
}