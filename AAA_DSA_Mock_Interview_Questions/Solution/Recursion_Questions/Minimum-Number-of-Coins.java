import java.util.*;
class Main{
	static int minCoins(int arr[], int m, int V)
	{
	if (V == 0) return 0;
	int ans= Integer.MAX_VALUE;
	for (int i=0; i<m; i++)
	{
		if (arr[i] <= V)
		{
			int subres = minCoins(arr, m, V-arr[i]);
			if (subres != Integer.MAX_VALUE && subres + 1 < ans)
				ans = subres + 1;
		}
	}
	return ans;
	}
	public static void main(String args[])
	{
	int arr[] = {9, 6, 5, 1};
	int m = arr.length;
	int V = 11;
	System.out.println( minCoins(arr, m, V) );
	}
}