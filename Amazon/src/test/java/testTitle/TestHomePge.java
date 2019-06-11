package testTitle;

import basic.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class TestHomePge extends CommonAPI {
    @Test
    public void getTitle(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }
}
