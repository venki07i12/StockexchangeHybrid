package utilities;

public class Dummy {

	public static void main(String[] args) throws Exception {
		PropertyFileUtil pt = new PropertyFileUtil();
		String keyvalue = pt.getValueForkey("Browser");
		System.out.println(keyvalue);
	}

}
