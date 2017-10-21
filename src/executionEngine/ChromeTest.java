package executionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import config.Constants;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class ChromeTest 
{
	protected static WebDriver driver;

    @AfterClass
    public static void execute_Logout()throws Exception
    {
                    WebElement LogoutIcon=HomePage.LogoutIcon(driver);
                    LogoutIcon.click();
                    Thread.sleep(1000);
                    HomePage.Logoutlink(driver).click();
                    driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);


    }
    @BeforeClass
    @Parameters({"username","password"})
     public static void execute_Login(String username,String password) throws Exception
     {
    	 LoginPage.TxtBox_username(driver).sendKeys(username);
         LoginPage.TxtBox_password(driver).sendKeys(password);
         LoginPage.Btn_Login(driver).click(); 
         driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
         driver.manage().window().maximize();
     }

    @BeforeSuite
    @Parameters({"username","password"})
    public void  OpenBrowse (String username,String password) throws Exception
    {
                    System.setProperty(Constants.CHROME_DRIVER, Constants.CHROME_DRIVER_EXEPATH);
                    System.out.println(Constants.CHROME_DRIVER_EXEPATH);
                    driver= new ChromeDriver();
                    driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
                    driver.manage().window().maximize();
                    driver.get(Constants.baseUrl);
    }
                    
                    
    }


