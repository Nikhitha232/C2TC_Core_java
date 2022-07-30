package tnsif.c2tc.b18.Interface.entities;

public  class Student implements C2TC,College {



@Override
public void onlinesession()
{
	System.out.println("Session happens in Zoom");
}
@Override
public void offlinesession()
{
	System.out.println("session happens in college");
}
@Override
public void conducting() {
	
	
}
}
