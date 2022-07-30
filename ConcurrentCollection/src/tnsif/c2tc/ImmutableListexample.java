package tnsif.c2tc;

import java.util.List;

import tnsif.c2tc.entities.Student;

public class ImmutableListexample {
	public static void main(String[] args) {
		Student student1 = new Student(1, "msc","niki");
		Student student2 = new Student(2, "bsc","thanu");
		Student student3 = new Student(3, "mba","poo");
		List<Student> immutableList = List.of(student1, student2, student3);
		for(Student s: immutableList)
		{
			System.out.println("RollNo:" +s.getRollNo());
			System.out.println("Class Name:" +s.getClassName());
			System.out.println("Name:" +s.getName());
	}
		immutableList.get(1).setClassName("msc");
		System.out.println("After make changes of Rollno 2:"+
		immutableList.get(1).getClassName());

		
	}

}
