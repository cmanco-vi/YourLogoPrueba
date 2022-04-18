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
import questions.Result2;
import tasks.LoginPage;
import tasks.OpenUp;
import tasks.WishList;

import java.util.List;

public class EjemploStepDefinition2 {

private TablaDeDatosFeature tablaDeDatosFeature;

    @Before
    public void setStage() {
        OnStage.setTheStage((new OnlineCast()));
    }


    @Given("^than Crihstian wants to visit the yourlogo page$")
        public void thanCrihstianWantsToVisitTheYourlogoPage() {
            OnStage.theActorCalled("Crihstian").wasAbleTo(OpenUp.Page());
        }


        @And("^he login to the yourlogo page$")
        public void heLoginToTheYourlogoPage(List<TablaDeDatosFeature> tablaDeDatosFeatures) {
            OnStage.theActorCalled("Crihstian").wasAbleTo(LoginPage.ThePage(tablaDeDatosFeatures.get(0)));
        }



    @When("^Being in the MY WISH LISTS section enter a new name for the wish list$")
    public void beingInTheMYWISHLISTSSectionEnterANewNameForTheWishList(List<TablaDeDatosFeature> tablaDeDatosFeatures) {
        OnStage.theActorInTheSpotlight().attemptsTo(WishList.CreateNewWish(tablaDeDatosFeatures.get(0)));
    }

    @Then("^he validates that the new wishlist has been created$")
    public void heValidatesThatTheNewWishlistHasBeenCreated() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Result2.toThe()));
    }



}
