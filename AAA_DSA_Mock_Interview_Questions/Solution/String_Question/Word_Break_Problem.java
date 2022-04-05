import java.io.*;
import java.util.*;
public class Main{ 
public static boolean StringMethods(String s, List<String> wordDict) {
    boolean[] f = new boolean[s.length() + 1];
    f[0] = true;
    for (int i = 1; i <= s.length(); i++) {
      for (int j = 0; j<i; j++) {
        if (f[j] && wordDict.contains(s.substring(j, i))) {
          f[i] = true;
          break;
        }
      }
    }
    return f[s.length()];
  }
   
public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

					String line = sc.next();
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> arr = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            arr.add(p);
                        }
                    
                    System.out.println(StringMethods(line,arr));  
        }
}