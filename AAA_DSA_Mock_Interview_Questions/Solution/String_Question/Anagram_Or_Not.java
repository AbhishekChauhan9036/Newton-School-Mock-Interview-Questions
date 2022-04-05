import java.util.Arrays;  
public class Main {  
    static void isAnagram(String s1, String s2) {  
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = s1.toCharArray();  
            char[] ArrayS2 = s2.toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
            System.out.println("anagrams");  
        } else {  
            System.out.println("not anagrams");  
        }  
    }  
   
    public static void main(String[] args) {   
        isAnagram("abc", "bac");  
    }  
}