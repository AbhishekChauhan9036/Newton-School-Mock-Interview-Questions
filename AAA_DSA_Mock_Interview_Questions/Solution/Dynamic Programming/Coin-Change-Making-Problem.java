class Main
{
    public static int findMinCoins(int[] S, int target)
    {
        if (target == 0) {
            return 0;
        }
 
        if (target < 0) {
            return Integer.MAX_VALUE;
        }
 
        int coins = Integer.MAX_VALUE;
 
        for (int c: S)
        {
            int result = findMinCoins(S, target - c);
 

            if (result != Integer.MAX_VALUE) {
                coins = Integer.min(coins, result + 1);
            }
        }
 
        return coins;
    }
 
    public static void main(String[] args)
    {
        int[] S = { 1, 3, 5, 7 };
        int target = 18;
 
        int coins = findMinCoins(S, target);
        if (coins != Integer.MAX_VALUE)
        {
            System.out.print(coins);
        }
    }
}