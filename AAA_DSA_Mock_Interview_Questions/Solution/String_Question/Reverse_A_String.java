import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	
	String str= "Abhishek", twostr="";
	char ch;
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i);
		twostr= ch+twostr; 
	}
	System.out.println(twostr);
	}
}