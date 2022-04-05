import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    int element=sc.nextInt();
    boolean b=false;
    for(int i=0;i<n;i++){
      if(arr[i]==element){
        b=true;
        break;
      }
    }

    if(b){
      System.out.println("Present");
    }else{
      System.out.println("Not Present");
    }
  }
}