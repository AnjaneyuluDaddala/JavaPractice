package coreJava;

public class MethodReturnType {
	double x;
	double y;
	
	MethodReturnType(double x,double y){
		this.x=x;
		this.y=y;
		
	}
	
	double claculator( double add,double sub) {
		  
		
		double operator=add;
		double op1=sub;
		return operator;
		//return op1;
		}
	
	double addition() {
		return x+y;
		
	}
	double subtraction() {
		return x-y;
		
	}
	double multiply() {
		return x*y;
		
		
		
	}
	double division() {
		return x/y;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String str=new String();
	
		MethodReturnType mw=new MethodReturnType(23,4);
		
	    double add=mw.addition();
	    double sub=mw.subtraction();
		mw.claculator(add,sub);
		
		System.out.println("Addition & subtraction of two numbers is=" +mw.claculator(add,sub));
		
	 }

}



