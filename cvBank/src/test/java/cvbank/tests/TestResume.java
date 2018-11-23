package cvbank.tests;

import cvbank.manager.ResumeHelper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestResume extends TestBase
{


    @Test
    public void createCV()
    {
        ResumeHelper resume = app.getResumeHelper();

        resume.clickCreateCV_button();
        resume.openAll_CV_fields();
        resume.createTitle("resume","Sara","Filder","02022000","adfa","qwerty");
        resume.createContactInfo("+972 53 1000000", "sarafild@yandex.ru","Jerusalem, Israel");
        resume.createDescription("Center","Developer","1000","5000");
        resume.createEducation("Harvard","BA","1985","qwerty");


        resume.selectSkill("Java");
        resume.selectSkill("PHP");


        resume.createJob("Monday","Developer","2010","2017","qwerty");
        resume.createAchievement("qwerty","2005");
        resume.createCertification("qwerty","2016");


        resume.selectLanguage("English","1");
        resume.addLanguage();
        resume.selectLanguage("Hebrew","2");


        resume.createFooterLinks("aasgsfg","asfgasgsf","asfgag");
        resume.createFooterInfo("dhadah");
        resume.submitCV_creation();
    }

    @Test
    public void selectSkills()
    {
        ResumeHelper resume = app.getResumeHelper();

        resume.clickCreateCV_button();
        resume.openSkills();
        resume.selectSkill("Java");
        resume.selectSkill("PHP");
        resume.selectSkill("Docker");

    }

    @Test
    public void selectLanguages()
    {
        ResumeHelper resume = app.getResumeHelper();

        resume.clickCreateCV_button();
        resume.wd.findElement(By.xpath("//a[@aria-controls='languages']//i[@class='fas fa-chevron-circle-down']")).click();
        resume.selectLanguage("English","1");
        resume.addLanguage();
        resume.selectLanguage("Greek","2");
        resume.addLanguage();
        resume.selectLanguage("Hebrew","3");

    }

}
