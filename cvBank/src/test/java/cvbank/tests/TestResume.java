package cvbank.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestResume extends TestBase
{


    @Test
    public void createCV() throws InterruptedException
    {
        //ResumeHelper helper = app.getResumeHelper();

        app.getResumeHelper().clickCreateCV_button();
        Thread.sleep(500);
        app.getResumeHelper().openAll_CV_fields();
        Thread.sleep(500);

        app.getResumeHelper().createTitle("resume","Sara","Filder","02022000","adfa","qwerty");
        Thread.sleep(500);
        app.getResumeHelper().createContactInfo("+972 53 1000000", "sarafild@yandex.ru","Jerusalem, Israel");
        Thread.sleep(500);
        app.getResumeHelper().createDescription("Center","Developer","1000","5000");
        Thread.sleep(500);
        app.getResumeHelper().createEducation("Harvard","BA","1985","qwerty");
        Thread.sleep(500);

        app.getResumeHelper().selectSkill("Java");
        app.getResumeHelper().selectSkill("PHP");
        Thread.sleep(500);

        app.getResumeHelper().createJob("Monday","Developer","2010","2017","qwerty");
        Thread.sleep(500);
        app.getResumeHelper().createAchievement("qwerty","2005");
        Thread.sleep(500);
        app.getResumeHelper().createCertification("qwerty","2016");
        Thread.sleep(500);

        app.getResumeHelper().selectLanguage("English","1");
        app.getResumeHelper().addLanguage();
        app.getResumeHelper().selectLanguage("Hebrew","2");
        Thread.sleep(500);

        app.getResumeHelper().createFooterLinks("aasgsfg","asfgasgsf","asfgag");
        Thread.sleep(500);
        app.getResumeHelper().createFooterInfo("dhadah");
        Thread.sleep(500);

        app.getResumeHelper().submitCV_creation();
        Thread.sleep(500);
    }

    @Test
    public void selectSkills() throws InterruptedException
    {
        app.getResumeHelper().clickCreateCV_button();
        Thread.sleep(2000);
        app.getResumeHelper().openSkills();
        Thread.sleep(2000);
        app.getResumeHelper().selectSkill("Java");
        Thread.sleep(2000);
        app.getResumeHelper().selectSkill("PHP");
        Thread.sleep(1000);
        app.getResumeHelper().selectSkill("Docker");
        Thread.sleep(1000);
    }

    @Test
    public void selectLanguages() throws InterruptedException {
        app.getResumeHelper().clickCreateCV_button();
        Thread.sleep(5000);
        app.getResumeHelper().wd.findElement(By.xpath("//a[@aria-controls='languages']//i[@class='fas fa-chevron-circle-down']")).click();

        app.getResumeHelper().selectLanguage("English","1");
        Thread.sleep(2000);

        app.getResumeHelper().addLanguage();
        Thread.sleep(2000);
        app.getResumeHelper().selectLanguage("Greek","2");
        Thread.sleep(2000);
    }

}
