package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02TitleUrlTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/fatihefendioglu/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://youtube.com");
        String sayfaBasligi = driver.getTitle(); //Video

        if (sayfaBasligi.contains("Video") ) {
            System.out.println("Var + sayfaBasligi");
        }else {
            System.out.println("Yok + sayfaBasligi");
        }

        driver.quit();

    }

}
