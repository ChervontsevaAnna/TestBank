import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class FirstTest extends Config {


    @Test
    public void test() {

        StepAutoriz sa = new StepAutoriz();
        sa.stepAutoriz("demo", "demo");

        StepConfirm stepConfirm = new StepConfirm();
        stepConfirm.confirm("0000");

        StepNavigationMenu stepNavigationMenu = new StepNavigationMenu();
        stepNavigationMenu.checkNavMenu();

    }

}
