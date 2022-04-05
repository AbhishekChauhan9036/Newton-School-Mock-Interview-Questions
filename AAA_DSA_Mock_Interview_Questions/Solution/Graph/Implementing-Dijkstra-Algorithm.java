/*input............................
2 1
0 1 9
0

Output...........................
0 9
*/

import java.util.*;
import java.io.*;
import java.lang.*;
class Main{
   static int[] dijkstra(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj, int s){
       int[] ans = new int[v];
       Arrays.fill(ans, Integer.MAX_VALUE);
       ans[s] = 0;
       Queue<Integer> que = new LinkedList<>();
       que.add(s);
       while(!que.isEmpty()){
           int curr = que.remove();
           for(ArrayList<Integer> next:adj.get(curr)){
               int wt = next.get(1);
               int nextNode = next.get(0);
               if(ans[nextNode] > ans[curr]+wt){
                   ans[nextNode] = ans[curr]+wt;
                   que.add(nextNode);
               }
           }
       }
       return ans;
   }
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
            int V = sc.nextInt();
            int E = sc.nextInt();
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                int w = sc.nextInt();
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            int S = sc.nextInt();
            
            
            int[] ptr = dijkstra(V, adj, S);
            
            for(i=0; i<V; i++)
                System.out.print(ptr[i] + " ");
            System.out.println();
        
    }
}
