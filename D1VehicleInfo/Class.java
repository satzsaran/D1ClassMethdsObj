package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowhlr.TwoWheeler;

public class Class {
private void vehicleNecessary() {
	// TODO Auto-generated method stub
System.out.println("travel");
}
public static void main(String[] args) {
	Class obj=new Class();
	obj.vehicleNecessary();

	TwoWheeler obj1=new TwoWheeler();
	obj1.bike();
	obj1.cycle();
	 
	ThreeWheeler obj2=new ThreeWheeler();
	obj2.auto();
	
	FourWheeler obj4=new FourWheeler();
	obj4.bus();
	obj4.car();
	obj4.lorry();
	 
}
}
