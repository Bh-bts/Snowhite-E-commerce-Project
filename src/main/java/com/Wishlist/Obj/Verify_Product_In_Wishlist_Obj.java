package com.Wishlist.Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Browser.Util.AllBrowsers;

public class Verify_Product_In_Wishlist_Obj extends AllBrowsers {

	public @FindBy(xpath = "//div[3]/div/div[@class='content-block mgs-button-block button-right']/button") WebElement seeAll_btnl;
	public @FindBy(xpath = "//a[text()=' Johnwin Dk Brown Formal Trouser ']/ancestor::div/child::li[15]/child::div/div/div/a/following-sibling::div/a") WebElement product1_wishlist_icon;
	public @FindBy(xpath = "//span[@class='wishlist-icon icon-heart theme-header-icon']") WebElement wishlist_btn;
	public @FindBy(xpath = "//a[@title='View All Wish List']") WebElement view_wishlist_btn;
	public @FindBy(xpath = "//a[text()='Johnwin Dk Brown Formal Trouser']") WebElement product_In_wishlist;
	public @FindBy(xpath = "//a[text()=' Johnwin Dk Brown Formal Trouser ']") WebElement product1_name;
	
	public @FindBy(xpath = "//button[@data-role='tocart']") WebElement Cart_btn_in_wishlist;
	public @FindBy(xpath = "//div[@data-option-label='32']") WebElement size_option32;
	public @FindBy(xpath = "//div[@data-option-label='34']") WebElement size_option34;
	public @FindBy(xpath = "//div[@data-option-label='36']") WebElement size_option36;
	public @FindBy(xpath = "//div[@data-option-label='38']") WebElement size_option38;
	public @FindBy(xpath = "//div[@data-option-label='40']") WebElement size_option40;
	public @FindBy(xpath = "//div[@data-option-label='42']") WebElement size_option42;
	public @FindBy(xpath = "//button[@title='Buy Now']") WebElement Buynow_btn;
	public @FindBy(xpath = "//li[@class='myli'][2]") WebElement stock_size;
	
	public @FindBy(xpath = "//div[@class='control input-field _with-tooltip']/input[@type='email']") WebElement Email_txtbox;
	public @FindBy(xpath = "//div[@name='shippingAddress.firstname']/div/input") WebElement FirstName_txtbox;
	public @FindBy(xpath = "//div[@name='shippingAddress.lastname']/div/input") WebElement LastName_txtbox;
	public @FindBy(xpath = "//div[@name='shippingAddress.street.0']/div/input") WebElement StreetAdd_txtbox;
	public @FindBy(xpath = "//div[@name='shippingAddress.country_id']/div/select") WebElement Country_dwn;
	public @FindBy(xpath = "//div[@name='shippingAddress.city']/div/input") WebElement City_txtbox;
	public @FindBy(xpath = "//div[@name='shippingAddress.region_id']/div/select") WebElement State_dwn;
	public @FindBy(xpath = "//div[@name='shippingAddress.company']/div/input") WebElement Company_txtbox;
	public @FindBy(xpath = "//div[@name='shippingAddress.telephone']/div/input") WebElement Phone_txtbox;
	public @FindBy(xpath = "//label[@for='cashondelivery']/span") WebElement Cash_on_deli;
	public @FindBy(xpath = "//div[@id='co-place-order-area']/div/div[2]/div/button") WebElement PlaceOrder_btn;
	
	
	
	

}
