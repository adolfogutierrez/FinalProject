package com.walmart.sites;

import com.walmart.pages.CartPage;
import com.walmart.pages.LandingPage;
import com.walmart.pages.ProductPage;
import com.walmart.pages.SearchPage;
import com.walmart.utils.Producto;
import org.openqa.selenium.WebDriver;

public class WalmartSite {
    private final WebDriver driver;
    private LandingPage home;
    private SearchPage search;
    private ProductPage product;
    private CartPage cart;

    public LandingPage getHome()
    {
        if(home == null)
            home  = new LandingPage(driver);
        return home;
    }

    public SearchPage getSearch()
    {
        if(search == null)
            search  = new SearchPage(driver);
        return search;
    }

    public ProductPage getProduct()
    {
        if(product == null)
            product  = new ProductPage(driver);
        return product;
    }

    public CartPage getCart()
    {
        if(cart == null)
            cart  = new CartPage(driver);
        return cart;
    }

    public WalmartSite(WebDriver driver)
    {
        this.driver = driver;
    }

    Producto p;

    public void saveProduct(Producto p) {
        this.p = p;
    }

    public Producto retrieveProd(){
        return this.p;
    }
}
