package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginYourLogoPage extends PageObject {
    public static final Target login_buttom = Target.the("Boton login")
            .located(By.xpath("//*[@id='header']//a[@class='login']"));
    public static final Target email_box = Target.the("Caja de texto correo")
            .located(By.id("email"));
    public static final Target password_box = Target.the("Caja de texto contrasena")
            .located(By.id("passwd"));
    public static final Target enter_buttom = Target.the("Boton entrar")
            .located(By.id("SubmitLogin"));
}
