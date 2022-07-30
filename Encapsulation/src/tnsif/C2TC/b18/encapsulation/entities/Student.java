package tnsif.C2TC.b18.encapsulation.entities;

public class Student {
int UID;
String Name;

public int getUID() {
	return UID;
}

public void setUID(int uID) {
	UID = uID;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public Student(int uID, String name) {
	super();
	UID = uID;
	Name = name;
}


 @Override
public String toString() {
	return "Student [UID=" + UID + ", Name=" + Name + ", getUID()=" + getUID() + ", getName()=" + getName()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

public void display()
{
	System.out.println("class attended by " + UID + " : " + Name);
}
}
