static void printPattern(int n, int m, boolean flag)
    {
         
       
        System.out.print(m + " ");
        if (flag == false && n == m)
            return;
 
        if (flag) {
 

            if (m - 5 > 0)
                printPattern(n, m - 5, true);
 
            else 
                printPattern(n, m - 5, false);
        }
 
        else 
            printPattern(n, m + 5, false);
    }