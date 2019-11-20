

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Check 
{
  @Test	
  public void f()
  {
	  System.out.println("in test method");
  }
  
  @BeforeMethod
  public void beforemethod()
  {
	  System.out.println("in before method");
  }
  
 @AfterMethod
 public void aftermethod()
 {
	 System.out.println("in after method");
 }

 
 @BeforeClass
 public void beforeclass()
 {
	  System.out.println("in before class");
 }
 
@AfterClass
public void afterclass()

{
	 System.out.println("in after class");
}

@BeforeTest
public void beforetest()
{
	  System.out.println("in before test");
}

@AfterTest
public void aftertest()

{
	 System.out.println("in after test");
}

@BeforeSuite
public void beforesuite()
{
	  System.out.println("in before suite");
}

@AfterSuite
public void aftersuite()

{
	 System.out.println("in after suite");
}


}
