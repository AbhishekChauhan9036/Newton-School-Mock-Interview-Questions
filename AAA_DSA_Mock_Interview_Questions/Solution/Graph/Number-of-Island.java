
import java.util.ArrayDeque;
import java.util.Queue;
 
class Pair
{
    int x, y;
 
    public Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
 
class Main
{
    private static final int[] row = { -1, -1, -1, 0, 1, 0, 1, 1 };
    private static final int[] col = { -1, 1, 0, -1, -1, 1, 0, 1 };
 
    public static boolean isSafe(int[][] mat, int x, int y, boolean[][] processed)
    {
        return (x >= 0 && x < processed.length) && (y >= 0 && y < processed[0].length)
                && mat[x][y] == 1 && !processed[x][y];
    }
 
    public static void BFS(int[][] mat, boolean[][] processed, int i, int j)
    {
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(i, j));
 
        processed[i][j] = true;
 
        while (!q.isEmpty())
        {
            int x = q.peek().x;
            int y = q.peek().y;
            q.poll();
 
            for (int k = 0; k < row.length; k++)
            {
                if (isSafe(mat, x + row[k], y + col[k], processed))
                {
                    processed[x + row[k]][y + col[k]] = true;
                    q.add(new Pair(x + row[k], y + col[k]));
                }
            }
        }
    }
 
    public static int countIslands(int[][] mat)
    {

        if (mat == null || mat.length == 0) {
            return 0;
        }
 
        int M = mat.length;
        int N = mat[0].length;

        boolean[][] processed = new boolean[M][N];
 
        int island = 0;
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (mat[i][j] == 1 && !processed[i][j])
                {
                    BFS(mat, processed, i, j);
                    island++;
                }
            }
        }
 
        return island;
    }
 
    public static void main(String[] args)
    {
        int[][] mat=
                {
                        { 1, 0, 1, 0, 0, 0, 1, 1, 1, 1 },
                        { 0, 0, 1, 0, 1, 0, 1, 0, 0, 0 },
                        { 1, 1, 1, 1, 0, 0, 1, 0, 0, 0 },
                        { 1, 0, 0, 1, 0, 1, 0, 0, 0, 0 },
                        { 1, 1, 1, 1, 0, 0, 0, 1, 1, 1 },
                        { 0, 1, 0, 1, 0, 0, 1, 1, 1, 1 },
                        { 0, 0, 0, 0, 0, 1, 1, 1, 0, 0 },
                        { 0, 0, 0, 1, 0, 0, 1, 1, 1, 0 },
                        { 1, 0, 1, 0, 1, 0, 0, 1, 0, 0 },
                        { 1, 1, 1, 1, 0, 0, 0, 1, 1, 1 }
                };
 
        System.out.print( countIslands(mat));
    }
}
