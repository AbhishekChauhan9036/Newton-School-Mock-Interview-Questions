class Main{
public static void main (String args[])
{
    int first=0, second=1, i, n, sum=0;

     n=10;
    for(i=0 ; i<n ; i++)
    {
        if(i <= 1){
            sum=i;
        }
        else
        {
            sum=first + second;
            first=second;
            second=sum;
        }
            System.out.print(sum+" ");
    }
}
}