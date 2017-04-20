package com.epam.lab.bo;

import com.epam.lab.page.MailInboxPage;

public class MailInboxBO {

    private MailInboxPage mailInboxPage = new MailInboxPage();

    /**
     * Click compose button
     */
    public void clickComposeButton() {
        mailInboxPage.clickCompose();
    }

    /**
     * This method fills invalid login
     *
     * @param invalidRecipient invalid mail input
     */
    public void fillInvalidToField(String invalidRecipient) {
        mailInboxPage.enterTo(invalidRecipient);
    }


    /**
     * This method fills valid login
     *
     * @param validRecipient valid mail input
     */
    public void fillValidToField(String validRecipient) {
        mailInboxPage.enterTo(validRecipient);
    }


    /**
     * This method fills subject and message field
     *
     * @param subject subject input
     * @param messageText message text input
     */
    public void fillSubjectAndMessageFields(
            String subject,
            String messageText) {
        mailInboxPage.enterSubject(subject);
        mailInboxPage.enterMessage(messageText);
    }

    /**
     * This method clicks send button with warning message verify
     */
    public void clickSendButtonWithVerify() {
        mailInboxPage.clickSend();
    }

    /**
     * This method clicks on To field and clear invalid email
     */
    public void clickOnToFieldAndClearButton() {
        mailInboxPage.clickOnTo();
        mailInboxPage.clickClear();
    }

    /**
     * This method clicks send button without warning message verify
     */
    public void clickSendButtonWithoutVerify() {
        mailInboxPage.clickSendMail();
    }

    /**
     * This method clicks on sent message
     */
    public void clickSentMessages() {
        mailInboxPage.clickSent();
    }

}