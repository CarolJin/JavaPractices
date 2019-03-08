package fileOperations;

import java.io.*;

public class CreateFile {

	public static void main(String[] args) {
		
		File f1 = new File("f1.log");
		try {
			if(f1.createNewFile()) {
				System.out.println("File f1 is created.");	
				f1.renameTo(new File("f1Updated.log"));
				f1.deleteOnExit();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File d1 = new File("/");
		if(d1.isDirectory()) {
			File[] files = d1.listFiles();
			for(File f : files) System.out.println(f.getName());
		}
		
		File f2 = new File("f2.txt");
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f2)));
			pw.println("This is the new texts to f2.");
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			BufferedReader br = new BufferedReader(new FileReader(f2));
			String text = br.readLine();
			while(text!=null) {
				System.out.println(text);
				text = br.readLine();
				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File f3 = new File("f3.txt");
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(f3, true); // true - means append new texts to the file
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			String name = "Caroline";
			int age = 30;
			double bal = 12323.234;
			
			dos.writeUTF(name);
			dos.writeInt(age);
			dos.writeDouble(bal);	
			dos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(f3); // true - means append new texts to the file
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);		
			System.out.printf("%s %d %f", dis.readUTF(), dis.readInt(), dis.readDouble());	
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
