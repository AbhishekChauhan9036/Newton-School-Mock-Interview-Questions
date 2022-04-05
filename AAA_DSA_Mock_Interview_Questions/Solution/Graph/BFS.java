/*input............................
5 4
0 1 
0 2
0 3 
2 4

Output...........................
0 1 2 3 4



Time complexity: O(V + E)
Space Complexity: O(V)
*/

import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
     public static  ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       ArrayList<Integer> bfs = new ArrayList<Integer>(V);
       boolean visited[] = new boolean[V];
       Queue<Integer> q = new LinkedList<>();
       q.offer(0);
       visited[0]=true;
       while(!q.isEmpty())
       {
           int vertex = q.poll();
           bfs.add(vertex);
           for(int i:adj.get(vertex))
           {
               if(visited[i]==false)
               {
                   q.offer(i);
                   visited[i]=true;
                   
               }
           }
       }
       return bfs;
   }
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
            int V = sc.nextInt();
            int E = sc.nextInt();
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {

                int u = sc.nextInt();
                int v = sc.nextInt();
                adj.get(u).add(v);
            }
            ArrayList<Integer> ans = bfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
}