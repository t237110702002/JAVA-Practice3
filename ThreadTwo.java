package threadTest;

public class ThreadTwo extends Thread{
	
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("Th2 : "+i+" time");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
