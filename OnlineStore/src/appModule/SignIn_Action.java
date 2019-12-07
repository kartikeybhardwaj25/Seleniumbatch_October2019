package appModule;

        import org.openqa.selenium.WebDriver;

        import pageObjects.Home_Page;

        import pageObjects.LogIn_Page;

  public class SignIn_Action {

     public static void Execute(WebDriver driver,String sUsername, String sPassword){

        Home_Page.lnk_MyAccount(driver).click();

        LogIn_Page.txtbx_UserName(driver).sendKeys(sUsername);

        LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);

        LogIn_Page.btn_LogIn(driver).click();

     }

}