/*Given a string you need to print the size of the longest possible substring that has exactly 
    K unique characters. If there is no possible substring then print 
    "not possible" ? Eg: 
    input S = "aabacbebebe", K = 3  output=7

    input s=aabac ,  k=2
    output- 4
*/

import java.util.HashSet;
import java.util.Set;

class Main
{
    public static final int CHAR_RANGE = 128;
    public static String findLongestSubstring(String str, int k)
    {
        if (str == null || str.length() == 0) {
            return str;
        }
 
        int end = 0, begin = 0;
        Set<Character> window = new HashSet<>();

        int[] freq = new int[CHAR_RANGE];
        for (int low = 0, high = 0; high < str.length(); high++)
        {
            window.add(str.charAt(high));
            freq[str.charAt(high)]++;
 
            while (window.size() > k)
            {
                if (--freq[str.charAt(low)] == 0) {
                    window.remove(str.charAt(low));
                }
 
                low++;    
            }

            if (end - begin < high - low)
            {
                end = high;
                begin = low;
            }
        }
 
        return str.substring(begin, end + 1);
    }
 
    public static void main(String[] args)
    {
        String str = "aabacbebebe";
        int k = 3;
 
        System.out.print(findLongestSubstring(str, k).length());
    }
}