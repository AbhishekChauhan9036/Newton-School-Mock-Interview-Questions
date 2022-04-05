//Time complexity-O(n*log(n))
import java.util.Scanner;
public class Main{
public static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            heapify(arr, i, 0);
        }
    }
 

    public static void heapify(int arr[], int n, int i)
    {
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
 
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        if (r < n && arr[r] > arr[largest])
            largest = r;
 

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
 
    public static void print(int arr[],int n)
    {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
  
    /*This code is contributed by Abhishek Chauhan */
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
					int n=sc.nextInt();
          int arr[] = new int[n];

		      for(int i=0;i<n;i++){
			      arr[i]=sc.nextInt();
		      }
        sort(arr);
        print(arr,n);
    }
}