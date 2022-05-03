class Main
{
    public static int knapsack(int[] v, int[] w, int n, int W)
    {
        if (W < 0) {
            return Integer.MIN_VALUE;
        }
 
        if (n < 0 || W == 0) {
            return 0;
        }
 
 
        int include = v[n] + knapsack(v, w, n - 1, W - w[n]);
 
        int exclude = knapsack(v, w, n - 1, W);

        return Integer.max(include, exclude);
    }
 
    public static void main(String[] args)
    {
        int[] v = { 20, 5, 10, 40, 15, 25 };
        int[] w = { 1, 2, 3, 8, 7, 4 };

        int W = 10;
 
        System.out.println("Knapsack value is " +knapsack(v, w, v.length - 1, W));
    }
}