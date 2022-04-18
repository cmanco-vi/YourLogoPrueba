package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SectionYourLogoPage;

public class Result implements Question<Boolean> {

  /*  private List<TablaDeDatosFeature> tablaDeDatosFeatureList;

    public Result(List<TablaDeDatosFeature> tablaDeDatosFeatureList) {
        this.tablaDeDatosFeatureList = tablaDeDatosFeatureList;
    }*/


    public static Result toThe() {
        return new Result();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        Boolean result;
        String question = Text.of(SectionYourLogoPage.permalink).viewedBy(actor).asString();
        int cantidad = Integer.parseInt(question);
        result = cantidad >= 1;
        //result = question.equals(tablaDeDatosFeatureList.get(0).getQty());
        System.out.println("Se tiene agregado: "+cantidad+" Cantidades");
        return result;
    }
}

