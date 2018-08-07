package com.cg.test;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SearchResult {
	private static WebElement element;
	public static WebElement selectOnePlus(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div/div/div[2]/div[1]/div[1]/a/h2"));
		return element;
	}
	public static WebElement addToCart(WebDriver driver) {
		element=driver.findElement(By.id("add-to-cart-button"));
		return element;
	}
	public static WebElement selectIPhone(WebDriver driver)
	{
element=driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div/div/div[2]/div[1]/div[1]/a/h2"));
	return element;
	}
	public static WebElement selectHp(WebDriver driver)
	{
element=driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[2]/div/div[2]/div[1]/div[1]/a/h2"));
	return element;
	}
	public static WebElement selectS9(WebDriver driver)
	{
element=driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div/div/div[2]/div[1]/div[1]/a/h2"));
	return element;
	}
	public static WebElement selectps4(WebDriver driver)
	{
element=driver.findElement(By.xpath("//*[@id=\"result_1\"]/div/div/div/div[2]/div[1]/div[1]/a/h2"));
	return element;
	}
	}
