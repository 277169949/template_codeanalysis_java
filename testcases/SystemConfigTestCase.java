package com.libo.testcases;

import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.libo.tools.BrowserDriverTools;

public class SystemConfigTestCase extends TestCase {

	private WebDriver driver = BrowserDriverTools
			.getBrowserDriverInstance("chrome");
	private String baseUrl;

	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testUntitled() throws Exception {
		LoginTestCase.login();

		driver.findElement(
				By.cssSelector("div.panel:nth-child(6) > div:nth-child(1) > div:nth-child(1)"))
				.click();
		driver.findElement(By.linkText("System Config")).click();
		driver.findElement(
				By.cssSelector("li.clx:nth-child(8) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)"))
				.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("rightFrame");

		// driver.findElement(
		// By.cssSelector("a.easyui-linkbutton:nth-child(1) > span:nth-child(1) > span:nth-child(1)"))
		// .click();
		// driver.findElement(
		// By.cssSelector("#datagrid-row-r1-2-2 > td:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > input:nth-child(1)"))
		// .sendKeys("name_a");// name
		// driver.findElement(
		// By.cssSelector("#datagrid-row-r1-2-2 > td:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > input:nth-child(1)"))
		// .sendKeys("value_a");// value
		// driver.findElement(
		// By.cssSelector("#datagrid-row-r1-2-2 > td:nth-child(3) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > input:nth-child(1)"))
		// .sendKeys("type_a");// type
		// driver.findElement(By.cssSelector(".combo-text")).click();
		// driver.findElement(By.id("_easyui_combobox_i1_0")).click();// isvalid
		// driver.findElement(
		// By.cssSelector("#datagrid-row-r1-2-2 > td:nth-child(5) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > input:nth-child(1)"))
		// .sendKeys("remark_a");// remark
		// driver.findElement(By.cssSelector(".icon-save")).click();// save

		Actions actions = new Actions(driver);
		actions.doubleClick(
				driver.findElement(By
						.cssSelector("#datagrid-row-r5-2-0 > td:nth-child(1) > div:nth-child(1)")))
				.perform();

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
