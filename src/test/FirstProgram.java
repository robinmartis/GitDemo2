package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"F:\\Selenium_Practise\\Selenium_Files\\Latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		
		System.out.println("Opening the browser 1");
		System.out.println("Opening the browser 2");
		System.out.println("Opening the browser 3");
		
		/// Git X is adding the below lines.
		System.out.println("Opening the browser 4");
		System.out.println("Opening the browser 5");
		System.out.println("Opening the browser 6");
		
		System.out.println("Opening the browser 7");
		
	}

	public void a1()
	{
		System.out.println("Print 1");
		System.out.println("Print 22");
		System.out.println("Print 3");
	}
	public void a2()
	{
		System.out.println("Print 1");
		System.out.println("Print 22");
		System.out.println("Print 3");
	}
	public void a3()
	{
		System.out.println("Print 1");
		System.out.println("Print 22");
		System.out.println("Print 3");
	}
	
	
}
