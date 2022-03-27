
public class AsteriskLogger implements Logger {

	
	
	

	public  void Log(String log) {
	System.out.println("***"+ log + "***");
		
	}

	@Override
	public void Error(String error) {
		System.out.println("***************");
		System.out.println("***"+ error + "***");
		System.out.println("****************");
		
	}

}
