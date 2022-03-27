
public class SpacedLogger implements Logger{

	@Override
	public void Log(String log) {
		System.out.println(log.replace("", " ").trim());
		
	}

	@Override
	public void Error(String error) {
		System.out.println("ERROR: " + error.replace("", " ").trim());
		
	}

}
