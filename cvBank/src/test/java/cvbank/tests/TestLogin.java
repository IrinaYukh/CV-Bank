package cvbank.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin extends TestBase
{

    @Test
    public void candidateLoginPositiveTest() throws InterruptedException {
        app.getSessionHelper().loginUser("brownDav2@gmail.com","browndav2");
        Thread.sleep(5000);
        Assert.assertTrue(app.getSessionHelper()
                .isElementPresent(By.xpath("//ul[@class='menu-btns']//button[@type='button'][contains(text(),'brownDav2@gmail.com')]")));

        app.getSessionHelper().logout();
    }

    @Test
    public void HRLoginPositiveTest() throws InterruptedException {
        app.getSessionHelper().loginUser("hr1@yandex.com","hrtest1235");
        Thread.sleep(2000);
        Assert.assertTrue(app.getSessionHelper()
                .isElementPresent(By.xpath("//ul[@class='menu-btns']//button[@type='button'][contains(text(),'hr1@yandex.com')]")));

        app.getSessionHelper().logout();
    }
//    @Test
//    public void loginNegativeTest() throws InterruptedException {
//        app.getSessionHelper().loginUser("iytest18@gmail.com", "friendly");
//        // Checking If warning message exist as enter correct password
//        if (app.getSessionHelper().isElementPresent(By.xpath("//div[@class='userpro-warning']"))) {
//            Thread.sleep(1000);
//            app.getSessionHelper().type(By.xpath
//                    ("//div[@class='userpro-input']//input[@data-condition_fields='username_or_email'][@type='password']"), "aa123456");
//            Thread.sleep(1000);
//            app.getSessionHelper().click(By.xpath
//                    ("/html[1]/body[1]/div[3]/header[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[7]/input[1]"));
//        }
//        Assert.assertTrue(app.getSessionHelper().isElementPresent(By.cssSelector("div.user-main-info")));
//    }





}
