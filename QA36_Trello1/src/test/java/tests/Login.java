package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class Login extends TestBase{

   @BeforeMethod
   public void preConditions(){
      if(app.getUser().isLogged()){
         app.getUser().logOut();
      }
   }
   @Test
   public void Login1(){
      app.getUser().initLogin();
      app.getUser().pause(2000);
      app.getUser().fillInLoginForm("shulganp@gmail.com", "Na:30091983");
      app.getUser().submitlogin();
      app.getUser().pause(2000);

      Assert.assertTrue(app.getUser().isLogged());
   }
}
