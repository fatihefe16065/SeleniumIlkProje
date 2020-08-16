package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {

    public static void main(String[] args) {
        //chromedriver tanitma
        System.setProperty("webdriver.chrome.driver","/Users/fatihefendioglu/Documents/selenium libraries/drivers/chromedriver");

        WebDriver webDriver = new ChromeDriver();

        //driverin tum ekrani kaplamasini sagliyor
        webDriver.manage().window().maximize();

        //drivera google a gitmesini soyledik
        webDriver.get("http://google.com");

        //get komutu ile ayni islem
        webDriver.navigate().to("http://amazon.com");

        //navigate().back() komutu bir onceki sayfaya döner
        webDriver.navigate().back();

        //navigate().forward() geriden ileri
        webDriver.navigate().forward();

        // navigate().refresh() methodu sayfayı yenilemeye yarıyor.
        webDriver.navigate().refresh();




    }

}
