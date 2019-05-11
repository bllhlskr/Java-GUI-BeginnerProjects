package pack;
public class ToolKit {
	public static String generateId(int length) {
		String id = "";
		for (int i = 0; i < length; i++) {
			id += (int) (Math.random() * 10);
		}

		return id;
	}

}
