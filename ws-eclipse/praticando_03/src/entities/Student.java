package entities;

public class Student {
	
	public String name;
	public double gradeFirstTrimester;
	public double gradeSecondTrimester;
	public double gradeThirdTrimester;
	
	
	public double finalGrade() {
		
		return gradeFirstTrimester + gradeSecondTrimester + gradeThirdTrimester;
	}
	
	public String result() {
		
		double total = finalGrade();
		double miss = 60.00 - total;
		
		if(total > 60.00) {
			return "PASS";
		}
		else {
			return "FAILED missing " + miss + " points";
		}
	}

}
