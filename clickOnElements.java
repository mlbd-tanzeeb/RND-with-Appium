import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import java.net.MalformedURLException;
import java.net.URL;


public class clickOnElements {

    public static void main(String args []) throws MalformedURLException {
         DesiredCapabilities dc = new Desiredcapabilities();
         dc.setCapability(MobileCapabilityType.DEVICE_NAME, value: "988954334650444443");
         dc.setCapability(capabilityName: "platformName", value: "android");
         dc.setCapability(capabilityName: "appPackage", value: "com.stg.onro");
         dc.setCapability(capabilityName: "appActivity", value: ".onro/mainActivity");

         AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL( spec "http://127.0.0.1:4723/wd/hub"),dc);
     AppiumDriver<MobileElement> appiumDriver = AppiumDriverEx.getAppiumDriver();
     MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("Login");
     loginLabel.click();


 }


}
