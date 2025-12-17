package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {


    @Parameters ("URL")
    @Test
    public void WebLoginhomeloan(String unname)
    {

        System.out.println("webloginhome");
        System.out.println(unname);
    }

    @Test (groups = {"Smoke"})
    public void MobileLoginhomeloan()
    {
        System.out.println("mobileloginhome");
    }


    @Test
    public void LoginApihomeloan ()
    {
        System.out.println("Apiloginhome");

    }

}
