package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSource {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
// amazon sitesine gidip Kaynak kodlarinda "spend less" yazdigini test edin
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
       String sayfaKaynakKodlari= driver.getPageSource();
       String arananKelime="Gateway";
       if (sayfaKaynakKodlari.contains(arananKelime)){
           System.out.println("Kaynak Kodu Testi PASSED");
       }else{
           System.out.println("Kaynak kodlarinda "+ arananKelime+ " yok, test FAILED");
       }
driver.close();
    }
}
