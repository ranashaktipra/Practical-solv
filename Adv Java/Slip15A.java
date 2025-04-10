class MyThread extends Thread{
	public void run() 
	{
		try 
		{
			for(char i='A'; i<='Z';i++) 
			{
				System.out.print(i + " ");
				Thread.sleep(2000);
			}
		}
		catch(Exception e) {}
	}
}


public class Slip15A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread m = new MyThread();
		m.start();
	}

}
