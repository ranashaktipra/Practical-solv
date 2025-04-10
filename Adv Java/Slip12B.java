class RandomThread1 extends Thread
{
	int i=1;
	RandomThread1(String name)
	{
		setName(name);
	}
	public void run()
	{
		try
		{
			System.out.println(this.getName()+"\t Created");
			while(i<=5)
			{
				int s=(int)(Math.random()*5000);
				System.out.println("Thread\t"+this.getName()+"\tsleep for\t"+s+"Seconds");
				i=i+1;
				Thread.sleep(s);
			}
			System.out.println(""+this.getName()+"\tDead");
			System.out.println(""+this.getName()+"\tDead");
		}catch(Exception e){}
	}
}
class RandomThread
{
	public static void main(String arg[]) throws Exception
	{
		RandomThread1 r1=new RandomThread1("Thrad1");
		RandomThread1 r2=new RandomThread1("Thread2");
		r1.start();
		r2.start();

	}
}