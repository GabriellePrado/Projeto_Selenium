import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteCampo {

	@Test
	public void testeTextField() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Gabrielle Prado\\Desktop\\resource\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(700, 300));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:nome")).sendKeys("teste");
		Assert.assertEquals("teste", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
		driver.quit();
	}
	
	@Test
	public void testeTextArea() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Gabrielle Prado\\Desktop\\resource\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(700, 300));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("testenultima linha");
		Assert.assertEquals("testenultima linha", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
		driver.quit();
	}
	
	@Test
	public void testeRadioButton() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Gabrielle Prado\\Desktop\\resource\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(700, 300));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:sexo:1")).click();
		Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:1")).isSelected());
		driver.quit();
	}
	
	@Test
	public void testeCheckBox() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Gabrielle Prado\\Desktop\\resource\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(700, 300));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
		Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
		//driver.quit();
		
	}
}
