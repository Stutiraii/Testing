import static org.junit.Assert.*;

import org.junit.Test;

import com.google.java.contract.PreconditionError;


public class NaturalTest {

	//Test for Natural Constructor
	@Test(expected = PreconditionError.class)
	public void testConstructorNegativeValue() {
	    new Natural(-5); // Should throw PreconditionError as d must be >= 0
	}

	@Test 
	public void testConstructor() {
		Natural a = new Natural(3);
	}
	
	//Test for increment
	@Test(expected = PreconditionError.class)
	public void testIncrementMaxWithValue() {
		Natural a = new Natural(Integer.MAX_VALUE);
		a.increment(); //throws Precondition error as data must be less than MAX INT value
	}
	
	@Test
	public void testIncrement() {
		Natural a = new Natural(5);
		a.increment();
	}
	
	//Tests for decrement
	@Test(expected = PreconditionError.class)
	public void testdecrementMinValue() {
		Natural a = new Natural(0);
		a.decrement(); //throws Precondition error as data must be more than 0
	}
	
	@Test
	public void testdecrement() {
		Natural a = new Natural(5);
		a.decrement();
	}
	
	//Tests for add
	@Test(expected = PreconditionError.class)
	public void testAddWithNullValue() {
		Natural a = new Natural(1);
		a.add(null);
	}
	@Test 
	public void testAdd() {
		Natural a= new Natural(2);
		Natural b= new Natural(3);
		a.add(b);
	}
	
	//Test for subtract
	@Test(expected = PreconditionError.class)
	public void testSubtractWithNullValue() {
		Natural a= new Natural(5);
		a.subtract(null);
	}
	@Test(expected = PreconditionError.class)
	public void testSubtractWithGreaterValue() {
		Natural a= new Natural(5);
		Natural b= new Natural(8);
		a.subtract(b);
	}
	@Test 
	public void testSubtract() {
		Natural a= new Natural(10);
		Natural b= new Natural(8);
		a.subtract(b);
	}
	
	//Test for Multiply
	@Test(expected = PreconditionError.class)
	public void testMultiplyNull() {
	    Natural a= new Natural(3);
	    a.multiply(null); // throws PreconditionError as n should not be null
	}
	
	@Test
	public void testMultiply() {
	    Natural a = new Natural(3);
	    Natural b = new Natural(4);
	    a.multiply(b);
	    
	}

	//Test for Divide
	@Test(expected = PreconditionError.class)
	public void testDivideNull() {
	    Natural a = new Natural(5);
	    a.divide(null); // throws PreconditionError as n should not be null
	}
	
	@Test
	public void testDivide() {
	    Natural a= new Natural(4);
	    Natural b = new Natural(2);
	    a.divide(b);
	}


	} 


