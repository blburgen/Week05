package week05;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		for (int i = 0; i < log.length()-1; i++) {
			System.out.print(log.charAt(i) + " ");
		}
		System.out.println(log.charAt(log.length()-1));
	}

	@Override
	public void error(String error) {
		System.out.print("ERROR: ");
		for (int i = 0; i < error.length()-1; i++) {
			System.out.print(error.charAt(i) + " ");
		}
		System.out.println(error.charAt(error.length()-1));
	}

}
