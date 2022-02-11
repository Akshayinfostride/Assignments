package parallelClassAssignment;

import org.testng.annotations.Test;

public class ParallelClass1 {
	@Test
	public void addValue() {
		System.out.print("this is  first method of 2nd class ");
	}
	@Test
//	parallelClassPackage.xml
	public void verifyTitle() {
		System.out.println("this is the second method of second class for check parallel execution");
	
	}
}
