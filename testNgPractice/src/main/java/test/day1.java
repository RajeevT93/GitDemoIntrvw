package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {


    @Test
    public void Demo () {
        System.out.println("hello");

        Assert.assertTrue(false);
    }

    @AfterTest
    public void lastexecution () {
        System.out.println("I will execute last");
    }

    @Test
    public void secondTest() {
        System.out.println("bye");
    }

    @Test
    public void gitDemo(){
        System.out.println("Git One");
        System.out.println("Git Two");
        System.out.println("Git Three");
        System.out.println("Git Four");
        System.out.println("Git Five");
    }


    @AfterSuite
    public void afsuite () {
        System.out.println("I am no 1 from the last");
    }
}
