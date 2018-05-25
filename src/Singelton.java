
public class Singelton {

	private static Singelton ME = null;
	
	
	private Singelton() {
		
	}
	
	public static Singelton getInstance(){
		
		if(ME == null){
			ME = new Singelton();
		}
		
		return ME;
		
	}
	
	
	
	
	
	
}
