package execptionHandling;

public class MultipleTry {
	public static void main(String[] args) {
		try {
			//Try -1
			try 
			{
				try 
				{
					try 
					{
						//nested try blocks
					}
					catch(Exception e){
						
					}
					finally {
						
					}
				}
				catch(Exception e){
					
				}
			}
			catch(Exception e){
				
			}
		}
		catch(Exception e){
			
		}
		try {
			//try-2
		}
		catch(Exception e){
			
		}
	}
}
