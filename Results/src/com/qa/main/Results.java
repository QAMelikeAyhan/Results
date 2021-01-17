package com.qa.main;

public class Results {

	int physics; 
	int chemistry;
	int biology;
	double total;
	double percentage;
	
	
	public Results(int pyhsicsM, int chemistryM, int biologyM) {
		physics = pyhsicsM;
		chemistry = chemistryM;
		biology = biologyM;
		total = (double) pyhsicsM + chemistryM + biologyM;
	}
	
	public double getTotal() {
			return total;
	}
	
	public void getResults() {
		System.out.println("The mark that has been received in the physics exam is " + physics);
		System.out.println("The mark that has been received in the chemistry exam is " + chemistry);
		System.out.println("The mark that has been received in the biology exam is " + biology);

	}
	
	public float percentagecal() {
		float result = (float) (this.total/450);
		return result*100;
		
	}
}
