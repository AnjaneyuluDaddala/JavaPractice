package inheritance;

public class C extends B {

	public C(double a,int b) {
		super(23.4,23.1);
		System.out.println("a and b values are "+a +" and "+b);
		
	}

	public static void main(String[] args) {
		C c=new C(234.4,34);

	}

}
