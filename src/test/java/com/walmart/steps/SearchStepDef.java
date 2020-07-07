package com.walmart.steps;

import com.walmart.hooks.Hooks;
import com.walmart.sites.WalmartSite;
import com.walmart.utils.Producto;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class SearchStepDef {

    public WalmartSite walmartSite;

    public SearchStepDef (Hooks hooksClass)
    {
        this.walmartSite = hooksClass.getWalmartSite();
    }

    @When("I enter a product name in the search bar")
    public void iEnterAProductNameInTheSearchBar()
    {
        walmartSite.getSearch().searchForProduct();
        walmartSite.getSearch().validateSearchProductPage();
    }


    @And("I select the product")
    public void iSelectTheProduct()
    {
        walmartSite.getSearch().clickOnProduct(1);

    }

}
