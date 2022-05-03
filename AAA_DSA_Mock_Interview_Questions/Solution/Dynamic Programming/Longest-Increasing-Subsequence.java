class Main
{
    public static int LIS(int[] arr, int i, int n, int prev)
    {
        if (i == n) {
            return 0;
        }
        int excl = LIS(arr, i + 1, n, prev);
 

        int incl = 0;
        if (arr[i] > prev) {
            incl = 1 + LIS(arr, i + 1, n, arr[i]);
        }
 
        return Integer.max(incl, excl);
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
 
        System.out.print("The length of the LIS is "+ LIS(arr, 0, arr.length, Integer.MIN_VALUE));
    }
}