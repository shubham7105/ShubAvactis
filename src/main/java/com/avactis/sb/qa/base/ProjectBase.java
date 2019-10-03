package com.avactis.sb.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.avactis.sb.qa.util.TestUtil;

public class ProjectBase {
	
	
	public static WebDriver driver;
	public static Properties prop;
	public static 	WebDriverWait wait;

	public ProjectBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("src\\main\\java\\com\\avactis\\sb\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public static void initialization () {
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
		
			 System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver_ver_77.exe");
				driver = new ChromeDriver();
			}else if (browserName.equals("firefox")) {
			
				System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\geckodriver-64bit.exe");
				 driver = new FirefoxDriver(); //open Firefox driver
				
				
			}
		
		
		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver,30);
			driver.get(prop.getProperty("url"));
			
		}
			
	}
	

