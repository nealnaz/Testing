import cucumber.api.java.After;
import cucumber.api.java.Before;
import globalhub.base;

public class Testframework {
    base b1 = new base();


    @Before
    public void begin() {
        b1. openBrowser();
    }

    @After
    public void close() {
        b1.closeBrowser();
    }
}

