package com.Practise;

class Employee {
	private int age;
	private String name;
	private int Salary;
	private int id;

	public Employee(int age, String name, int Salary, int id) {
		this.age = age;
		this.name = name;
		this.Salary = Salary;
		this.id = id;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", id=").append(id);
        sb.append(", Salary='").append(Salary).append('\'');
        sb.append('}');
        return sb.toString();
    }
}


