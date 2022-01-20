package Stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailLoginStep {
	String project_path = System.getProperty("user.dir");

	WebDriver driver;

	@Given("Open chrome Browser")
	public void open_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", project_path + "\\src\\test\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("Enter Gmail URL")
	public void enter_gmail_url() {
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();

	}

	@Given("Enter Username")
	public void enter_username() {
//		write ur email address
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("suchishah.siem@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span")).click();
	}

	@Given("Enter Password")
	public void enter_password() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		write your password
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("ur password");

	}

	@Given("SignIn button")
	public void sign_in_button() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/span")).click();
		Thread.sleep(10000);
	}


	@Then("Click on Compose Mail")
	public void click_on_compose_mail() throws InterruptedException {

		driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
		Thread.sleep(10000);
	}
	@Then("Add To Email")
	public void add_to_email() {
		
		driver.findElement(By.xpath("//*[@class='bzf']//textarea[1]")).sendKeys("suchishah.siem@gmail.com");

	}

	@Then("Add Subject Line")
	public void add_subject_line() {
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Incubyte");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(Keys.TAB);

	}


	@Then("Add Email Body")
	public void add_email_body() throws InterruptedException {
//		driver.findElement(By.xpath("//table[@id='undefined']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//table[@id='undefined']//tr//td//div[contains(@role,'textbox')]")).sendKeys("Automation QA Tester for Incubyte");
	}

	@Then("Click on Send Button")
	public void click_on_send_button() {
		driver.findElement(By.xpath("//tr//div[contains(text(),'Send')]")).click();
	}

}
