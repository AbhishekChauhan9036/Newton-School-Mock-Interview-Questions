import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=1;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				count++;
			}
		}
		System.out.println(count);
	}
}