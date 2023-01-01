package com.designpattern.Builder;

public class Employee {
	
	private int id;
	
	private String name;
	
	private String address;
	
	
	
	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public static EmployeeBuilder getBuilder() {
		return new EmployeeBuilder();
	}
	
	public static class EmployeeBuilder {
	
		private int id;
		
		private String name;
		
		private String address;
		
		private Employee emp;
		
		public EmployeeBuilder() {
			
		}
		
		public EmployeeBuilder withId(int id) {
			this.id = id;
			return this;
		}
		
		public EmployeeBuilder withName(String name) {
			this.name = name;
			return this;
		}
		
		public EmployeeBuilder withAdd(String address) {
			this.address = address;
			return this;
		}
		
		public Employee build() {
			emp = new Employee();
			emp.setId(this.id);
			emp.setName(this.name);
			emp.setAddress(this.address);
			return emp;
		}
		
	}
	
	
	

}
