package Facbook;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validate_Facebook {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String actualCurrentUrl = "https://www.facebook.com/";
		String actualTitle = "Facebook - log in or sign up";
		String expectedCurrentUrl = driver.getCurrentUrl();
		String expectedTitle = driver.getTitle();
		
	if (actualCurrentUrl.equals(expectedCurrentUrl) && actualTitle.equals(expectedTitle)) {
		System.out.println("My url is Correct");
	}else {
		System.out.println("My url is Incorrect");
	}
	
	
WebElement createnewaccountButton = driver.findElement(By.linkText("Create new account"));
	if (createnewaccountButton.isEnabled()== true && createnewaccountButton.isDisplayed()==true) {
	createnewaccountButton.click();	
	}else {
		System.out.println("the link is not working");
	}
WebElement FirstnameTextBox = driver.findElement(By.name("firstname"));
if(FirstnameTextBox.isEnabled()== true && FirstnameTextBox.isDisplayed()==true) {
FirstnameTextBox.sendKeys("Happy");
}else {
System.out.println("Firstname textbox field is not enabled or displayed");
}
WebElement LastnameTextBox = driver.findElement(By.name("lastname"));
if(LastnameTextBox.isEnabled()== true && LastnameTextBox.isDisplayed()==true) {
LastnameTextBox.sendKeys("life");
}else {
System.out.println("Lastname textbox field is not enabled or displayed");
}

WebElement MobileTextBox = driver.findElement(By.name("reg_email__"));
if(MobileTextBox.isEnabled()== true && MobileTextBox.isDisplayed()==true) {
MobileTextBox.sendKeys("9978954149");
}else {
System.out.println("Mobile textbox field is not enabled or displayed");
}

WebElement PasswordTextBox = driver.findElement(By.id("password_step_input"));
if(PasswordTextBox.isEnabled()== true && PasswordTextBox.isDisplayed()==true)   {
PasswordTextBox.sendKeys("Z@123");
}else   {
System.out.println("Password textbox field is not enabled or displayed");

}
WebElement MonthofbirthTextBox = driver.findElement(By.xpath("//select[@id='month']/child::option[7]"));
if(MonthofbirthTextBox.isEnabled()==true && MonthofbirthTextBox.isDisplayed()==true) {
MonthofbirthTextBox.click();
}else{
System.out.println("Month of birthtextbox field is not enabled or displayed");

}

WebElement DayofbirthTextBox = driver.findElement(By.xpath("//select[@id='day']/child::option[26]"));
if(DayofbirthTextBox.isEnabled()== true && DayofbirthTextBox.isDisplayed()==true){
DayofbirthTextBox.click();
}else {
System.out.println("Day of birth textbox field is not enabled or displayed");	
	}

    WebElement YearofbirthTextBox = driver.findElement(By.xpath("//select[@id='year']/child::option[30]"));
if(YearofbirthTextBox.isEnabled()== true && YearofbirthTextBox.isDisplayed()==true)  {
YearofbirthTextBox.click();
} else  {
System.out.println("Year of birth textbox field is not enabled or displayed");	
	}


WebElement FemaleTextBox = driver.findElement(By.className("_8esa"));
if(FemaleTextBox.isEnabled()== true && FemaleTextBox.isDisplayed()==true) {
	FemaleTextBox.click();
}else{
System.out.println("Female textbox field is not enabled or displayed");	
}
	}	
}
