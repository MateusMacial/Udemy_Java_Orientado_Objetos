package entities;

public class Company extends People{

	private Integer employeeQuantity;
	
	public Company() {
		
	}	
	public Company(String name, Double anualIncome, Integer employeeQuantity) {
		super(name, anualIncome);
		this.employeeQuantity = employeeQuantity;
	}

	public Integer getEmployeeQuantity() {
		return employeeQuantity;
	}
	public void setEmployeeQuantity(Integer employeeQuantity) {
		this.employeeQuantity = employeeQuantity;
	}
	
	@Override
	public Double taxPay() {
		if(getEmployeeQuantity() < 10) {
			return getAnualIncome() * 0.16;
		}
		else {
			return getAnualIncome() * 0.14;
		}
	}

}
