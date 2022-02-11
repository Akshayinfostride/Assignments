package parallelClassAssignment;

import org.testng.annotations.Test;

public class ParalellClass2 {
	@Test(priority = 0)
	public void enterInput() {
		System.out.println("use enter the input");
	}
	@Test(priority = 1)
	public void verifyPage()
	{
		System.out.println("use for verify method");
		
	}

}
