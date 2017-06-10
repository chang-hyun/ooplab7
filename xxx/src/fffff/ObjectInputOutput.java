package fffff;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutput {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Emp emp = new Emp();
		emp.setDepartment("AA");
		emp.setEmp_no(1);
		emp.setEmp_name("dd");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\object.txt",true);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(emp);
		
		oos.close();
		fos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\object.txt"));
		emp = (Emp)ois.readObject();
		
		System.out.println(emp);
		ois.close();
		

		
	}

}
