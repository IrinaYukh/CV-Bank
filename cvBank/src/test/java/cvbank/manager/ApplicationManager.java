package cvbank.manager;

import cvbank.tests.MyListener;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager
{
    CompanyHelper companyHelper;
    SessionHelper sessionHelper;
    CandidateHelper candidateHelper;
    SelectTest selectTest;
    ResumeHelper resumeHelper;

    private EventFiringWebDriver wd;
    private String browser;

    public ApplicationManager(String browser) {

        this.browser = browser;
    }


    public void start()
    {
        if (browser.equals(BrowserType.CHROME))
        {
            wd = new EventFiringWebDriver(new ChromeDriver());
        }
        else if(browser.equals(BrowserType.FIREFOX))
        {
            wd= new EventFiringWebDriver(new FirefoxDriver());
        }

        // call here MyListener
        wd.register(new MyListener());

        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.openSite("https://cv-app-test.herokuapp.com/");
 //     sessionHelper.login("admin", "secret");
        candidateHelper = new CandidateHelper(wd);
        companyHelper = new CompanyHelper(wd);
        selectTest = new SelectTest(wd);
        resumeHelper = new ResumeHelper(wd);
    }

    public void stop() {
        wd.quit();
    }



    public CandidateHelper getCandidateHelper() {
        return candidateHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public SelectTest getSelectTest()
    {
        return selectTest;
    }

    public CompanyHelper getCompanyHelper() {
        return companyHelper;
    }

    public ResumeHelper getResumeHelper()
    {
        return resumeHelper;
    }

}
