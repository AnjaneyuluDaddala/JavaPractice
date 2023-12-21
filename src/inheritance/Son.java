package inheritance;

public class Son extends Father{
	double  AccountBalance;
	 String name;
	 int age;
	 
	 Son(double AccountBalace,String name,int age){
		 super(345.0,100,"valmiki",56);
	 }
		
	 public static void main(String[] args) {
			Son s=new Son(50,"Anjan",21);
			//s.withdraw();//it is not visible if we put in private assign withdraw method.
			s.withdraw();
			s.FatherBalance();
			s.shareProperty();

		}
}
