package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/fatihefendioglu/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com");

        //ilk web elementimizi buluyoruz
        // Hamza - String
        // websayfasindaki tum elemanlar - webelement

        //webelementimizi id kullanarak bulduk
        WebElement singInLink = driver.findElement(By.id("sign-in"));
        singInLink.click();

        //email kutusunu bulalim
        WebElement emailKutusu = driver.findElement(By.id("session_email"));

        //email kutusunun icine yazi
        emailKutusu.sendKeys("testtechproed@gmail.com");

        //sifre kutusunu bulma
        WebElement sifreKutusu = driver.findElement(By.id("session_password"));
        //sifrekutusunun icine yazi gonderme
        sifreKutusu.sendKeys("Test1234!");

        //sign in butonunu buluyoruz
        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.click();

        String baslik = driver.getTitle();

        if (baslik.equals("Address Book")) {
            System.out.println("Giris basarili");
        }else {
            System.out.println("Giris basarisiz");
        }







    }

}
