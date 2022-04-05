import java.util.*;
public class Main
{
	public static int search(int A[], int l, int h, int key)
   	{
       while(l<=h){
           int mid = l + (h-l)/2;
           if(A[mid] == key){
               return mid;
           }
           
           if(A[l] < A[mid] ){
           if(key >= A[l] && key < A[mid] ){
               h = mid - 1;
           }else{
               l = mid + 1;
           }
           
           }else{
               if(key > A[mid] && key <= A[h] ){
                   l = mid + 1;
               }else{
                   h = mid - 1;
               }
           }
       }
       return -1;
   }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            
            System.out.println(search(A, 0, n - 1, key));
        
    }
}