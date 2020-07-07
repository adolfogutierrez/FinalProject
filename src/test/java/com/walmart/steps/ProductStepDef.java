package com.walmart.steps;

import com.walmart.hooks.Hooks;
import com.walmart.sites.WalmartSite;
import com.walmart.utils.Producto;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ProductStepDef {

    public WalmartSite walmartSite;

    public ProductStepDef(Hooks hooksClass)
    {
        this.walmartSite = hooksClass.getWalmartSite();
    }

    @And("I verify the product data")
    public void iVerifyTheProductData()
    {
        //Producto primerProd = walmartSite.getSearch().capturaDatos();
        //walmartSite.getProduct().validarProducto(primerProd);

    }

    @Then("I add the product into the cart")
    public void iAddTheProductIntoTheCart()
    {
        walmartSite.getCart().addToCart();
        walmartSite.getCart().validateProductInCart();
    }
}
