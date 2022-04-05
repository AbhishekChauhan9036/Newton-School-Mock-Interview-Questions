/*
Time Complexity: O(log n). 
Space Complexity:O(1)
1) Find middle point mid = (l + h)/2
2) If key is present at middle point, return mid.
3) Else If arr[l..mid] is sorted
    a) If key to be searched lies in range from arr[l]
       to arr[mid], recur for arr[l..mid].
    b) Else recur for arr[mid+1..h]
4) Else (arr[mid+1..h] must be sorted)
    a) If key to be searched lies in range from arr[mid+1]
       to arr[h], recur for arr[mid+1..h].
    b) Else recur for arr[l..mid] 
*/
import java.util.*;
class Main {
    static int binarySearch(int arr[], int l, int h, int key)
    {
        if (l > h)
            return -1;
 
        int mid = (l + h) / 2;
        if (arr[mid] == key)
            return mid;
 
        if (arr[l] <= arr[mid]) {
            if (key >= arr[l] && key <= arr[mid])
                return binarySearch(arr, l, mid - 1, key);
            return binarySearch(arr, mid + 1, h, key);
        }
 
        if (key >= arr[mid] && key <= arr[h])
            return binarySearch(arr, mid + 1, h, key);
 
        return binarySearch(arr, l, mid - 1, key);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
               arr[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            
            System.out.println(binarySearch(arr, 0, n - 1, key));
        }
    }