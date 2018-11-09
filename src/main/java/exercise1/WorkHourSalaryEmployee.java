package exercise1;

public class WorkHourSalaryEmployee extends Employee{


	private int hourRate;

	public WorkHourSalaryEmployee(String name, int hourRate){
		this.name=name;
		this.hourRate=hourRate;
	}

	@Override
	public int computeSalary(){
		return hourRate*getWorkHours();
	}

}
