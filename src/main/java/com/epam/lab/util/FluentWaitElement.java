package com.epam.lab.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import static com.epam.lab.util.Constants.SENT;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;

@SuppressWarnings("unchecked")
public class FluentWaitElement {

    /**
     * This method waits until web element becomes visible
     *
     * @param webElement web element
     * @param driver driver
     */
    public static void waitElement(WebElement webElement, WebDriver driver) {
        Wait wait = new FluentWait(driver).withTimeout(10, SECONDS).pollingEvery(3, MILLISECONDS);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    /**
     * This method waits until URL contains text "#sent"
     *
     * @param driver driver
     */
    public static void waitElement(WebDriver driver) {
        Wait wait = new FluentWait(driver).withTimeout(20, SECONDS).pollingEvery(3, MILLISECONDS);
        wait.until(ExpectedConditions.urlContains(SENT));
    }

    /**
     * This method waits until web element becomes clickable
     *
     * @param webElement web element
     * @param driver driver
     */
    public static void waitClickableElement(WebElement webElement, WebDriver driver) {
        Wait wait = new FluentWait(driver).withTimeout(10, SECONDS).pollingEvery(3, MILLISECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

}