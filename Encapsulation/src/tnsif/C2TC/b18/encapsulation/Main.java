package tnsif.C2TC.b18.encapsulation;
import tnsif.C2TC.b18.encapsulation.entities.*;
//import tnsif.C2TC.b18.encapsulation.entities.Student;
import java.util.Scanner;
public class Main {
public static void main (String[] args) {
Scanner sc= new Scanner (System.in);
Student s = new Student(786543,"nikitha");
C2TC c = new C2TC ("sanjana","damini");
c.display();
s.setName("Thanu");
s.display();
System.out.println(s);
}
}
