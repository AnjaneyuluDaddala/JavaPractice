package coreJava;

public class CallingTwoConstructorsSametime {
	
	private double salary;
	private double expenditure;
	
	CallingTwoConstructorsSametime(){
		this(200);
		//this(200,900); // intalizing the 2 parametrazed constructor.
		
		
		//this(); this comes error of recursive constructor..
		System.out.println("Involking default constructor......");
		
		
	}
	CallingTwoConstructorsSametime(double salary){
		this(200,900);
		this.salary=salary;
		System.out.println("Involking 2 parametazied constructor values are ...... "+salary);
			
	}
    CallingTwoConstructorsSametime(double salary,double expenditure){
    	//this();
    	this.salary=salary;
    	this.expenditure=expenditure;
		System.out.println("Involking 3 parametazied constructor values are...... "+salary+" and  "+expenditure);
		
	}

	public static void main(String[] args) {
		CallingTwoConstructorsSametime c=new CallingTwoConstructorsSametime();


	}

}
