package org.phone;

public class InternalStorage {
private void processorName() {
	// TODO Auto-generated method stub
System.out.println("hexacore processor");
}
private void ramSize() {
	// TODO Auto-generated method stub
System.out.println("4gb");
}
public static void main(String[] args) {
	InternalStorage obj=new InternalStorage();
	obj.processorName();
	obj.ramSize();
	ExternalStorage obj1= new ExternalStorage ();
	obj1.size();
}
}
