package exercise1;

import exercise2.Payable;

public abstract class Employee implements Payable {

	protected String name;
	private int sales=0;
	private int workHours=0;


	public abstract int computeSalary();

	public void sell() { sales++;}

	public void workOneHour() { workHours++;}

	public String getName() {
		return this.name;
	}

	 protected int getSales(){
		return sales;
	 }

	 protected int getWorkHours(){
		return workHours;
	 }

}
