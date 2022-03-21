import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import java.net.MalformedURLException;
import java.net.URL;


public class calmain {
    public static void main(String args []) throws MalformedURLException {
        DesiredCapabilities dc = new Desiredcapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, value: "988954334650444443");
        dc.setCapability(capabilityName: "platformName", value: "android");
        dc.setCapability(capabilityName: "appPackage", value: "com.android.calculator2");
        dc.setCapability(capabilityName: "appActivity", value: ".Calculator");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL( spec "http://127.0.0.1:4723/wd/hub"),dc);

        MobileElement e11 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_8");
        e11.click();

        MobileElement e12 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_0");
        e12.click();

        MobileElement e13 = (MobileElement) driver.findElementByAccessibilityId("plus");
        e13.click();

        MobileElement e14 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        e14.click();

        MobileElement e15 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_4");
        e15.click();

        MobileElement e16 = (MobileElement) driver.findElementByAccessibilityId("equals");
        e16.click();

        Assert.asserEquals(driver.findElementByID("com.android.calculator2:id/result").getText(),104)





        MobileElement e17 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_5");
        e17.click();

        MobileElement e18 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_0");
        e18.click();

        MobileElement e19 = (MobileElement) driver.findElementByAccessibilityId("minus");
        e19.click();

        MobileElement e20 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_3");
        e20.click();

        MobileElement e20 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_0");
        e20.click();

        MobileElement e21 = (MobileElement) driver.findElementByAccessibilityId("equals");
        e21.click();

        Assert.asserEquals(driver.findElementByID("com.android.calculator2:id/result").getText(),20)


    }



}
