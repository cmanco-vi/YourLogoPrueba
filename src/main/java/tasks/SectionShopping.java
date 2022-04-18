package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.SectionYourLogoPage;

public class SectionShopping implements Task {
    public static SectionShopping AddItemsWish() {
        return Tasks.instrumented(SectionShopping.class);
    }

    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SectionYourLogoPage.women_button),
                Click.on(SectionYourLogoPage.clic_list),
                Click.on(SectionYourLogoPage.addlist_button),
                Click.on(SectionYourLogoPage.account_button),
                Click.on(SectionYourLogoPage.mywishlists_button),
                Click.on(SectionYourLogoPage.mywishlists_link)
        );
    }
}
