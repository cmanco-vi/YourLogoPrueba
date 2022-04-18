package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.TablaDeDatosFeature;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Result;
import tasks.LoginPage;
import tasks.OpenUp;
import tasks.SectionShopping;

import java.util.List;

public class EjemploStepDefinition {

    private TablaDeDatosFeature tablaDeDatosFeature;

    @Before
    public void setStage() {
        OnStage.setTheStage((new OnlineCast()));
    }

    @Given("^than Crihstian Manco wants to visit the yourlogo page$")
    public void thanCrihstianMancoWantsToVisitTheYourlogoPage()  {
        OnStage.theActorCalled("Crihstian").wasAbleTo(OpenUp.Page());

    }

    @And("^he login to the page$")
    public void heLoginToThePage(List<TablaDeDatosFeature> tablaDeDatosFeatures) {
        OnStage.theActorCalled("Crihstian").wasAbleTo(LoginPage.ThePage(tablaDeDatosFeatures.get(0)));
    }

       @When("^he go to a shopping section in the page to find and add items to the wish list by clicking the Add to Wishlist button$")
    public void heGoToAShoppingSectionInThePageToFindAndAddItemsToTheWishListByClickingTheAddToWishlistButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(SectionShopping.AddItemsWish());
    }

    @Then("^he validate the wish list section$")
    public void heValidateTheWishListSection() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Result.toThe()));
    }



}

