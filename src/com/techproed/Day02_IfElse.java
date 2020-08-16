package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/fatihefendioglu/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://amazon.com");
        String sayfaBasligi = driver.getTitle();//car

        if (sayfaBasligi.contains("Car") ) {
            System.out.println("Car kelimesini iceriyor");
        }else {
            System.out.println("Car kelimesini icermiyor");
        }

        driver.quit();

        //if-else
        //for dongusu
        //foreach
        //nesne olusturma
        //methodlar


    }
}
