package stepDefinitions;

import base.DriverSetUp;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.TestUtils;

import java.util.HashMap;


public class Hooks extends DriverSetUp {

    private static boolean flag = true;
    HashMap<String, String> map = TestUtils.getPropFileValues();

    @Before
    public void setUP() throws Exception {
        if (flag) {
            DriverSetUp.initialize();
            driver.get(map.get("browser"));
            flag = false;
        }
    }

    @After
    public static void tearDown() {

        if (driver != null) {
            driver.quit();
        }

    }

}
