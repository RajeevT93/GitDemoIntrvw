package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {


    @Test (groups = {"Smoke"})
    public void ploan() {
        System.out.println("good");
    }

    @Test
    public void getStringData(){
        System.out.println("Web Automation");
    }

    @BeforeTest
    public void prerequisite (){
        System.out.println("I will execute firstt");
    }
}
