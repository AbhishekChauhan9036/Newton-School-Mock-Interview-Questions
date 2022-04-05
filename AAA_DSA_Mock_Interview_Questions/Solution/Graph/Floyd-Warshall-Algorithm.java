/*input............................
2
0 25
-1 0

Output...........................
0 25
-1 0


Time Complexity: O(V^3)
*/


import java.util.*;
import java.lang.*;
import java.io.*;
class Main{

public static void shortest_distance(int[][] adj){
        // Code here 
        int n = adj.length;
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(adj[i][k]==-1 || adj[k][j]==-1) continue;
                    if(adj[i][j]==-1) adj[i][j] = adj[i][k]+adj[k][j];
                    else adj[i][j] = Math.min(adj[i][j],adj[i][k]+adj[k][j]);
                }
            }
        }
    }

public static void main(String[] args){
			Scanner sc=new Scanner(System.in);	
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++)
                    matrix[i][j]=sc.nextInt();;
            }

            shortest_distance(matrix);
            for(int i = 0; i < n; i++){
                for(int j  = 0; j < n; j++){
                    System.out.print(matrix[i][j] + " ");
            }
                System.out.println();
    	}
	}
}

