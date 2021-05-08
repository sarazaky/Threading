package threading;

public class PrintNumOrAlph extends Thread{
private String type;
	
	public PrintNumOrAlph(String type) {
		this.type = type;
	}
	@Override
	public void run() {
		if(type == "numbers") {
			for(int i = 0; i<30;i++) {
				System.out.println(i);
				try {
					sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		else if(type == "alphabets"){
			for(char i = 'a'; i<='z' ;i++) {
				System.out.println(i);
				try {
					sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
