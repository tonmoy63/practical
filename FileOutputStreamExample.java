package Thread;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String args[]) {
		try {
			FileOutputStream obj = new FileOutputStream("C:\\Users\\halde\\Desktop\\test.txt");
			obj.write(2101252050);
			String s="Tonmoy Halder";
			byte b[]=s.getBytes();
			obj.write(b);
			obj.close();
			System.out.println("done");
		}
		catch (Exception e) {
			System.out.println(e);	
		}
	}

}