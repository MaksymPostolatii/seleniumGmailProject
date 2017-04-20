package com.epam.lab.page;

import com.epam.lab.element.ButtonElement;
import com.epam.lab.element.InputElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LoginPage extends AbstractPage {

    @FindBy(id = "Email")
    private InputElement loginField;
    @FindBy(id = "Passwd")
    private InputElement passwordField;
    @FindBy(id = "next")
    private ButtonElement nextButton;
    @FindBy(id = "signIn")
    private ButtonElement submitButton;

    /**
     * This method fills login field
     *
     * @param login login input
     */
    public void enterLogin(String login) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginField.send(login);
    }

    /**
     * This method fills password field
     *
     * @param password password input
     */
    public void enterPassword(String password) {
        passwordField.send(password);
    }

    /**
     * This method clicks next button
     */
    public void clickNextButton() {
        nextButton.click();
    }

    /**
     * This method clicks submit button
     */
    public void clickSubmitButton() {
        submitButton.click();
    }

}