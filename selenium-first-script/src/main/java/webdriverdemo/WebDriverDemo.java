package webdriverdemo;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;

public class WebDriverDemo {
	private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Usuario\\Documents\\Ingenieria_de_Sotfware_II\\Laboratorio_05\\geckodriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
    @Test
    public void testPositive() {
    	//Set up web driver (chrome, firefox,...)
    	//System.setProperty("webdriver.gecko.driver", "C:\\...\\Selenium\\Selenium WebDriver\\Java\\Libs\\geckodriver-v0.23.0-win32\\geckodriver.exe");

          //Launch website
          driver.navigate().to("http://www.calculator.net/");	
          
          //Maximize the browser
          driver.manage().window().maximize();
          
          // Click on Math Calculators
          driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
          
          // Click on Percent Calculators
          driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
          
          // Enter value 10 in the first number of the percent Calculator
          driver.findElement(By.id("cpar1")).sendKeys("10");
          
          // Enter value 50 in the second number of the percent Calculator
          driver.findElement(By.id("cpar2")).sendKeys("50");
          
          // Click Calculate Button
          driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

          
          // Get the Result Text based on its xpath
          String result =
             driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();

          
          
          // Assert actual value and expected value
          assertEquals(result, "5");
          
          //Close the Browser.
          //driver.close();
    }
	
    @Test
    public void testNegative() {
    	//Set up web driver (chrome, firefox,...)
    	//System.setProperty("webdriver.gecko.driver", "C:\\...\\Selenium\\Selenium WebDriver\\Java\\Libs\\geckodriver-v0.23.0-win32\\geckodriver.exe");
          
          //Launch website
          driver.navigate().to("http://www.calculator.net/");	
          
          //Maximize the browser
          driver.manage().window().maximize();
          
          // Click on Math Calculators
          driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
          
          // Click on Percent Calculators
          driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
          
          // Enter value 10 in the first number of the percent Calculator
          driver.findElement(By.id("cpar1")).sendKeys("10");
          
          // Enter value 50 in the second number of the percent Calculator
          driver.findElement(By.id("cpar2")).sendKeys("-50");
          
          // Click Calculate Button
          driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

          
          // Get the Result Text based on its xpath
          String result =
             driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();

          
          
          // Assert actual value and expected value
          assertEquals(result, "5");
          
          //Close the Browser.
          //driver.close();
    }
    
    @Test
    public void testA() {
    	//Set up web driver (chrome, firefox,...)
    	//System.setProperty("webdriver.gecko.driver", "C:\\...\\Selenium\\Selenium WebDriver\\Java\\Libs\\geckodriver-v0.23.0-win32\\geckodriver.exe");
    	   

          
          //Launch website
          driver.navigate().to("http://www.calculator.net/");	
          
          //Maximize the browser
          driver.manage().window().maximize();
          
          // Click on Math Calculators
          driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
          
          // Click on Percent Calculators
          driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
          
          // Enter value 10 in the first number of the percent Calculator
          driver.findElement(By.id("cpar1")).sendKeys("20");
          
          // Enter value 50 in the second number of the percent Calculator
          driver.findElement(By.id("cpar2")).sendKeys("200");
          
          // Click Calculate Button
          driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

          
          // Get the Result Text based on its xpath
          String result =
             driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();

          
          
          // Assert actual value and expected value
          assertEquals(result, "40");
          
          //Close the Browser.
          //driver.close();
    }
    
    @Test
    public void testB() {
    	//Set up web driver (chrome, firefox,...)
    	//System.setProperty("webdriver.gecko.driver", "C:\\...\\Selenium\\Selenium WebDriver\\Java\\Libs\\geckodriver-v0.23.0-win32\\geckodriver.exe");
    
          
          //Launch website
          driver.navigate().to("http://www.calculator.net/");	
          
          //Maximize the browser
          driver.manage().window().maximize();
          
          // Click on Math Calculators
          driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a")).click();
          
          // Click on Percent Calculators
          driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
          
          // Enter value 10 in the first number of the percent Calculator
          driver.findElement(By.id("cpar1")).sendKeys("50");
          
          // Enter value 50 in the second number of the percent Calculator
          driver.findElement(By.id("cpar2")).sendKeys("12");
          
          // Click Calculate Button
          driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

          
          // Get the Result Text based on its xpath
          String result =
             driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();

          
          
          // Assert actual value and expected value
          assertEquals(result, "6");
          
          //Close the Browser.
          //driver.close();
    }

}