/*
Time Complexity: O(log n)
Space Complexity: O(1)
*/
import java.util.Scanner;
public class Main {
	static int RoatedArraySearch(int arr[], int l, int h, int key)
	{
		if (l > h)
			return -1;

		int mid = (l + h) / 2;
		if (arr[mid] == key)
			return mid;

		if (arr[l] <= arr[mid]) {
			if (key >= arr[l] && key <= arr[mid])
				return RoatedArraySearch(arr, l, mid - 1, key);

			return RoatedArraySearch(arr, mid + 1, h, key);
		}

		if (key >= arr[mid] && key <= arr[h])
			return RoatedArraySearch(arr, mid + 1, h, key);

		return RoatedArraySearch(arr, l, mid - 1, key);
	}

	public static void main(String args[])
	{
		int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
		int n = arr.length;
		int key = 6;
		int i = RoatedArraySearch(arr, 0, n - 1, key);
		if (i != -1)
			System.out.println(i);
		else
			System.out.println("Key not found");
	}
}