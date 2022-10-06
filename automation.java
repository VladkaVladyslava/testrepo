package Automation111;

import com.google.errorprone.annotations.Keep;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.security.rsa.RSAUtil;

import java.sql.SQLOutput;

public class Duotify {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/vladyslavayakobchuk/Desktop/browser sriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php");

        Thread.sleep(1000);

        String searchedTitle="Welcome to Duotify!";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(searchedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL, title didn't pass");
        }


        driver.findElement(By.id("hideLogin")).click();
        driver.findElement(By.id("username")).sendKeys("Vladkaaaa");
        driver.findElement(By.id("firstname")).sendKeys("Vladyslava");
        driver.findElement(By.id("lastname")).sendKeys("Yakobchuk");
        driver.findElement(By.id("email")).sendKeys("vladusik25252525378968@ukr.net");
        driver.findElement(By.id("email2")).sendKeys("vladusik25252525378968@ukr.net");
        driver.findElement(By.id("password")).sendKeys("Vlada123");
        driver.findElement(By.id("password2")).sendKeys("Vlada123");


        driver.findElement(By.name("registerButton")).click();


     String searchURL="http://qa-duotify.us-east-2.elasticbeanstalk.com/browse.php?";
     String actualURL=driver.getCurrentUrl();

        if(actualURL.equals(searchURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL.URL didn't match");
        }


       String searchFullName="Vladyslava Yakobchuk";
        String actualFullName=driver.findElement(By.id("nameFirstAndLast")).getText();

        if(actualFullName.equals(searchFullName)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL.full name didn't match");
        }
        Thread.sleep(1000);
       driver.findElement(By.id("nameFirstAndLast")).click();


       String searchedUserName= "Vladyslava Yakobchuk";

       if(driver.getPageSource().contains(searchedUserName)){

            System.out.println("PASS");
        }else{
            System.out.println("FAIL.URL didn't match");
        }
        Thread.sleep(2000);

        driver.findElement(By.id("rafael")).sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        String searchURL2="http://qa-duotify.us-east-2.elasticbeanstalk.com/register.php";
        String actualURL2=driver.getCurrentUrl();

        if(actualURL2.equals(searchURL2)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL.URL didn't match");
        }
        Thread.sleep(2000);
        driver.findElement(By.id("loginUserName")).sendKeys("Vladkaaaa");
        driver.findElement(By.id("loginPassword")).sendKeys("Vlada123", Keys.ENTER);

        Thread.sleep(2000);
        String searchText="You Might Also Like";
        String actualText= driver.findElement(By.className("pageHeadingBig")).getText();
        //// pageHeadingBig

        if(actualText.equals(searchText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL.Search text couldn't  find");
        }



    }




}