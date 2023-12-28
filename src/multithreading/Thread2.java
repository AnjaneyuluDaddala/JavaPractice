package multithreading;

public class Thread2 extends Thread {
	public void run() {
		System.out.println("Thread 2 is running....");
		System.out.println();
		Task2 T2=new Task2();
		for(int i=0;i<3;i++) {
			System.out.println("Thread 2 is running....of iteration "+i);
			
			T2.SendingMoneyPetrol();
			System.out.println();
			System.out.println();
			T2.PetrolFilling();
			
		}
			
		
	}  

	}

