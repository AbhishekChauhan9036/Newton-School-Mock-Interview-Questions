import java.util.*;
class Main{
    public static int kadane(int[] A)
    {
        int maxStart = 0;
        int maxEnd = 0;
        for (int i: A)
        {
            maxEnd =maxEnd  + i;
            maxEnd  = Integer.max(maxEnd , 0);
            maxStart = Integer.max(maxStart, maxEnd );
        }
 
        return maxStart;
    }
 
    public static void main(String[] args)
    {
        int[] A = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
 
        System.out.println(kadane(A));
    }
}