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

    public void loginUser(String userName, String password)
    {
        clickLoginButton();
        type(By.xpath("//input[@id='email']"),userName);
        type(By.xpath("//input[@id='password']"),password);
        click(By.xpath("//button[@type='submit']"));
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



    public boolean isLoggedOut()
    {
        return isElementPresent(By.xpath("//ul[@class='menu-btns']//button[@type='button'][contains(text(),'Log in')]"));
    }
}
