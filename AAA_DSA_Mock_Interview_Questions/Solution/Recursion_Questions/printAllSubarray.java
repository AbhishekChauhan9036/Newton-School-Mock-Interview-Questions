static void PrintSubarrays(int arr[], int n){
	
		for (int i=0; i <n; i++) 
		{
			for (int j=i; j<n; j++) 
			{
				for (int k=i; k<=j; k++)
 
				{
					System.out.print( arr[k]+" "); 
				}
				System.out.println();
			}
		}
}