package com.walmart.pages;

import com.walmart.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static junit.framework.Assert.*;


public class LandingPage extends BasePage
{
    public LandingPage(WebDriver wd)
    {
        super(wd);
        PageFactory.initElements(wd, this);
    }

    @FindBy(css="[data-automation-id='walmart-logo-image']")
    WebElement walmartLogo;
   @FindBy(id="scrollContainer")
    WebElement initialProducts;

    public void navigate()
    {
        driver.get(Properties.URL);
    }

   public void validateHomePage()
   {
       wait.until(ExpectedConditions.visibilityOf(walmartLogo));
       assertTrue(walmartLogo.isDisplayed());
       wait.until(ExpectedConditions.visibilityOf(initialProducts));
       assertTrue(initialProducts.isDisplayed());
       System.out.println("You are in walmart.com home page");
   }

}
