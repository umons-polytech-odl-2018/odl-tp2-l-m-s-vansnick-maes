package exercise1;

import javax.jws.Oneway;

public class FixedSalaryEmployee extends Employee {

	private int fixedSalary;


	protected FixedSalaryEmployee(String name, int fixedSalary){
		this.name=name;
		this.fixedSalary=fixedSalary;
	}
	@Override
	public int computeSalary(){
		return fixedSalary;
	}
}
