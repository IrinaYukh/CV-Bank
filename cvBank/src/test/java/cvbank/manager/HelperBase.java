package cvbank.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class HelperBase
{
    public WebDriver wd;


    public HelperBase(WebDriver wd)
    {
        this.wd = wd;
    }

    public void click(By locator)
    {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        if (text != null)
        {
            click(locator);
            wd.findElement(locator).clear();
            wd.findElement(locator).sendKeys(text);
        }
    }

    public void type2(By locator, String text, Boolean clear) {
        if (text != null) {
            click(locator);
            if (clear) {
                wd.findElement(locator).clear();
            }
            wd.findElement(locator).sendKeys(text);
        }
    }

    public boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isElementsPresent(By locator) {
        return wd.findElements(locator).size() > 0;
    }

    public void registerButton()
    {
        click(By.xpath("//ul[@class='menu-btns']//button[@type='button'][contains(text(),'Register')]"));
    }

    public void clickLoginButton()
    {
        click(By.xpath("//ul[@class='menu-btns']//button[@type='button'][contains(text(),'Log in')]"));
    }

    public void clickSuccessMessage() {
        click(By.xpath("//button[@class='btn btn-close']"));
    }
}
