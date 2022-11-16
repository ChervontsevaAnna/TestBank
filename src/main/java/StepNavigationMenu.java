import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class StepNavigationMenu {

    private SelenideElement bankOverview = $(By.xpath("//a[@id='bank-overview']"));
    private SelenideElement accIndex = $(By.xpath("//a[@id='accounts-index']"));
    private SelenideElement payments = $(By.xpath("//a[@id='payments-form']"));
    private SelenideElement cards = $(By.xpath("//a[@id='cards-overview-index']"));
    private SelenideElement deposits = $(By.xpath("//a[@id='deposits-index']"));
    private SelenideElement kredits = $(By.xpath("//a[@id='loans-index']"));
    private SelenideElement valutes = $(By.xpath("//a[@id='externaltraderoom-index']"));
    private SelenideElement insurances = $(By.xpath("//a[@id='insurance-travel']"));


    public void checkNavMenu(){

        Assertions.assertEquals(bankOverview.getText(), "ОБЗОР");
        Assertions.assertEquals(accIndex.getText(), "СЧЕТА");
        Assertions.assertEquals(payments.getText(), "ПЛАТЕЖИ И ПЕРЕВОДЫ");
        Assertions.assertEquals(cards.getText(), "КАРТЫ");
        Assertions.assertEquals(deposits.getText(), "ВКЛАДЫ");
        Assertions.assertEquals(kredits.getText(), "КРЕДИТЫ");
        Assertions.assertEquals(valutes.getText(), "ВАЛЮТА");
        Assertions.assertEquals(insurances.getText(), "СТРАХОВАНИЕ");

    }
}
