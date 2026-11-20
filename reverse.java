import java.util.*;
class reverse
{
    public static void main(String[] args)
    {
        Scanner A= new Scanner(System.in);
        System.out.print("Enter number: ");
        int a=A.nextInt();
        int rev=0;
        while(a>0)
        {
            rev=(rev*10)+(a%10);
            a=a/10;
        }
        System.out.println(rev);
        A.close();
    }
}