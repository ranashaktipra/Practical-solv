class Threadpriority
{
	public static void main(String args[])
	{
		Thread t=Thread.currentThread();
		System.out.println("ThreadName:"+t.getName());
		System.out.println("Priority:"+t.getPriority());
		t.setName("mythread");
		t.setPriority(2);
		System.out.println("nOW ThreadName:"+t.getName());
		System.out.println("Priority:"+t.getPriority());
	}
}