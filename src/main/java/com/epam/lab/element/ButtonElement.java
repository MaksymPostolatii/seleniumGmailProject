package com.epam.lab.element;

import org.openqa.selenium.WebElement;

/**
 * Button web element wrapper
 */
public class ButtonElement extends AbstractElement {

    public ButtonElement(WebElement webElement) {
        super(webElement);
    }

    /**
     * Clicks on button
     */
    public void click() {
        webElement.click();
    }

    /**
     * Verifies if web element displayed
     *
     * @return true if web element displayed
     */
    public boolean isPresent() {
        return webElement.isDisplayed();
    }
}
