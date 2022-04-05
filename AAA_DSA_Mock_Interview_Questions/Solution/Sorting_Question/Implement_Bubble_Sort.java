// Time Complexity=O(n^2)
import java.util.Scanner;
public class Main {
    public static void BubbleSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=1;
		while(t-->0){
					int n=sc.nextInt();
        int arr[] = new int[n];

		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
        BubbleSort(arr);
		}
        // this code contributed by Abhishek Chauhan
    }
}