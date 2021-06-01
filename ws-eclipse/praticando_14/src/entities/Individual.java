package entities;

public class Individual extends People{

	private Double healthExpenditures;
	
	public Individual() {
		
	}	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}
	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public Double taxPay() {
		
		if(getAnualIncome() < 20000) {
			return getAnualIncome() * 0.15;
		}
		else {
			if(getHealthExpenditures() > 0) {
				return (getAnualIncome() * 0.25) - (getHealthExpenditures() * 0.5);
			}
			else {
				return getAnualIncome() * 0.25;
			}
		}
	}

}
