package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.ApiPages;

public class ApiStepDef {

    ApiPages apiPages;

    public ApiStepDef(){
        this.apiPages = new ApiPages();
    }

    @Given("prepare url for {string}")
    public void prepareUrlFor(String url) {
        apiPages.prepareUrlFor(url);
    }

    @And("hit api province")
    public void hitApiProvince() {
        apiPages.hitApiProvince();
    }

    @And("validation status code is equals {int}")
    public void validationStatusCodeIsEquals(int status_code){
        apiPages.validationStatusCodeIsEquals(status_code);
    }

    @When("validation response body get list province")
    public void validationResponseBodyGetListProvince() {
        apiPages.validationResponseBodyGetListProvince();
    }

    @Then("validation response json with jsonSchema {string}")
    public void validationResponseJsonWithJsonSchema(String filename) {
        apiPages.validationResponseJsonWithJsonSchema(filename);
    }

    @And("hit api city")
    public void hitApiCity() {
        apiPages.hitApiCity();
    }

    @When("validation response body get list city")
    public void validationResponseBodyGetListCity() {
        apiPages.validationResponseBodyGetListCity();
    }

    @And("hit api cost")
    public void hitApiCost() {
        apiPages.hitApiCost();
    }

    @When("validation response body post cost normal")
    public void validationResponseBodyPostCost() {
        apiPages.validationResponseBodyPostCost();
    }
}
