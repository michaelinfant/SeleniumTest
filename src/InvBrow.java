import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class InvBrow {
public static void main (String []args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\michaeli\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
//driver.get("https://agentsonly.msagroup.com/agentsonly/#/main");
//System.out.println(driver.getTitle());
//System.out.println(driver.getCurrentUrl());
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("michael.infant@gmail.com");
//driver.navigate().back();
} 
}
