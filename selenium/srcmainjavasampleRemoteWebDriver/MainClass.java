package sampleRemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MainClass {

		public static void main(String[] args) throws MalformedURLException, InterruptedException {
					
					//ImmutableCapabilities capabilities = new ImmutableCapabilities("browserName", "chrome");
					//		ChromeOptions chromeOptions = new ChromeOptions();
					//				WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.3"),chromeOptions);
					//						
					//								//System.setProperty("webdriver.edge.driver", "C:\\Users\\sahil.gulati\\eclipse-workspace\\msedgedriver.exe");
					//										//WebDriver driver = new EdgeDriver();
					//												driver.get("https://www.google.com");
					//														
					//																WebElement searchBar = driver.findElement(By.name("q"));
					//																		searchBar.click();
					//																				searchBar.sendKeys("Docker");
					//																						
					//																								WebElement googleSearch = driver.findElement(By.name("btnK"));
					//																										googleSearch.click();
					//																												
					//																														driver.findElement(By.xpath("(//h3)[1]/../../a")).click();
					//																																
					//																																		Thread.sleep(5000);
					//																																				
					//																																						System.out.println(driver.getCurrentUrl());
					//																																								
					//																																										driver.quit();
					//																																												
					//																																														
					//																																															
					//
					//																																																}
					//
					//																																																}
					//
