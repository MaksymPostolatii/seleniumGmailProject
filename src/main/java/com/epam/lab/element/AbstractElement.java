package com.epam.lab.element;

import org.openqa.selenium.WebElement;

/**
 * Class which implements web element
 */
public abstract class AbstractElement {

    WebElement webElement;

    AbstractElement(WebElement webElement) {
        this.webElement = webElement;
    }

    public WebElement getWebElement() {
        return webElement;
    }

}
