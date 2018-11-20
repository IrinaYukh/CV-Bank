package cvbank.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenSiteTest extends TestBase
{
    @Test
    public void testSiteOpened()
    {
      Assert.assertTrue(app.getSessionHelper()
                .isElementPresent(By.xpath("//div[@class='header-logo p-2 text-left cv-logo title-header-logo']//span")));
    }
}
