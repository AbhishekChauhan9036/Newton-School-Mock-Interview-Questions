// Time Complexity=O(n^2)
import java.util.Scanner;
class Main{
	public static void Insertion_Sort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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

    Insertion_Sort(arr);
	}
}