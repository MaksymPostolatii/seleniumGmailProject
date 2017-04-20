package com.epam.lab.page;

import com.epam.lab.element.ButtonElement;
import com.epam.lab.element.InputElement;
import org.openqa.selenium.support.FindBy;

import static com.epam.lab.util.FluentWaitElement.waitClickableElement;
import static com.epam.lab.util.FluentWaitElement.waitElement;

public class MailInboxPage extends AbstractPage {

    @FindBy(xpath = "//div[contains(text(),'НАПИСАТИ')] | div[contains(text(),'COMPOSE')]")
    private ButtonElement compose;

    @FindBy(xpath = "//textarea[@name='to']")
    private InputElement to;

    @FindBy(xpath = "//input[@name = 'subjectbox']")
    private InputElement subject;

    @FindBy(xpath = "//div[@class='Am Al editable LW-avf']")
    private InputElement message;

    @FindBy(xpath = "//div[@class = 'T-I J-J5-Ji aoO T-I-atl L3']")
    private ButtonElement send;

    @FindBy(xpath = "//button[@class='J-at1-auR']")
    private ButtonElement ok;

    @FindBy(xpath = "//div[@class='oL aDm az9']")
    private ButtonElement clickTo;

    @FindBy(xpath = "//div[@class='vM']")
    private ButtonElement clear;

    @FindBy(css = "a[href$='#sent']")
    private ButtonElement sent;

    /**
     * This method clicks compose button
     */
    public void clickCompose() {
        compose.click();
    }

    /**
     * This method fills To field
     *
     * @param recipients recipients
     */
    public void enterTo(String recipients) {
        to.send(recipients);
    }

    /**
     * This method fills Subject field
     *
     * @param theme subject
     */
    public void enterSubject(String theme) {
        subject.send(theme);
    }

    /**
     * This method fills Text message
     *
     * @param messageText message text
     */
    public void enterMessage(String messageText) {
        message.send(messageText);
    }

    /**
     * This method clicks send button and
     * call verifyWarn method
     */
    public void clickSend() {
        send.click();
        verifyWarn();
    }

    /**
     * This method verifies if warning window
     * displayed and clicks ok button if true
     */
    private void verifyWarn() {
        waitClickableElement(ok.getWebElement(), driver);
        if (ok.isPresent()) {
            ok.click();
        }
    }

    /**
     * This method clicks on to field
     */
    public void clickOnTo() {
        waitElement(clickTo.getWebElement(), driver);
        clickTo.click();
    }

    /**
     * This method delete recipients email
     */
    public void clickClear() {
        clear.click();
    }

    /**
     * This method clicks send button
     */
    public void clickSendMail() {
        waitElement(send.getWebElement(), driver);
        send.click();
    }

    /**
     * This method opens sent messages page
     */
    public void clickSent() {
        sent.click();
    }

}