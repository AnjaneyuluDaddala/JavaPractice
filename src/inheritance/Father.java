package inheritance;

public class Father extends Grandfather{
	double  balance;
	String name;
	double withdraw;
	 int age;
	
	 
	 Father(double balance,double withdraw,String name,int age){
		 super(1000.0,200,"venkat",98);
		 this.balance=balance;
		 this.withdraw=withdraw;
		 this.name=name;
		 this.age=age;		 
		 
	 }
	 
	 double withdraw() {
		 balance=balance-withdraw;
		 System.out.println(balance);
		 System.out.println();
		 
		 super.withdraw();
		 balanceOfGrandfather();
		 return balance;
	 }
	
	 double FatherBalance() {
		 double currentBalance=this.balance;
		 System.out.println("The current balance of father amount:"+ currentBalance );
		 super.shareProperty();
		 System.out.println();
		 return currentBalance;

	 }
	void shareProperty() {
		 System.out.println("Share 50% property to my son ");
		 System.out.println("Share 40% property to my grandson");
		 System.out.println("Share 10% property to my grandDaughter");
	 }
	 
}

