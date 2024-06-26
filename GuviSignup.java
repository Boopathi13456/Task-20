package task20;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class GuviSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using Edge Browser Instead of Chrome 
				WebDriver driver = new EdgeDriver();

				//Maximizing the window 
				driver.manage().window().maximize();
				
				//Navigating the URL
				driver.navigate().to("https://www.guvi.in/");
				
				//Using ImplicitlyWait for page to wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
				//Clicking SignUp button
				driver.findElement(By.xpath("(//a[text()='Sign up'])[1]")).click();
				
				//Input for SignUp Page
				driver.findElement(By.className("form-control")).sendKeys("Boopathi T");
				driver.findElement(By.id("email")).sendKeys("boopathi13456@gmail.com");
				driver.findElement(By.cssSelector("input#password")).sendKeys("Boopathi@1996");
				driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9688806196");
				
				List<WebElement> signup = driver.findElements(By.tagName("a"));
		        for (WebElement signup1 : signup) 
		        {
					if (signup1.getAttribute("id").equals("signup-btn")) 
					{
						signup1.click();
					}
				}
	}

}
