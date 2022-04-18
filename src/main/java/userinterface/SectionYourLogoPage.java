package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SectionYourLogoPage extends PageObject {

    public static final Target women_button = Target.the("Boton women")
            .located(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
    public static final Target clic_list = Target.the("Clic en el boton List")
            .located(By.xpath("//*[@id='list']/a/i"));
    public static final Target addlist_button = Target.the("Clic en el boton Add to Wishlist")
            .located(By.xpath("//*[@id='center_column']/ul/li[1]/div/div/div[3]/div/div[3]/div[1]/a"));
    public static final Target account_button = Target.the("Boton cuenta del cliente")
            .located(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a/span"));
    public static final Target mywishlists_button = Target.the("Boton My Wishlists")
            .located(By.xpath("//*[@id='center_column']/div/div[2]/ul/li/a/span"));
    public static final Target mywishlists_link = Target.the("Link My Wishlists")
            .located(By.xpath("//*[@id='block-history']//*[contains(text(),'My wishlist')]"));

    public static final Target permalink = Target.the("Permalink")
            .located(By.xpath("//*[@id='block-history']//td[2]"));

}
