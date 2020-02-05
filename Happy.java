import java.util.*;
class Happy
{
    int n,num;
    Scanner sc=new Scanner(System.in);
    Happy()
    {
        n=0;
    }
    void getnum()
    {
        System.out.println("Enter the number ");
        n= sc.nextInt();
    }
    int sum_sq_digits(int x)
    {
       if(x/10==0)
       return x*x;
       else
       {
       return (int)Math.pow(x%10,2)+ sum_sq_digits(x/10);
    }
    }
    void ishappy()
    {
        while((num=sum_sq_digits(n))/10!=0)
        {
            n=num;
        }
        if ( num==1) 
        System.out.println("It is a happy number ");
        else
        System.out.println("Not a happy number");
    }
    public static void main(String args[])
    {
        Happy ob = new Happy();
        ob.getnum();
        ob.ishappy();
    }
}
