package multithreading;

public class Task1{
	
	public void  CheckVoter() {
		try {
			
			System.out.println("checking the voter...");
			Thread.sleep(5000);
			System.out.println();
			System.out.println("The checking is done,moving to pool for vote.....");
			
			
		}
		catch (Exception e) {
			System.out.println("sorry,error is detected in Task1 in first Method");
			
		}
		
	}
	
	public void  AttemptVote()   {
		try {
			
			System.out.println("slip is taken from officer and moving to conducting is vote...");
			Thread.sleep(5000);
		
			System.out.println("he conducted his vote,moving to out of booth.....");
			System.out.println();
			
			
		}
		catch(Exception e) {
			System.out.println("sorry,error is detected in Task1 in second Method");
		}
		
	}


}
