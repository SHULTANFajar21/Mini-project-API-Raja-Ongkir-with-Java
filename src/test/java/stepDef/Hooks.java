package stepDef;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {

    @BeforeAll
    public static void setUp(){
        System.out.println("before test");
    }



    @AfterAll
    public static void tearDown(){
        System.out.println("after test");
    }
}
