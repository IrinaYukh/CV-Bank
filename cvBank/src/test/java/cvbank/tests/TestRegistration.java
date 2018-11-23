package cvbank.tests;

import cvbank.manager.CandidateHelper;
import cvbank.manager.CompanyHelper;
import cvbank.manager.SessionHelper;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRegistration extends TestBase
{
    int a = 0;
    int b = 1000;
    int count = a + (int)(Math.random()*b);

    @BeforeMethod
    public void precondition()
    {
        if(! app.getSessionHelper().isLoggedOut())
        {
            app.getSessionHelper().logout();
        }
    }

    @Test
    public void candidateRegistration()
    {
        CandidateHelper candidate = app.getCandidateHelper();

        String email = "brownzoi"+count+"@gmail.com";

        candidate.initCandidateRegistration();
        candidate.registerCandidate("Zoi","Brown",email,"+972 52 1112222"
                                    ,"brownzoi"+ count,"brownzoi"+count);
        candidate.submitCandidateForm();
        candidate.clickSuccessMessage();

        Assert.assertTrue(app.getSessionHelper()
                .isElementPresent(By.xpath("//ul[@class='menu-btns']//button[@type='button'][contains(text(),email)]")));

    }

    @Test
    public void candidateRegister_LoginForm()
    {
        CandidateHelper candidate = app.getCandidateHelper();
        SessionHelper helper = app.getSessionHelper();

        String email = "snowluke"+count+"@mail.com";

        helper.clickLoginButton();
        candidate.registerCandidateFromLoginForm("Luke","Snow",email,"+972 55 1231234"
                                                ,"snowluke"+count,"snowluke"+count);
        candidate.submitCandidateForm();
        candidate.clickSuccessMessage();

        Assert.assertTrue(app.getSessionHelper()
                .isElementPresent(By.xpath("//ul[@class='menu-btns']//button[@type='button'][contains(text(),email)]")));
    }

    @Test
    public void HR_Registration()
    {
        String email = "alexandr"+count+"@google.com";

        CompanyHelper hr = app.getCompanyHelper();

        hr.initHRCreation();
        hr.registerHR("Career", "career.co.il", "Israel", "Netaniya"
            ,"Leskov", "6", "17532", "+972 55 1199999", "Alexander", "Frou"
            ,"manager", email, "alexander"+count,"alexander"+count);

        hr.submitHRForm();
        hr.clickSuccessMessage();

        Assert.assertTrue(app.getSessionHelper()
                .isElementPresent(By.xpath("//ul[@class='menu-btns']//button[@type='button'][contains(text(),email)]")));

    }

    @Test
    public void HR_Registration_LoginForm() throws InterruptedException
    {
        String email = "HRlida"+count+"@walla.com";

        CompanyHelper hr = app.getCompanyHelper();
        SessionHelper helper = app.getSessionHelper();

        helper.clickLoginButton();
        hr.registerHRFromLoginForm("Sun", "sun.com", "Israel", "Rishon Le Cion"
                ,"Washington", "12", "17111", "+972 52 3214444", "Lida", "Cohen"
                ,"HR", email, "lidaCohen"+count,"lidaCohen"+count);
        hr.submitHRForm();
        hr.clickSuccessMessage();

        Assert.assertTrue(app.getSessionHelper()
                .isElementPresent(By.xpath("//ul[@class='menu-btns']//button[@type='button'][contains(text(),email)]")));

    }

    @AfterMethod
    public void postcondition()
    {
        if(! app.getSessionHelper().isLoggedOut())
        {
            app.getSessionHelper().logout();
        }
    }
}
