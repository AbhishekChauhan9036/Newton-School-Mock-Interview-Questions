static long  Sum(long  n) 
    { 
      long sum = n % 10;
        if(n == 0)
        {
            return 0;
        }
        else
        {
             return sum + Sum(n / 10);
        }
    }