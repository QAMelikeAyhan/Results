package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		

		Results student1 = new Results(25, 79, 62);
		System.out.println(student1.getTotal());
		student1.getResults();
				
		System.out.println(student1.percentagecal());
	}

}
