package sampleRemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MainClass {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {


		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setCapability("browserVersion", "91.0");

		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.3:4444/wd/hub"), chromeOptions);
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver");
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		WebElement searchBar = driver.findElement(By.name("q"));
		searchBar.click();
		searchBar.sendKeys("Docker");

		WebElement googleSearch = driver.findElement(By.name("btnK"));
		googleSearch.click();

		driver.findElement(By.xpath("(//h3)[1]/../../a")).click();

		Thread.sleep(5000);
		
		System.out.println("Opening Docker Hub Page using Selenium code");
		System.out.println(driver.getCurrentUrl());
		System.out.println("Success !!! Thanks for Using Selenium webdriver");

		driver.quit();

	}

}
