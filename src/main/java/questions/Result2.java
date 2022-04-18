package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.WishYourLogoPage;

public class Result2 implements Question<Boolean> {

    public static Result2 toThe(){

        return new Result2();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        Boolean result2;
        String question2 = Text.of(WishYourLogoPage.newlist_label).viewedBy(actor).asString();
        int cantidad2 = Integer.parseInt(question2);
        result2 = cantidad2 >= 0;
        System.out.println("Se creo nueva lista llamada: Nuevalista");
        return result2;
    }
}
