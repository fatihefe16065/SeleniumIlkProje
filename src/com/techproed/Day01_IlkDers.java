package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {

        //java projemize chromedriver i tanittik
        System.setProperty("webdriver.chrome.driver","/Users/fatihefendioglu/Documents/selenium libraries/drivers/chromedriver");

        //Selenium ile ilgili ilk kodumuz
        //webdriver nesnesi olusturarak chromedriver i kullanilabilir hale getirdik
        WebDriver webDriver = new ChromeDriver();

        //Driverimiza google a gitmesini soyledik
        webDriver.get("https://google.com");

        //driverımızda açık olan pencereyi kapatır.
        webDriver.close();

        //driverımı komple kapatıyor
        //webDriver.quit();




    }

}
