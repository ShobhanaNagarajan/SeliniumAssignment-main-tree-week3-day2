package week3day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

 

public class Aijio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
	
	    driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags" , Keys.ENTER );
	    driver.findElement(By.xpath("//label[@for='Men']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
	    Thread.sleep(2000);
	    String countItems = driver.findElement(By.className("length")).getText();
	    System.out.println("Total Items:" +countItems);
	    List<WebElement>totalBrands = driver.findElements(By.xpath("//div[@class='brand']"));
	    System.out.println("LIST OF BRANDS AVAILABLE:");
	    for (WebElement eachBrand :totalBrands) {
	    	System.out.println(eachBrand.getText());
	    }
	    List<WebElement>allnames = driver.findElements(By.xpath("//div[@class='name']"));
	    System.out.println("Names of  the bags:"); 
	     for(WebElement eachname : allnames) {
	    	System.out.println(eachname.getText());  
	     }
	      
	
	
	
	}

}
