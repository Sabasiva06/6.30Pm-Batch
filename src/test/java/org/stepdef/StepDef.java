package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	WebDriver driver;

	@Given("user is on Adactin page")
	public void user_is_on_Adactin_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");

	}

	@When("user should enter invalid username and valid password")
	public void user_should_enter_invalid_username_and_valid_password() {
		driver.findElement(By.id("username")).sendKeys("adfadzvbf");
		driver.findElement(By.id("password")).sendKeys("Karthi@1989");

	}

	@When("user should click login button")
	public void user_should_click_login_button() {
		driver.findElement(By.id("login")).click();
	}

	@Then("user should validate")
	public void user_should_validate() {
		System.out.println("Invalid username");
	}

	@When("user need to enter valid username and invalid password")
	public void user_need_to_enter_valid_username_and_invalid_password() {
		driver.findElement(By.id("username")).sendKeys("karthi007");
		driver.findElement(By.id("password")).sendKeys("asadfd");
	}

	@When("user need to enter blank username and blank password")
	public void user_need_to_enter_blank_username_and_blank_password() {
		driver.findElement(By.id("username")).sendKeys(" ");
		driver.findElement(By.id("password")).sendKeys(" ");
	}

	@When("user need to enter blank username and valid password")
	public void user_need_to_enter_blank_username_and_valid_password() {
		driver.findElement(By.id("username")).sendKeys(" ");
		driver.findElement(By.id("password")).sendKeys("Karthi@1989");
	}

}
