package cvbank.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRegistration extends TestBase
{
    int a = 0;
    int b = 1000;
    int count = a + (int)(Math.random()*b);


    @Test
    public void candidateRegistration() throws InterruptedException {

        String email = "brownzoi"+count+"@gmail.com";

        app.getCandidateHelper().initCandidateRegistration();
        app.getCandidateHelper().registerCandidate("Zoi","Brown",email
                ,"+972 52 1112222", "brownzoi"+ count,"brownzoi"+count);

        Thread.sleep(2000);
        app.getCandidateHelper().submitCandidateForm();
        Thread.sleep(2000);
        app.getCandidateHelper().clickSuccessMessage();
        Thread.sleep(2000);

        Assert.assertTrue(app.getSessionHelper()
                .isElementPresent(By.xpath("//ul[@class='menu-btns']//button[@type='button'][contains(text(),email)]")));
        Thread.sleep(2000);
        app.getSessionHelper().logout();
    }

    @Test
    public void candidateRegister_LoginForm() throws InterruptedException {

        String email = "snowluke"+count+"@mail.com";

        app.getSessionHelper().clickLoginButton();
        app.getCandidateHelper().registerCandidateFromLoginForm("Luke","Snow",email
        ,"+972 55 1231234","snowluke","snowluke");
        Thread.sleep(2000);
        app.getCandidateHelper().submitCandidateForm();
        Thread.sleep(2000);
        app.getCandidateHelper().clickSuccessMessage();
        Thread.sleep(2000);

        Assert.assertTrue(app.getSessionHelper()
                .isElementPresent(By.xpath("//ul[@class='menu-btns']//button[@type='button'][contains(text(),email)]")));
        Thread.sleep(2000);
        app.getSessionHelper().logout();
    }
}
