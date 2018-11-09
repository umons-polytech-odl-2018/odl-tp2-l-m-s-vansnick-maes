package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee {


	private int baseSalary;
	private int commission;

	public BaseSalaryPlusCommissionEmployee (String name,int fixedSalary,int commission){
		this.name=name;
		this.baseSalary=fixedSalary;
		this.commission=commission;
	}

	@Override
	public int computeSalary(){
		return baseSalary+ getSales()*commission;
	}

}
