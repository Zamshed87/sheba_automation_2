package HomePage;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

    @Getter
    WebDriver driver;

    By logo = By.xpath("//img[@alt='sheba.xyz']");
    By health = By.xpath("//img[@alt='Health & Care']");
    By best = By.xpath("//*[@id='cat-918___BV_tab_button__']/div/span");
    By AC = By.xpath("//a[normalize-space()='AC Repair Services']");
    By All = By.xpath("//a[normalize-space()='All Services']");
    By Appliance = By.xpath("//a[normalize-space()='Appliance Repair']");
    By location = By.xpath("//span[@class='location-name align-self-center']");
    By dhaka = By.xpath(" By location = By.xpath(\'[//span[@class='location-name align-self-center']\');");
    By search = By.xpath("//button[@class='btn search-button btn-secondary']");
    By salon = By.xpath("//span[@aria-current='location']");

    public Homepage(WebDriver driver){
        this.driver = driver ;
    }

    public WebElement getSearchIcon(){
        return driver.findElement(logo);
    }

    public WebElement gethealth(){
            return driver.findElement(health);
        }

    public WebElement bestdeal(){
        return driver.findElement(best);
    }

    public WebElement getbest(){
            return driver.findElement(best);
        }
    public WebElement AC(){
        return driver.findElement(AC);
    }
    public WebElement All(){
        return driver.findElement(All);
    }


    public WebElement Appliance() {
        return driver.findElement(Appliance);
    }

    public WebElement location() {
        return driver.findElement(location);
    }

    public WebElement search() {
        return driver.findElement(location);
    }

    public WebElement salon() {
        return driver.findElement(location);
    }

}


