import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    s=s.toLowerCase();
    boolean check=true;
    for(int i=0;i<s.length()-1;i++){
      if(s.charAt(i)!=s.charAt(s.length()-i-1)){
        check=false;
        break;
      }
    }

    if(check){
      System.out.print("Palindrome");
    }else{
      System.out.print("Not Palindrome");
    }
  }
}