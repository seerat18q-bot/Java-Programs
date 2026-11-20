import java.util.*;
class Fibo
{
    public static void main(String args[])
    {
        Scanner A= new Scanner(System.in);
        System.out.println("Number of digits");
        int n=A.nextInt();
        int a=0;
        int b=1;
        for(int x=0; x<n; x++)
        {
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
        A.close();
    }
}