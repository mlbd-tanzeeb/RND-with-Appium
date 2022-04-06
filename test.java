package com.test.employeedirecroty.app.screens;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.WebElement;

import com.test.utils.AbstractScreen;

public class EmployeeDetailsScreen extends AbstractScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"View Direct Reports\")")
    private WebElement viewDirectReport;

    public EmployeeDetailsScreen(AndroidDriver driver) {
        super(driver);

        loadPage();
    }

    public boolean verifyEmail(String emailID) {

        return isElementPresent(MobileBy
                .AndroidUIAutomator("new UiSelector().descriptionContains(\"" + emailID + "\")"));
    }

    public HomeScreen navigateToHomeScreen() {

        driver.navigate().back();
        return new HomeScreen(driver);
    }

    public DirectReportScreen viewDirectReports() {

        viewDirectReport.click();
        return new DirectReportScreen(driver);
    }

    public boolean verifyManagerName(String employeeName) {

        return isElementPresent(MobileBy.AndroidUIAutomator("new UiSelector().descriptionContains(\"" + employeeName
                + "\")"));
    }
}