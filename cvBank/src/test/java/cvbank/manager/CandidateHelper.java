package cvbank.manager;

import cvbank.model.CandidateData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CandidateHelper extends HelperBase
{
    // constructor
    public CandidateHelper(WebDriver wd)
    {
        super(wd);
    }


    // create Candidate

    public void initCandidateRegistration()
    {
        registerButton();
        click(By.xpath("//div[@class='left-heading']"));
    }

    public void fillCandidateForm(CandidateData candidate)
    {
        type(By.xpath("//input[@id='firstName']"),candidate.getFirstName());
        type(By.xpath("//input[@id='lastName']"),candidate.getLastName());
        type(By.xpath("//input[@id='email']"),candidate.getEmail());
        type(By.xpath("//input[@id='phone']"),candidate.getPhone());
        type(By.xpath("//input[@id='password']"),candidate.getPassword());
        type(By.xpath("//input[@id='password-confirm']"),candidate.getConfirmPassword());
    }

    public void submitCandidateForm()
    {
        click(By.xpath("//button[@type='submit']"));
    }

    public void registerCandidate(String firstName, String lastName, String email,
                                String phone, String password,String confirmPassword)
    {
        fillCandidateForm(new CandidateData().setFirstName(firstName)
                                            .setLastName(lastName)
                                            .setEmail(email)
                                            .setPhone(phone)
                                            .setPassword(password)
                                            .setConfirmPassword(confirmPassword));
    }

    public void registerCandidateFromLoginForm(String firstName, String lastName, String email,
                                             String phone, String password,String confirmPassword)
    {
        clickCreateFromLogin();
        fillCandidateForm(new CandidateData().setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPhone(phone)
                .setPassword(password)
                .setConfirmPassword(confirmPassword));

    }

    public void clickCreateFromLogin()
    {
        click(By.xpath("//button[@class='btn btn-danger'][contains(text(),'Create')]"));
    }


//    public void createGroup() throws InterruptedException {
//        initGroupCreation();
//        fillGroupForm(new CandidateData().setFirstName("nameFromTestBase").setLastName()
//                .setPhone("logoFromTestBase")
//                .setPositionName("commentFromTestBase"));
//        submitGroupCreation();
//        returnToGroupPage();
//    }


    // modify Group

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void selectGroupCheckBox() {
        click(By.name("selected[]"));
    }

    public void selectGroupByIndex(int index)
    {
        wd.findElements(By.name("selected[]")).get(index).click();

    }

    public void submitGroupModification() {
        click(By.name("update"));
    }


    // delete Group

    public void initGroupDeletion() {
        click(By.name("delete"));
    }

    public int getGroupsSize() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public boolean isGroupPresent()
    {
        return isElementPresent(By.name("selected[]"));
    }


//    public List<CompanyData> getGroupsList()
//    {
//        List<CompanyData> groups = new ArrayList<>();
//
//        List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
//        for (WebElement element: elements)
//        {
//            String name = element.getText();
//            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
//            CompanyData group = new CompanyData().setId(id).setName(name);
//            groups.add(group);
//        }
//        System.out.println(groups);
//        return groups;
//    }
}
