public class login_set_values {


    public static void main(String[] args){
        AppiumDriver<MobileElement> appiumDriver = AppiumDriverEx.getAppiumDriver();
        MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("");
        loginlabel.click();

        MobileElement usernameText = appiumDriver.findElementByAccessibilityId("input-email");
        usernameTxtBx.sendKeys("tanzeeb.rubaiat+21@monstar_lab.com");

        MobileElement passwordText = appiumDriver.findElementByAccessibilityId("input-password");
        passwordText.sendKeys("password");

        MobileElement loginbutton = appiumDriver.findElementByAccessibilityId("button-LOGIN");
        loginbutton.click();




    }
}
