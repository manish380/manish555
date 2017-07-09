import java.util.Scanner;

public class number_of_digits
{
    public static void main(String args[])
    {
        int n,c=0,r;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("enter the number ? ");
        n = scan.nextInt();
	while(n!=0)
	{
	r=n%10;
	c++;
	n=n/10;
	}
	System.out.println("number of digits:"+c);
    }
}