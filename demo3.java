package basics3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.rediff.com/");
		//d.switchTo().frame("moneyiframe");
		d.switchTo().frame(d.findElement(By.xpath("//*[@id=\"moneyiframe\"]")));
		WebElement bse=d.findElement(By.id("bseindex"));
		System.out.println(bse.getText());
		Thread.sleep(2000);
		d.switchTo().parentFrame();
		Thread.sleep(2000);

		d.findElement(By.linkText("CRICKET")).click();
		

	}

}
