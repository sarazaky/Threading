package threading;

public class TestThreading {
	
	public static void main(String[] args) {
		
		PrintNumOrAlph th = new PrintNumOrAlph("numbers");
		PrintNumOrAlph th2 = new PrintNumOrAlph("alphabets");
		th.start();
		th2.start();

	}
}
