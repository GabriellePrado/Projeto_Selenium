import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	@Test
	public void teste() {
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Gabrielle Prado/Desktop/resource/Selenium/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// driver.manage().window().setPosition(new Point(100, 100));
		driver.manage().window().setSize(new Dimension(800, 300));
		//driver.manage().window().maximize();
		driver.get("http://www.google.com");
		// System.out.println(driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		
		driver.quit();
	}
}
