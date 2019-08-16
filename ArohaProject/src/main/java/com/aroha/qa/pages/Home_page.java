package com.aroha.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pages.testbase.TestBase;
import com.qa.utility.Test_util;

public class Home_page extends TestBase{

		@FindBy(xpath="/html/body/div[4]/div[1]/div/div/div/a[1]")
		WebElement Login;
		@FindBy(xpath="/html/body/div[4]/div[1]/div/div/div/a[2]")
		WebElement Signup;
		

		}



