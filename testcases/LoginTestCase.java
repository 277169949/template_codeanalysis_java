package com.libo.testcases;

import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;

import com.libo.tools.BrowserDriverTools;

public class LoginTestCase extends TestCase {
	private static WebDriver driver;
	private static String baseUrl = "http://isdp-acceptance-sit.huawei.com:8000/";;

	private StringBuffer verificationErrors = new StringBuffer();

	public static void login() {
		driver = BrowserDriverTools.getBrowserDriverInstance("chrome");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl + "Login/Index");
		driver.findElement(By.id("UserId")).clear();
		driver.findElement(By.id("UserId")).sendKeys("liboautotest1");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("0.12345a");
		driver.findElement(By.id("logIn")).click();

	}

	@Before
	public void setUp() throws Exception {
		driver = BrowserDriverTools.getChromeDriver();
		baseUrl = "http://isdp-acceptance-sit.huawei.com:8000/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testUntitled() throws Exception {

		driver.get(baseUrl + "Login/Index");
		driver.findElement(By.id("UserId")).clear();
		driver.findElement(By.id("UserId")).sendKeys("liboautotest1");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("0.12345a");
		driver.findElement(By.id("logIn")).click();

	}

	@After
	public void tearDown() throws Exception {
		// driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

}
