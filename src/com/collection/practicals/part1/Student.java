package com.collection.practicals.part1;

public class Student implements Comparable<Student>{

	String name;
	int id;
	int age;
	
	public Student(String name, int id,int age)
	{
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Student)
		{
			Student s = (Student) o;
			if(this.name.equals(s.name) && this.id==s.id && this.age==s.age)
				return true;
			else
				return false;
		}
		else
			throw new IllegalArgumentException("Pass Only Student");
	}
	
	@Override
	public int hashCode()
	{
		return (this.name.toString()+age+id).hashCode();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		return o.age-this.age;
	}
	
}
