package com.Wishlist.testcases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Wishlist.Obj.Verify_Product_In_Wishlist_Obj;
import com.github.javafaker.Faker;

public class Wishlist_Page extends Verify_Product_In_Wishlist_Obj {

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public void Added_Product_In_Wishlist_Page() {

		try {

			js.executeScript("arguments[0].style.border='2px solid red'", seeAll_btnl);
			seeAll_btnl.click();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			js.executeScript("arguments[0].style.border='2px solid red'", product1_wishlist_icon);
			product1_wishlist_icon.click();
			String prodcut1_name = product1_name.getText();
			System.out.println("Product name will be added to a wishlist : " + prodcut1_name);

			wishlist_btn.click();
			Thread.sleep(2000);
			js.executeScript("arguments[0].style.border='2px solid red'", view_wishlist_btn);
			view_wishlist_btn.click();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

			js.executeScript("arguments[0].style.border='2px solid red'", product_In_wishlist);
			String wishlist_product1 = product_In_wishlist.getText();
			System.out.println("Product name which was added to a wishlist : " + wishlist_product1);

			if (prodcut1_name.equalsIgnoreCase(wishlist_product1)) {
				System.out.println("Product is successfully added in your wishlist");
			} else {
				System.out.println("Product is not matched!");
			}

		} catch (NoSuchElementException e1) {
			System.out.println(e1.getMessage());

		} catch (InterruptedException e2) {
			System.out.println(e2.getMessage());
		}

	}

	public void Wishlist_to_Cart_Page() throws InterruptedException {

		Thread.sleep(2000);
		Cart_btn_in_wishlist.click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		size_option34.click();
		var s = stock_size.getText();
		var r = s.charAt(48);
		System.out.println(r);
		String f = String.valueOf(r);

		System.out.println(f);
		Buynow_btn.click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		w.until(ExpectedConditions.visibilityOf(Email_txtbox));
		
		Faker faker = new Faker();
		
	}

}
