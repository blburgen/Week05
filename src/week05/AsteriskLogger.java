package week05;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		boxLine(error);
		System.out.println("***ERROR: " + error + "***");
		boxLine(error);
		
	}
	
	private static void boxLine(String error) {
		int totalAstericks = 13 + error.length();
		for (int i = 0; i < totalAstericks - 1 ; i++) {
			System.out.print("*");
		};
		System.out.println("*");
	};

}
