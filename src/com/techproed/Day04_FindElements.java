package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day04_FindElements {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/fatihefendioglu/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        // a tagname sahip tüm webelementleri bulalım.
        // if-else , for-foreach - methodlar - nesneoluşturma - arrays

        List<WebElement> listem = driver.findElements(By.tagName("a"));

        for (WebElement w : listem) { // for(int i = 0 ; i < listem.size(); i++)
            System.out.println(w.getText());

        }

    }

}
