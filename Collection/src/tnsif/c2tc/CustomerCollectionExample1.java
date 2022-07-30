package tnsif.c2tc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import tnsif.c2tc.entities.Student;
public class CustomerCollectionExample1 {
	public static void main(String[] args) {
		//Set<Student> set=new HashSet();
		List<Student> set=new ArrayList();
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
		Student student3=new Student();
		student3.setUid(105);
		student3.setName("Nikhitha");
		set.add(student3);
		Student student4=new Student();
		student4.setUid(104);
		student4.setName("Nikhitha");
		set.add(student4);
		System.out.println(student1.equals(student2));
		System.out.println("sorting the elements using comparable");
        Collections.sort(set);
		for(Student stud:set)
		System.out.println(stud);
		System.out.println("Sorting the elements using comparator");
		Comparator<Student> cmp=new Comparator<Student>()
				{
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getName().compareTo(o1.getName())>0)
					return 1;
				else
					return -1;
			}
				};
				Collections.sort(set,cmp);
				Iterator<Student> itr= set.iterator();
				while(itr.hasNext())
					System.out.println(itr.next());
			}
			
				
		

	
}