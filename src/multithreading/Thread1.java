package multithreading;

public class Thread1 extends Thread{
	public void run() {
		System.out.println("Thread 1 is running....");
			Task1 T1=new Task1();
		for(int i=0;i<3;i++) {
			System.out.println("Thread 1 is running....of iteration "+i);
			
			T1.CheckVoter();
			System.out.println();
			System.out.println();
			
			T1.AttemptVote();
			
		}
			
		
	}

		
	
}
