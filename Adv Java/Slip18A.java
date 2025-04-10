public class Slip18A {
    
}
import java.util.Scanner;

class FactThread extends Thread
{
	int n,fact=1;;
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		n=sc.nextInt();

	}
	public void run()
	{
		try
		{
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
				System.out.println(""+fact);
				Thread.sleep(1000);
			}

		}catch(Exception e) {}
	}
}
public class FactorialThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactThread f=new FactThread();
		f.read();
		f.start();
	}

}