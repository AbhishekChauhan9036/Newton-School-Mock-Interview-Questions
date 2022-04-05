
/*
Time Complexity: O(n log n) 
Auxiliary Space: O(1)
*/
import java.util.Arrays;
public class Main{
	static String removeDupsSorted(String str)
	{
		int resind = 1, ipind = 1;
		char arr[] = str.toCharArray();
		while (ipind != arr.length)
		{
			if(arr[ipind] != arr[ipind-1])
			{
				arr[resind] = arr[ipind];
				resind++;
			}
			ipind++;
		
		}
	
		str = new String(arr);
		return str.substring(0,resind);
	}
	
	static String removeDups(String str)
	{
	char temp[] = str.toCharArray();
	Arrays.sort(temp);
	str = new String(temp);
	return removeDupsSorted(str);
	}
	
	public static void main(String[] args)
	{
		String str = "bbbaactawwkkk";
		System.out.println(removeDups(str));
	}
}