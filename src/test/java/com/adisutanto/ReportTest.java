package com.adisutanto;

import static org.junit.Assert.assertTrue;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReportTest {

    private WebDriver driver = new ChromeDriver();
    private JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
    private NgWebDriver ngDriver = new NgWebDriver(jsDriver);

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setup() {
        driver.get(Constants.BASE_URL);
        ngDriver.waitForAngularRequestsToFinish();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void topSellingProducts() {
        WebElement selectElement = driver
                .findElement(ByAngular.cssContainingText("app-top-selling-products .custom-select", ""));
        Select selectObject = new Select(selectElement);
        selectObject.selectByVisibleText("Indonesia");
        ngDriver.waitForAngularRequestsToFinish();
    }

    @Test
    public void salesByMonth() {
        WebElement selectElement = driver
                .findElement(ByAngular.cssContainingText("app-year-month-sales .custom-select", ""));
        Select selectObject = new Select(selectElement);
        selectObject.selectByVisibleText("Indonesia");
        ngDriver.waitForAngularRequestsToFinish();
    }

}
