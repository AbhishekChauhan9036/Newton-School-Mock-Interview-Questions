// Time Complexity=O(n^2)
import java.util.Scanner;
class Main{
	public static void Selection_Sort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
		{
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}

    for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
  /* This code is contributed by Abhishek Chauhan*/
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    Selection_Sort(arr);
	}
}