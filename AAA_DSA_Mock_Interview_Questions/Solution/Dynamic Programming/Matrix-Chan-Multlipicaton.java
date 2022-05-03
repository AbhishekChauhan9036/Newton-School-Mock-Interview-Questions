class Main
{
    public static int matrixChainMultiplication(int[] dims, int i, int j)
    {
        if (j <= i + 1) {
            return 0;
        }
 
        int min = Integer.MAX_VALUE;
 

 
        /*
            (M[i+1]) × (M[i+2]………………M[j])
            (M[i+1]M[i+2]) × (M[i+3…………M[j])
            …
            …
            (M[i+1]M[i+2]…………M[j-1]) × (M[j])
        */
 
        for (int k = i + 1; k <= j - 1; k++)
        {
            int cost = matrixChainMultiplication(dims, i, k);
 
            cost += matrixChainMultiplication(dims, k, j);

            cost += dims[i] * dims[k] * dims[j];
 
            if (cost < min) {
                min = cost;
            }
        }
 
        return min;
    }
 

    public static void main(String[] args)
    {
        int[] dims = { 10, 30, 5, 60 };
 
        System.out.print("The minimum cost is " +matrixChainMultiplication(dims, 0, dims.length - 1));
    }
}