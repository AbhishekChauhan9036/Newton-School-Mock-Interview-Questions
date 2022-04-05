public class Main{
static int countGreater(int arr[], int n, int k)
{
	int l = 0;
	int r = n - 1;
	int leftGreater = n;
	while (l <= r) {
		int m = l + (r - l) / 2;

		if (arr[m] > k) {
			leftGreater = m;
			r = m - 1;
		}
		else
			l = m + 1;
	}

	return (n - leftGreater);
}

public static void main(String[] args)
{
	int arr[] = { 3, 3, 4, 7, 7, 7, 11, 13, 13 };
	int n = arr.length;
	int k = 7;
	System.out.println(countGreater(arr, n, k));
}
}