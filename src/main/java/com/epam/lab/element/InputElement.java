package com.epam.lab.element;

import org.openqa.selenium.WebElement;

/**
 * Input web element wrapper
 */
public class InputElement extends AbstractElement {

    public InputElement(WebElement webElement) {
        super(webElement);
    }

    /**
     * Sends keys into input field
     *
     * @param keys input keys
     */
    public void send(String keys) {
        webElement.sendKeys(keys);
    }

    /**
     * Returns web element text
     *
     * @return web element text
     */
    public String getText() {
        return webElement.getText();
    }
}
