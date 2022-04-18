package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WishYourLogoPage extends PageObject {

    public static final Target mywishlists_button = Target.the("Boton My Wishlists")
            .located(By.xpath("//*[@id='center_column']/div/div[2]/ul/li/a/span"));
    public static final Target name_textbox = Target.the("Caja de texto nombre")
            .located(By.xpath("//*[@id='name']"));
    public static final Target save_button = Target.the("Boton Save")
            .located(By.xpath("//*[@id='submitWishlist']"));
    public static final Target newlist_label = Target.the("Label nuevo nombre de lista")
            .located(By.xpath("//*[@id='block-history']//td[2]"));
}