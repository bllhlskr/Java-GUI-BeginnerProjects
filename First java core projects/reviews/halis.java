
public class halis
{
	public static void main(String[] args) {
		String text = "start";
		
		do {
			if(text == "start")
				System.out.println("machine started");
			else if(text == "stop")
				System.out.println("machine stopped");
			
		} while (text != "start" && text != "stop");
	}
}
