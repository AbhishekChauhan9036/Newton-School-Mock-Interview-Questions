/*simple Input..................
4 3
0 1
1 2
2 3
1 2
output...........
-1
*/


import java.util.*;
import java.io.*;
import java.lang.*;
class Main
{
    static void dfs(ArrayList<ArrayList<Integer>> graph, int src, boolean[] vis) {
        vis[src] = true;
        for(int e : graph.get(src)) {
            if(!vis[e])
                dfs(graph, e, vis);
        }
    }
    static int findEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        for(int i = 0; i < graph.get(u).size(); i++) {
            int e = graph.get(u).get(i);
            if (e == v)
                return i;
        }
        return -1;
    }
    static int isBridge(int V, ArrayList<ArrayList<Integer>> graph,int c,int d)
    {
        int initialComponent = 0;
        boolean[] vis = new boolean[V];
        
        for(int i = 0; i < V; i++) {
            if(!vis[i]) {
                initialComponent++;
                dfs(graph, i, vis);
            }
        }
        

        int idx1 = findEdge(graph, c, d);
        graph.get(c).remove(idx1);
        int idx2 = findEdge(graph, d, c);
        graph.get(d).remove(idx2);
        
        int finalComponent = 0;
        
        vis = new boolean[V];
        
        for(int i = 0; i < V; i++) {
            if(!vis[i]) {
                finalComponent++;
                dfs(graph, i, vis);
            }
        }
        
        return initialComponent != finalComponent ? 1 : 0;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for(int i = 0; i < V+1; i++)
                list.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            int c = sc.nextInt();
            int d = sc.nextInt();
            System.out.println(isBridge(V,list,c,d));
        
    }
}