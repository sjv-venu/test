package testScripts;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.testng.Assert.assertTrue;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import junit.framework.Assert;



 
public class CalcTest 
{
    
	@ParameterizedTest
    @ValueSource(ints = {555,5,3})
    public static void validateResult(int total) throws Throwable {
		System.out.println("hi");		
	
	}
}