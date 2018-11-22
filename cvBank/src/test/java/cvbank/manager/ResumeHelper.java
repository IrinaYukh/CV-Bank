package cvbank.manager;

import cvbank.model.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ResumeHelper extends HelperBase
{

    public ResumeHelper(WebDriver wd) {
        super(wd);
    }

    public void clickCreateCV_button()
    {
        click(By.xpath("//div[@class='text-center']//button[@type='button']"));
    }

    public void fillTitle(ResumeData resume) {
        type(By.xpath("//input[@placeholder='cv title*']"), resume.getCvTitle());
        type(By.xpath("//input[@placeholder='first name*']"), resume.getFirstName());
        type(By.xpath("//input[@placeholder='last name*']"), resume.getLastName());
     //   type(By.name("birthday"), resume.getBirthday());
        type(By.xpath("//textarea[@id='summary']"), resume.getSummary());
        type(By.xpath("//textarea[@id='about']"), resume.getAbout());
    }

    public void fillContactInfo(ResumeData resume) {
        type(By.xpath("//input[@placeholder='phone*']"), resume.getPhone());
        type(By.xpath("//input[@placeholder='email*']"), resume.getEmail());
        type(By.xpath("//input[@placeholder='residence']"), resume.getResidence());
    }

    public void fillDescription(ResumeData resume) {
        type(By.xpath("//input[@placeholder='choose preferable area']"), resume.getPreferArea());
        type(By.xpath("//input[@placeholder='choose preferable position']"), resume.getPreferPosition());
        type(By.xpath("//input[@placeholder='Salary from ($)']"), resume.getSalaryFrom());
        type(By.xpath("//input[@placeholder='Salary till ($)']"), resume.getSalaryTill());
    }

    public void fillEducationFields(EducationData educ)
    {
        type(By.xpath("//input[@placeholder='school/institution name*']"),educ.getInstitutionName());
        type(By.xpath("//input[@placeholder='degree*']"),educ.getDegree());
        type(By.xpath("//div[@id='education']//div//input[@placeholder='graduation year*']"),educ.getGraduationYear());
        type(By.xpath("//textarea[@placeholder='description']"),educ.getDescription());
    }

    public void fillJobFields(JobData job)
    {
        type(By.xpath("//input[@placeholder='company*']"),job.getCompany());
        type(By.xpath("//input[@placeholder='position*']"),job.getPosition());
        type(By.xpath("//input[@placeholder='year from']"),job.getYearFrom());
        type(By.xpath("//input[@placeholder='year till']"),job.getYearTill());
        type(By.xpath("//textarea[@placeholder='project description']"),job.getDescription());
    }

    public void fillAchievementFields (AchievementData achiev)
    {
        type(By.xpath("//div[@id='achievements']//div//textarea[@placeholder='description*']"),achiev.getDescription());
        type(By.xpath("//div[@id='achievements']//div//input[@placeholder='graduation year*']"),achiev.getGraduationYear());
    }

    public void fillCertificationFields (CertificationData certif) {
        type(By.xpath("//div[@id='certifications']//div//textarea[@placeholder='description*']"), certif.getDescription());
        type(By.xpath("//div[@id='certifications']//div//input[@placeholder='graduation year*']"), certif.getGraduationYear());
    }

    public void fillFooterLinks(ResumeData resume) {
        type(By.xpath("//input[@placeholder='linkedin link']"), resume.getLinkedIn());
        type(By.xpath("//input[@placeholder='github']"), resume.getGitHub());
        type(By.xpath("//input[@placeholder='portfolio']"), resume.getPortfolio());
    }

    public void fillFooterInfo(ResumeData resume)
    {
        type(By.xpath("//textarea[@placeholder='recommendation']"),resume.getRecommendation());
    }


    public void createTitle(String cvTitle, String firstName, String lastName, String summary
        , String about)
    {
        fillTitle(new ResumeData().setCvTitle(cvTitle).setFirstName(firstName).setLastName(lastName)
                .setSummary(summary).setAbout(about));
    }

    public void createContactInfo(String phone, String email, String residence)
    {
        fillContactInfo(new ResumeData().setPhone(phone).setEmail(email).setResidence(residence));
    }

    public void createDescription(String preferArea, String preferPosition, String salaryFrom, String salaryTill)
    {
        fillDescription(new ResumeData().setPreferArea(preferArea).setPreferPosition(preferPosition)
                .setSalaryFrom(salaryFrom).setSalaryTill(salaryTill));
    }

    public void createEducation(String institution, String degree, String graduatYear, String description)
    {
        fillEducationFields(new EducationData().setInstitutionName(institution).setDegree(degree)
                .setGraduationYear(graduatYear).setDescription(description));
    }

    public void createJob(String company, String position, String yearFrom, String yearTill, String description)
    {
        fillJobFields(new JobData().setCompany(company).setPosition(position).setYearFrom(yearFrom).setYearTill(yearTill)
                    .setDescription(description));
    }

    public void createAchievement(String description, String graduatYear)
    {
        fillAchievementFields(new AchievementData().setDescription(description).setGraduationYear(graduatYear));
    }

    public void createCertification(String description, String graduatYear)
    {
        fillCertificationFields(new CertificationData().setDescription(description).setGraduationYear(graduatYear));
    }

    public void createFooterLinks(String linkedIn,String gitHub,String portfolio)
    {
        fillFooterLinks(new ResumeData().setLinkedIn(linkedIn).setGitHub(gitHub).setPortfolio(portfolio));
    }

    public void createFooterInfo(String recommend)
    {
        fillFooterInfo(new ResumeData().setRecommendation(recommend));
    }


    public void openAll_CV_fields()
    {
        click(By.xpath("//i[@class='fas fa-angle-double-down']"));
    }

    public void submitCV_creation()
    {
        click(By.xpath("//button[contains(text(),'Save')]"));
    }

    public void selectLanguage(String language, String item)
    {
        new Select(wd.findElement(By.xpath("//div[@id='languages']//div//div[" + item + "]//select[1]")))
                .selectByVisibleText(language);
    }

    public void addLanguage()
    {
        click(By.xpath("//button[@title='Add Language']"));
    }

    public void openSkills()
    {
        //click(By.xpath("//h6[contains(text(),'List of skills:')]"));
        click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Skills'])[1]/i[1]"));
    }

    public void selectSkill(String skills)
    {
        click(By.xpath("//div[@id='skill-list']//u[contains(text(),'" + skills + "')]"));
    }

}
