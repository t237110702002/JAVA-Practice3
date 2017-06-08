package threadTest;

public class ThreadOne extends Thread{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("This is No."+i+" times run this line");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
