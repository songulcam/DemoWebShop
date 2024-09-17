import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_205 extends BaseDriver {
    String emailStr="Auser@gmail.com";
    String passwordStr="Earnq123**";
    String invalidEmailStr="Ause@gmail.com";
    String invalidPasswordStr="Earnq123*";

    @Test
    public void emailValidPasswordInvalid(){

        driver.get("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/"));

        WebElement logIn=driver.findElement(By.cssSelector("[class='ico-login']"));
        wait.until(ExpectedConditions.elementToBeClickable(logIn));
        new Actions(driver).click(logIn).build().perform();

        WebElement email=driver.findElement(By.cssSelector("[class='email']"));
        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys(emailStr);

        WebElement password=driver.findElement(By.cssSelector("[class='password']"));
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(invalidPasswordStr);

        WebElement logInClick=driver.findElement(By.xpath("(//div[@class='buttons'])[3]//input"));
        wait.until(ExpectedConditions.elementToBeClickable(logInClick));
        new Actions(driver).click(logInClick).build().perform();

        WebElement logInMassageControl=driver.findElement(By.xpath("//div[@class='message-error']//ul//li"));
        wait.until(ExpectedConditions.visibilityOf(logInMassageControl));
        Assert.assertTrue("Mesaj görüntülenemedi",logInMassageControl.getText().contains("The credentials provided are incorrect"));

        tearDown();
    }

    @Test
    public void emailInvalidPasswordValid(){

        driver.get("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/"));

        WebElement logIn=driver.findElement(By.cssSelector("[class='ico-login']"));
        wait.until(ExpectedConditions.elementToBeClickable(logIn));
        new Actions(driver).click(logIn).build().perform();

        WebElement email=driver.findElement(By.cssSelector("[class='email']"));
        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys(invalidEmailStr);

        WebElement password=driver.findElement(By.cssSelector("[class='password']"));
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(passwordStr);

        WebElement logInClick=driver.findElement(By.xpath("(//div[@class='buttons'])[3]//input"));
        wait.until(ExpectedConditions.elementToBeClickable(logInClick));
        new Actions(driver).click(logInClick).build().perform();

        WebElement logInMassageControl=driver.findElement(By.xpath("//div[@class='message-error']//ul//li"));
        wait.until(ExpectedConditions.visibilityOf(logInMassageControl));
        Assert.assertTrue("Mesaj görüntülenemedi",logInMassageControl.getText().contains("No customer account found"));

        tearDown();
    }

    @Test
    public void emailInvalidPasswordInvalid(){

        driver.get("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/"));

        WebElement logIn=driver.findElement(By.cssSelector("[class='ico-login']"));
        wait.until(ExpectedConditions.elementToBeClickable(logIn));
        new Actions(driver).click(logIn).build().perform();

        WebElement email=driver.findElement(By.cssSelector("[class='email']"));
        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys(invalidEmailStr);

        WebElement password=driver.findElement(By.cssSelector("[class='password']"));
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(invalidPasswordStr);

        WebElement logInClick=driver.findElement(By.xpath("(//div[@class='buttons'])[3]//input"));
        wait.until(ExpectedConditions.elementToBeClickable(logInClick));
        new Actions(driver).click(logInClick).build().perform();

        WebElement logInMassageControl=driver.findElement(By.xpath("//div[@class='message-error']//ul//li"));
        wait.until(ExpectedConditions.visibilityOf(logInMassageControl));
        Assert.assertTrue("Mesaj görüntülenemedi",logInMassageControl.getText().contains("No customer account found"));

        tearDown();
    }

    @Test
    public void emailNullPasswordValid(){

        driver.get("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/"));

        WebElement logIn=driver.findElement(By.cssSelector("[class='ico-login']"));
        wait.until(ExpectedConditions.elementToBeClickable(logIn));
        new Actions(driver).click(logIn).build().perform();

        WebElement email=driver.findElement(By.cssSelector("[class='email']"));
        wait.until(ExpectedConditions.visibilityOf(email));

        WebElement password=driver.findElement(By.cssSelector("[class='password']"));
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(passwordStr);

        WebElement logInClick=driver.findElement(By.xpath("(//div[@class='buttons'])[3]//input"));
        wait.until(ExpectedConditions.elementToBeClickable(logInClick));
        new Actions(driver).click(logInClick).build().perform();

        WebElement logInMassageControl=driver.findElement(By.xpath("//div[@class='message-error']//ul//li"));
        wait.until(ExpectedConditions.visibilityOf(logInMassageControl));
        Assert.assertTrue("Mesaj görüntülenemedi",logInMassageControl.getText().contains("No customer account found"));

        tearDown();
    }
}