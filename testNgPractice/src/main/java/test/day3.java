package test;

import org.testng.annotations.*;

public class day3 {


    @Parameters ({"URL","APIKey/usrname"})
    @Test
    public void WebLoginCarLoan (String uname, String key) {
        System.out.println("weblogincar");
        System.out.println(uname);

        System.out.println(key);
    }





    @Test (groups = {"Smoke"})
    public void MobileLogincarloan() {
        System.out.println("Mobilelogincar");
    }
    @Test (enabled = false)


    public void MobileSigncarloan() {
        System.out.println("Mobile SIGN IN");
    }
    @BeforeClass
    public void bfclass () {
        System.out.println("before executing any method in the class");
    }
    @Test (dataProvider = "getData")
    public void Mobilesignoutcarloan (String Username, String Password){
        System.out.println("Mobile SIGN OUT");
        System.out.println(Username);


        System.out.println(Password);
    }
    @BeforeSuite
    public void bfsuite () {
        System.out.println("I am no 1");
    }


    @BeforeMethod
    public void beforeevery () {
        System.out.println("I will execute before ever method in day 3 class");
    }
    @AfterMethod
    public void afterevery () {
        System.out.println("I will execute after every method in day 3 class");
    }
    @AfterClass



    public void afclass () {
        System.out.println("After executing all the methods");
    }
    @Test (dependsOnMethods = {"WebLoginCarLoan","Mobilesignoutcarloan"})
    public void APIcarloan () {
        System.out.println("APIlogincar");
    }
    @DataProvider
    public Object[][] getData () {
        Object [] [] data = new Object[3][2];

        //1st set
        data [0] [0] = "firstsetusername";
        data [0] [1] = "firstpassword";

        //2nd set
        data [1] [0] = "secondsetusername";
        data [1] [1] = "secondpassword";

        //3rd set
        data [2] [0] = "Thirdusername";
        data [2] [1] = "Thirdpassword";
        return data;
    }
}
