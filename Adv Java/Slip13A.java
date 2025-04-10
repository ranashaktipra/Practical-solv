class Mythread extends Thread
{
	public void run()
	{
		try
		{
			while(true)
			{
				System.out.println("name of Current Thread="+Thread.currentThread().getName());
				System.out.println("Priority of  Thread="+Thread.currentThread().getPriority());
				Thread.sleep(3000);
			}

		}catch(Exception e) {}

	}
}


public class Slip13A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mythread m1=new Mythread();
		Mythread m2=new Mythread();
		m1.setName("Thread1");
		m1.setName("Thread2");
		m1.start();
		m2.start();

	}

}