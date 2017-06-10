package fffff;

import java.io.Serializable;

public class Emp implements Serializable{

	private int emp_no;
	private String emp_name;
	private String department;
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String toString(){
		return department + "\t"+emp_no+"\t"+emp_name;
	}
}
