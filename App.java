
public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger ();
		logger.Log("hello");
		logger.Error("apple");
		Logger spaced  = new SpacedLogger ();
	    spaced.Log("goodbye");
	    spaced.Error("orange");
		}

	}


