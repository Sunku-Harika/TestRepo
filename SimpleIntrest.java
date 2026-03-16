package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/simple-interest-calculator.html");
		driver.findElement(By.xpath("//a[text()='Principal']")).click();	
		
		WebElement endbalance=driver.findElement(By.id("balance"));
		endbalance.clear();
		endbalance.sendKeys("40,000");
		
		WebElement intrest_rate=driver.findElement(By.xpath("//input[@name='rate']"));
		intrest_rate.clear();
		intrest_rate.sendKeys("4");
		
		WebElement dropdown1 =driver.findElement(By.id("ratebase"));
		Select s=new Select(dropdown1);
		
		s.selectByVisibleText("per month");
		
		WebElement term=driver.findElement(By.name("term"));
		term.clear();
		term.sendKeys("5");
		
		WebElement dropdown2 =driver.findElement(By.id("termbase"));
		Select s1=new Select(dropdown2);
		s1.selectByVisibleText("months");
		
		driver.findElement(By.xpath("//input[@value='Calculate']")).click();
		
		String End_Balance=driver.findElement(By.xpath("(//td[@class='bigtext'])[2]")).getText();
		
		System.out.println("End Blance:"+" "+End_Balance);
String Total_Interest=driver.findElement(By.xpath("(//td[@class='bigtext'])[4]")).getText();
		
		System.out.println("Total Interest:"+" "+Total_Interest);
		
		driver.quit();
		
		
		
		
		
		
		

	}

}
