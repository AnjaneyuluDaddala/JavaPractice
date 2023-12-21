package inheritance;

public class Grandfather {
 private double  balance;
 private String name;
 private int age;
 private double withdraw;
  Grandfather(double balance,double withdraw,String name,int age) {
	 this.balance=balance;
	 this.withdraw=withdraw;
	 this.name=name;
	 this.age=age;
 }
 
  double withdraw() {
	 balance=balance-withdraw;
	 System.out.println(balance);
	 return balance;
 }
  double balanceOfGrandfather() {
	 double currentBalance=this.balance;
	 System.out.println("The current balance of grandfather amount:"+ currentBalance );
	 return currentBalance;
	 
 }
  void shareProperty() {
	 System.out.println("Share 50% property to my son ");
	 System.out.println("Share 10% property to my grandson");
	 System.out.println("Share 30% property to my grandDaughter");
 }
 
}
