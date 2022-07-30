package tnsif.c2tc.entities;
import java.util.HashSet;
import java.util.Set;

public class CustomerCollectionExample {

	public static void main(String[] args) {
		Set<Student> set=new HashSet();
		Student student=new Student();
		student.setUid(102);
		student.setName("Nikhitha");
		set.add(student);
		Student student1=new Student();
		student1.setUid(103);
		student1.setName("Thanu");
		set.add(student1);
		Student student2=new Student();
		student2.setUid(104);
		student2.setName("Nikhitha");
		set.add(student2);
		for(Student stud:set)
		System.out.println(stud);
		

	}

}
