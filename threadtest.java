class ThreadTest
{
	public static void main(String args[])
	{
		System.out.println("main Started");
		Thread th=Thread.currentThread();
		System.out.println("Name of the thread "+th.getName());
		System.out.println("Priority of the thread "+th.getPriority());
		//Changing the name and Priority
		th.setName("Hello JVM");
		th.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Name of the thread "+th.getName());
		System.out.println("Priority of the thread "+th.getPriority());
	}
}