package com.designpattern.builderDesignPattern;

public class User {
	private String name;
	
	private String age;
	
	private String address;

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	private void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	private void setAddress(String address) {
		this.address = address;
	}
	
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	// Builder
	public static UserBuilder getBuilder() {
		return new UserBuilder();
	}
	
	public static class UserBuilder {
		private String fname;
		
		private String lname;
		
		private String age;
		
		private String address;
		
		private User user;
		
		public UserBuilder withFirstName(String fname) {
			this.fname = fname;
			return this;
		}
		
		public UserBuilder withLastName(String lname) {
			this.lname = lname;
			return this;
		}
		
		public UserBuilder withAge(String age) {
			this.age = age;
			return this;
		}
		
		public UserBuilder withAddress(String address) {
			this.address = address;
			return this;
		}

		public User build() {
			User user = new User();
			user.setName(this.fname+this.lname);
			user.setAge(this.age);
			user.setAddress(this.address);
			return user;
		}
		
	}
	
	
	

}
