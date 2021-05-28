package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Calculator {
  
  WebDriver driver = new ChromeDriver();
			
			@BeforeTest()
			public void OpenURL()
			{
				driver.get("https://www.calculator.net/");
			}
			
			@AfterTest
			public void CloseBrowser()
			{
				driver.close();
			}
			
		
		@Test ()
			public void Multiplication()
			{
				
				String MultiplicationexpectedResult = "222075";

				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click(); 
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click(); 
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click(); 
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]")).click(); 

				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();  
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click(); 
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();  
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();  

				String MultiplicationactualResult = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();
				System.out.println(MultiplicationactualResult);
			if(MultiplicationactualResult.contains(MultiplicationexpectedResult)) {
				System.out.println("Multiplication test case Pass");
				}
				else {
				System.out.println("Multiplication test case Fail");
				}
		}	

		@Test()

		public void Division()
		{
			
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				String DivisionexpectedResult = "20";
				
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click(); 
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click(); 
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4]")).click(); 

				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();  
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click(); 
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();  
				
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();  

				String DivisionResult = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();
							System.out.println(DivisionResult);
				if(DivisionResult.contains(DivisionexpectedResult)) {
				System.out.println("Division test case Pass");
				}
				else {
				System.out.println("Division test case Fail");
				}
			
		}
				


			

			@Test
				public void Addition()
				{
					
					String AdditionexpectedResult = "111111";
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();  
					driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click(); 
					driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();  
					driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();  
					driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click(); 
					driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();  
					
					driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
					
					driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click(); 
					driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
					driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
					driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click(); 
					driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
					driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
					
					driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();  

					String AdditionactualResult = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();
					System.out.println(AdditionactualResult);
					if(AdditionactualResult.contains(AdditionexpectedResult)) {
					System.out.println("Addition test case Pass");
					}
					else {
					System.out.println("Addition test case Fail");
					}
					
					
				}
			@Test()
			
			public void Subtraction()
			{
				
			String SubtractionexpectedResult = "23329646";
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click(); 
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click(); 
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click(); 
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click(); 

			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click(); 
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();  
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();  
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[3]")).click(); 
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click(); 
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click(); 
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click(); 
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click(); 
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();  

			String SubtractionactualResult = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();
			System.out.println(SubtractionactualResult);
			if(SubtractionactualResult.contains(SubtractionexpectedResult)) {
			System.out.println("Subtraction test case Pass");
			}
			else {
			System.out.println("Subtraction test case Fail");
			}
			
		}
				
		}
		
