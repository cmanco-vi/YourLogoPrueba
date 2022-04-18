package tasks;

import model.TablaDeDatosFeature;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.WishYourLogoPage;

public class WishList implements Task {

    public WishList(TablaDeDatosFeature tablaDeDatosFeature) {
        this.tablaDeDatosFeature = tablaDeDatosFeature;
    }

    private TablaDeDatosFeature tablaDeDatosFeature;


    public static WishList CreateNewWish(TablaDeDatosFeature tablaDeDatosFeature) {
        return Tasks.instrumented(WishList.class, tablaDeDatosFeature);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WishYourLogoPage.mywishlists_button),
                Enter.theValue(tablaDeDatosFeature.getName()).into(WishYourLogoPage.name_textbox),
                Click.on(WishYourLogoPage.save_button)
                );

    }
}
