package tnsif.c2tc.entities;

public class Student {
private int uid;
private String name;

public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [uid=" + uid + ", name=" + name + ", getUid()=" + getUid() + ", getName()=" + getName()
			+ "]";
	
}
}


