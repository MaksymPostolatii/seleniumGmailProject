package com.epam.lab.bo;

import com.epam.lab.page.MailSentPage;

public class MailSentBO {

    private MailSentPage mailSentPage = new MailSentPage();

    /**
     * This method clicks refresh button
     */
    public void clickRefreshButton() {
        mailSentPage.clickRefresh();
    }

    /**
     * This method open last sent message
     */
    public void openLastSentMessage() {
        mailSentPage.clickLastSentMessage();
    }

    /**
     * This method gets text from last sent message
     *
     * @return text from last sent message
     */
    public String getMessageText() {
        return mailSentPage.messageText();
    }

}
