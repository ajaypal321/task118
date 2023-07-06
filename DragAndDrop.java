package com.task.eighteen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		//set the path a the chromediver
		System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver.exe");	
// instance of chromedriver 
		WebDriver driver = new ChromeDriver();
		// time manage
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		// navigate to facebook
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(3000);
		// find element
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		// drag and drop operation
//		WebElement drop1= driver.findElement(By.id("droppable"));
//		String bgcolor1=drop1.getCssValue("background");
//		System.out.println(bgcolor1);
		Actions action= new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		//the drag and drop operation is successful by checking the color property of the target element’s CSS.
		WebElement drop2= driver.findElement(By.id("droppable"));
		String bgcolor2=drop2.getCssValue("background");
		System.out.println(bgcolor2);
		if(bgcolor2.contains("rgb(255, 250, 144)")) {
			System.out.println("Color property changed: yellow");
		}else {
			System.out.println("Color property is not change");
		}
		//  text of the target element
		WebElement drop3= driver.findElement(By.id("droppable"));
        String text = drop3.getText();
        System.out.println(text);
      
        if(text.equals("Dropped!")) {
        	System.out.println("text of the target element has changed to “Dropped!” ");
        }else {
        	System.out.println("text of the target element has not changed to “Dropped!” ");
        }
driver.close();
	}

}
//Result

/*Jul 06, 2023 4:23:57 PM org.openqa.selenium.remote.service.DriverService$Builder getLogOutput
INFO: Driver logs no longer sent to console by default; https://www.selenium.dev/documentation/webdriver/drivers/service/#setting-log-output
SLF4J: No SLF4J providers were found.
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.
rgb(255, 250, 144) none repeat scroll 50% 0% / auto padding-box border-box
Color property changed: yellow
Dropped!
text of the target element has changed to “Dropped!”

 */
