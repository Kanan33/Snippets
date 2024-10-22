//finding factorial of a number
import java.util.Scanner;//importing Scanner class
public class factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();//taking input from the user
        int fact=1;
        for(int i=1;i<=n;i++)
        fact=fact*i;//calulating factorial
        System.out.println("FACTORIAL="+fact);//prnting factorial
    }
}
