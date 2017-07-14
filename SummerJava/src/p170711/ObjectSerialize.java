package p170711;

import java.io.*;

class Data implements Serializable {
	public static int bunho;

	private transient int number;
	private String name;
	private int age;

	static {
		bunho = 0;
	}

	public Data() {
		number = ++bunho;
		name = "noname";
		age = 0;
	}

	public Data(String name, int n) {
		number = ++bunho;
		this.name = name;
		age = n;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Data [number=" + number + ", name = " + name + ",age=" + age + "]";
	}
}

public class ObjectSerialize {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		Data Obj[] = new Data[3];
		Obj[0] = new Data("박문석", 44);
		Obj[1] = new Data("이유진", 43);
		Obj[2] = new Data("김태현", 42);
		for (Data k : Obj)
			System.out.println(k);
		System.out.println("===============================");
		System.out.println("직렬화해서 저장한 후 가져와서 출력");
		System.out.println("===============================");

		try {
			fos = new FileOutputStream("c:\\users\\rlaan\\test.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(Obj[0]);
			oos.writeObject(Obj[1]);
			oos.writeObject(Obj[2]);
			fis = new FileInputStream("c:\\users\\rlaan\\test.txt");
			ois = new ObjectInputStream(fis);
			Data temp = (Data) ois.readObject();
			System.out.println(temp);
			temp = (Data) ois.readObject();
			System.out.println(temp);
			temp = (Data) ois.readObject();
			System.out.println(temp);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (ois != null)
					ois.close();
				if (fos != null)
					fos.close();
				if (oos != null)
					oos.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}
