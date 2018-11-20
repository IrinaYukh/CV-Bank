package cvbank.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase
{

    public SessionHelper(WebDriver wd)
    {
        super(wd);
    }

    public void openSite(String url) {
        wd.get(url);
    }

    public void loginUser(String userName, String password) throws InterruptedException {
        clickLoginButton();
        Thread.sleep(1000);
        type(By.xpath("//input[@id='email']"),userName);
        Thread.sleep(1000);
        type(By.xpath("//input[@id='password']"),password);
        Thread.sleep(3000);
        click(By.xpath("//button[@type='submit']"));
        Thread.sleep(5000);
        clickSuccessMessage();
    }

    public void logout()
    {
        click(By.xpath("//ul[@class='menu-btns']//button[@type='button'][contains(text(),'Sign Out')]"));
    }

    private void confirmAlert() throws InterruptedException {
            wd.switchTo().alert().accept();
            Thread.sleep(2000);
    }

    public void dismissAlert() {
        wd.switchTo().alert().dismiss();
    }



//    public boolean isLoggedIn()
//    {
//        return isElementPresent(By.cssSelector("div.user-main-info"));
//    }
}
