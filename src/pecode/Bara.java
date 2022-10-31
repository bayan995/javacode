package pecode;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Bara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Toshiba\\Desktop\\my new driver\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
          driver.get("http://127.0.0.1:5500/id.html");
          
          String MyTitle = driver.getTitle();
          System.out.println(MyTitle);
		List<WebElement> myListOfOptions = driver.findElements(By.tagName("option"));
		//String MyOptionTag = driver.findElement(By.tagName("option")).getText();
		//System.out.println(MyOptionTag);
         
	for (int i =0 ; i< myListOfOptions.size() ;i++ ) {
		
		
		System.out.println(myListOfOptions.get(i).getText());
		
		
	}
          
	}

}
