package Question2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		Address ad=new Address("Karnataka", "Bangalore", "560068");
		Employee emp= new Employee(201, "Savita", ad, "savi@gmail.com", "12345");
		
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("emp.txt"));
		oos.writeObject(emp);
		oos.close();
		System.out.println("Done..");
		
		// Deserialization =========================
		
		System.out.println("Deserialization =========================");
		
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("emp.txt"));
		Employee emp1=(Employee)ois.readObject();
		System.out.println(emp1);
		ois.close();

	}

}
