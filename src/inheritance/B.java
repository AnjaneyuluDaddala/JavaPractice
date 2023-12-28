package inheritance;

public class B extends A {
	B(int x){
		
		super(x);
		
	 
 }
	B(double x,int y){
		super(y);
	}
	
	
	B(double x,double y){
		//this();
		super(y);  
		
	}
		
	B(){
		this(10);
	}
	

	

}
