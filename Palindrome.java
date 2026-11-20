import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner A=new Scanner(System.in);
        int a=A.nextInt();
        int rev=0;
        int b=a;
        while(b>0)
        {
            rev=(rev*10)+(a%10);
            a=a/10;
        }
        if(rev==a)
        {
            System.out.println("Palindrome");
        }
        A.close();
    }
}