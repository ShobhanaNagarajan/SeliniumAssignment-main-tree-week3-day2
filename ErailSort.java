package week3day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
		   
		    
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://erail.in/"); 
			
			WebElement fromStation =driver.findElement(By.id("txtStationFrom"));
			fromStation.clear();
			fromStation.sendKeys("ChennaiEgmore",Keys.ENTER);
			
			WebElement toStation = driver.findElement(By.id("txtStationTo"));
			toStation.clear();
			toStation.sendKeys("Madurai Jn",Keys.ENTER);
			
			driver.findElement(By.id("chkSelectDateOnly")).click();
			
			List<WebElement> trainNumbers = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[1]"));

			int size = trainNumbers.size();
			System.out.println(" number of trains:" + size);
		
			for (int i = 0; i < size ; i++) {
				String trainNum = trainNumbers.get(i).getText();
				System.out.println(" tarin number:" + trainNum);
		
			}
			
			List<WebElement>totalTrains = driver.findElements(By.xpath("//table[@class='Data Table TrainListHeadrer')//td[2]"));
			List<String>Trains=new ArrayList<String>();
			for(WebElement a:totalTrains) {
				Trains.add(a.getText());
			}
			
			
	        Collections.sort(Trains);
	        for(String s: Trains) {
	        	System.out.println("s");
	        }
		
		    
		    	
		    	
		    }
		    
	}


