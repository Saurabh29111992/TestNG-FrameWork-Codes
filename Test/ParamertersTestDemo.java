package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParamertersTestDemo 
{
	
	@Test
	@Parameters({"i","j"})
	public void add(int a, int b)
	{
 		
        System.out.println("Addition is :" +(a+b));		
	}
	
	@Test
	@Parameters({"i","j"})
	public void sub(int a, int b)
	{
 		
        System.out.println("Substraction is :" +(a-b));		
	}
	
	
	@Test
	@Parameters({"i","j"})
	public void mul(int a, int b)
	{
 		
        System.out.println("Multiplication is :" +(a*b));		
	}
	
	
	@Test
	@Parameters({"i","j"})
	public void div(int a, int b)
	{
 		
        System.out.println("Division is :" +(a/b));		
	}

}
