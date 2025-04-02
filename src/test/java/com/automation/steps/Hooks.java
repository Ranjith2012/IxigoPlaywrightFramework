package com.automation.steps;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManger;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        ConfigReader.initConfigReader();
        DriverManger.createDriver();
    }

    @After
    public void cleanUp() throws InterruptedException {
        Thread.sleep(10000);
        //DriverManger.getContext().close();
    }
}
