package tnsif.C2TC.b18.encapsulation.entities;

public class C2TC {
String TechTrainer;
String SSTrainer;

public String getTechTrainer() {
	return TechTrainer;
}

public void setTechTrainer(String techTrainer) {
	TechTrainer = techTrainer;
}

public String getSSTrainer() {
	return SSTrainer;
}

public void setSSTrainer(String sSTrainer) {
	SSTrainer = sSTrainer;
}

public C2TC(String techTrainer, String sSTrainer) {
	
	TechTrainer = techTrainer;
	SSTrainer = sSTrainer;
}


@Override
public String toString() {
	return "C2TC [TechTrainer=" + TechTrainer + ", SSTrainer=" + SSTrainer + ", getTechTrainer()=" + getTechTrainer()
			+ ", getSSTrainer()=" + getSSTrainer() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

public void display()
{
	System.out.println("class conducted by " + TechTrainer + " and " + SSTrainer);
}
}
