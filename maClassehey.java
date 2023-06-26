package hello;
public class maClassehey {

	public static void main(String[] args) {
		int counter = 0;
				
		for (int i = 0; i < 10; i++) {
			counter++;
			printMsg(counter);
		}
	}
	public static void printMsg(int counterValue) {
		System.out.println("explosion dans : "+counterValue);
	}
}
