package threadTest;

public class testMain {


	public static void main(String arg[]){
		//宣告一下兩個測試的執行緒
		ThreadOne testTh1=new ThreadOne();
		ThreadTwo testTh2=new ThreadTwo();

		//測試'.start()'會不會跑到兩個執行緒的run()裡面
		
		testTh1.setPriority(8);
		testTh2.setPriority(1);
		testTh1.start();
		testTh2.start();
	}
}
