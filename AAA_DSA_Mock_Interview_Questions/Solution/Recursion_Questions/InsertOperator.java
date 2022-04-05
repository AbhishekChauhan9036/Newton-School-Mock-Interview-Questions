import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
  public static int rec(long [] arr,long sum,int i)
  {  
	  if(i==arr.length){
		  if(sum==0)
		  return 0;
	  
		  else
	  	return 1;}
	  return rec(arr,sum-arr[i],i+1)*rec(arr,sum+arr[i],i+1);
	
  }

	public static void main (String[] args) {
                 Scanner sc=new Scanner(System.in);
				 int n=sc.nextInt();
				 long target=sc.nextLong();
				long [] arr=new long[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextLong();
			}
			int sum=rec(arr,target,0);
			if(sum==0)
			System.out.println("YES");
			else
			System.out.println("NO");


	}
}