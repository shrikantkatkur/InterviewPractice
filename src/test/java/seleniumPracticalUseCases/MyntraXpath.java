package seleniumPracticalUseCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraXpath {

	public static void main(String[] args) throws InterruptedException {
				
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Actions actions=new Actions(driver);
		WebElement KIDS= driver.findElement(By.xpath("//nav/div/div[3]"));
		actions.moveToElement(KIDS);
		actions.perform();

	}

}
