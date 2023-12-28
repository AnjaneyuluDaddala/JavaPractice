package multithreading;

public class Task2 {
	
	public void  SendingMoneyPetrol() {
		try{
			System.out.println("scan the phonepay scanner...");
			Thread.sleep(5000);
			System.out.println("sent the money to petrol filling person.....");
			
		}
		catch(Exception e) {
			System.out.println("sorry,error is detected in Task2 in first Method");
		}
		
		
	}
	
	public void  PetrolFilling()   {
		try {
			System.out.println("He chicked the money. He set the petrol to fill..");
			Thread.sleep(5000);
			System.out.println();
			System.out.println("Petrol is filled ,he went the petrol bank.....");
			
			
		}
		catch(Exception e) {
			System.out.println("sorry,error is detected in Task2 in second Method");
		}
		
	}

}
