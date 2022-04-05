/*input............................
3 4
3 0
1 0
2 0

Output...........................
1


Time Complexity: O(V+E)
*/

import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
	static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
   {
       int in_order [] = new int[V];
       Queue<Integer> q = new LinkedList<>();
       int ans[] = new int[V];
       
       for(int i= 0 ; i < V ; i++)
           for(int x : adj.get(i))
               in_order[x]++;
   
       for(int i= 0 ; i < V ; i++)
           if(in_order[i] == 0)
               q.offer(i);
           
       int i = 0;    
               
       while(!q.isEmpty())
       {
           int u = q.poll();
           ans[i++]= u ;

           
           for(int x : adj.get(u))
                 if(--in_order[x] == 0)
                   q.offer(x); 
       }
          return ans;
   }
       static boolean check(ArrayList<ArrayList<Integer>> list, int V, int[] res) {
        
        if(V!=res.length)
        return false;
        
        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res[i]] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : list.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
    		Scanner sc=new Scanner(System.in);
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
           
            int edg = sc.nextInt();
            int nov =  sc.nextInt();

            for (int i = 0; i < nov + 1; i++)
                list.add(i, new ArrayList<Integer>());

            int p = 0;
            for (int i = 1; i <= edg; i++) {
             
                int u =  sc.nextInt();
                int v =  sc.nextInt();
                list.get(u).add(v);
            }

            int[] res =topoSort(nov, list);

            if (check(list, nov, res) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }

