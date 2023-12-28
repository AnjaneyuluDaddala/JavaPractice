package multithreading;

public class Pooling {

	public static void main(String[] args) {
	 
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		System.out.println();
		System.out.println();
		t2.start();

	}

}
