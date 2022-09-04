package com.Wishlist.MainPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Browser.Util.AllBrowsers;
import com.Wishlist.testcases.Wishlist_Page;

public class Wishlist_MainPage extends Wishlist_Page {

	public Wishlist_MainPage() {

		AllBrowsers.driver = AllBrowsers.startBrowser("chrome", Weburl);

	}

	@Test
	public void Wishlist_Mainpage() throws InterruptedException {

		Wishlist_Page blank1 = PageFactory.initElements(driver, Wishlist_Page.class);
		blank1.Added_Product_In_Wishlist_Page();
		blank1.Wishlist_to_Cart_Page();

	}

}
