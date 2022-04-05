import java.io.*; 
import java.util.*;
class Main {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String res="";
		int i=0;
		while(i<s.length())
		{
			int c=1;
			int j=i+1;
			while(j<s.length() && s.charAt(i)==s.charAt(j) )
			{
				c++;
				j++;
			}
			res+=Character.toString(s.charAt(i))+Integer.toString(c);
			i=j;
		}
		System.out.println(res);
	}
}