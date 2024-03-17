package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;



class Runapitest {
	
	public void RunAPITests1() {}
	{
		System.out.println( "sanjeevi");
		String fileLoc = System.getProperty("user.dir");
		@CucumberOptions(features = {fileLoc+"SampleCode\\src\\test\\resources\\feature"},
				glue = {fileLoc+"SampleCode\\src\\test\\java\\feature"},
				resources = {fileLoc+"SampleCode\\src\\test\\java\\feature\\src\\test\\resources"});
	}
	public void RunAPITests() 
	{
		System.out.println( "sanjeevi");
	}
}
