package threadTest;


/* 如何中斷一個正在執行的線程 ?
 * 既不是用stop方法，也不是用interrupt方法，
 * 而是通過引入了共享變量的形式有效地解決了線程中斷的問題。
 */


public class Threading2 extends Thread{

	static String str = "1";
	boolean stop = false;
	public void run() { 
		while(!stop){ 
			System.out.println(str); 
			try{ 
				Thread.sleep(1000); 
			}catch(Exception e){} 
		} 
	} 
	
	
	public static void main(String[] args) throws InterruptedException { 
		Threading2 t = new Threading2(); 
		t.start();
		str = "2"; 
		
		Thread.sleep(3000);

		t.stop=true; // 修改共享變量

		Thread.sleep(3000); // 主線程休眠以觀察線程中斷後的情況

		System.out.println("Stopping application...");



	} 
}

