
class UserThread extends Thread{
	public void run()
	{
		//task for thread...
		System.out.println("this is user defined thread.");
	}
}
class ThreadOp
{
	public static void main(String[] args) {
		System.out.println("program started..");	
		int x=56+34;
		System.out.println("sum is "+x);
		//Thread...
		Thread t=Thread.currentThread();
		String tname=t.getName();
		System.out.println("current running thread is "+tname);
		//setName
		t.setName("MyMain");
		System.out.println(t.getName());
		try{
			Thread.sleep(5000);
		}catch(Exception e){
		};
		System.out.println(t.getId());
		//going to start user defined thread.
		System.out.println("program ended..");	
		UserThread thread=new UserThread();
		thread.start();

	}
}
