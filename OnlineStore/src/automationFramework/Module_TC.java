package automationFramework;

        import java.util.concurrent.TimeUnit;

        import org.openqa.selenium.WebDriver;

        import org.openqa.selenium.firefox.FirefoxDriver;

        // Import package appModule.*

        import appModules.SignIn_Action;

        import pageObjects.Home_Page;

   public class Module_TC {

&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;private static WebDriver driver = null;

&nbsp;&nbsp; &nbsp; public static void main(String[] args) {

&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;driver = new FirefoxDriver();

&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;driver.get("http://www.store.demoqa.com");

        // Use your Module SignIn now

&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;SignIn_Action.Execute(driver);

        System.out.println("Login Successfully, now it is the time to Log Off buddy.");

        Home_Page.lnk_LogOut(driver).click();

        driver.quit();

     }

}