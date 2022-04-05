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
class Main{
    public static ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        int[] fl = new int[v];
        int i;
        ArrayList<Integer> res = new ArrayList<>();
        for(i=0;i<v;i++){
            if(fl[i]==0)
                dfs(i,fl,res,adj); 
        }
        return res;
    }
    
    public static void dfs(int i, int[]fl,ArrayList<Integer> res, ArrayList<ArrayList<Integer>> adj){
        res.add(i);
        fl[i] = 1;
        for(int a:adj.get(i)){
            if(fl[a]==0)
                dfs(a,fl,res,adj);
        }
    }
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
            int V = sc.nextInt();
            int E = sc.nextInt();
            ArrayList<ArrayList<Integer>> adj =new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < V; i++) adj.add(new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u =sc.nextInt();
                int v = sc.nextInt();
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            ArrayList<Integer> ans = dfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }