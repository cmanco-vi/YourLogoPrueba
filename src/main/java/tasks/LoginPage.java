package tasks;

import model.TablaDeDatosFeature;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.LoginYourLogoPage;

public class LoginPage implements Task {
    public LoginPage(TablaDeDatosFeature tablaDeDatosFeature) {
        this.tablaDeDatosFeature = tablaDeDatosFeature;
    }

    private TablaDeDatosFeature tablaDeDatosFeature;

    public static LoginPage ThePage(TablaDeDatosFeature tablaDeDatosFeature) {
        return Tasks.instrumented(LoginPage.class, tablaDeDatosFeature);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginYourLogoPage.login_buttom),
                Enter.theValue(tablaDeDatosFeature.getEmail()).into(LoginYourLogoPage.email_box),
                Enter.theValue(tablaDeDatosFeature.getPassword()).into(LoginYourLogoPage.password_box),
                Click.on(LoginYourLogoPage.enter_buttom)
                );

    }
}

