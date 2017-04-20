package com.epam.lab;

import com.epam.lab.bo.LoginBO;
import com.epam.lab.bo.MailInboxBO;
import com.epam.lab.bo.MailSentBO;
import com.epam.lab.driver.DriverManager;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.epam.lab.util.Constants.*;

public class TestEmail {

    @DataProvider(parallel = true)
    public Object[][] dataProvider() {
        return new Object[][]{{LOGIN_1, PASSWORD}, {LOGIN_2, PASSWORD},
                {LOGIN_3, PASSWORD}, {LOGIN_4, PASSWORD}, {LOGIN_5, PASSWORD}};
    }

    @Test(dataProvider = DATA_PROVIDER)
    public void LoginTest(String login, String password) {

        LoginBO loginBO = new LoginBO();
        MailInboxBO mailInboxBO = new MailInboxBO();
        MailSentBO mailSentBO = new MailSentBO();

        loginBO.fillLoginFieldAndClickNext(login);
        loginBO.fillPasswordFieldAndClickSubmit(password);

        mailInboxBO.clickComposeButton();
        mailInboxBO.fillInvalidToField(INVALID_MAIL);
        mailInboxBO.fillSubjectAndMessageFields(SUBJECT, MESSAGE);
        mailInboxBO.clickSendButtonWithVerify();
        mailInboxBO.clickOnToFieldAndClearButton();
        mailInboxBO.fillValidToField(VALID_MAIL);
        mailInboxBO.clickSendButtonWithoutVerify();
        mailInboxBO.clickSentMessages();

        mailSentBO.clickRefreshButton();
        mailSentBO.openLastSentMessage();
        Assert.assertEquals(MESSAGE, mailSentBO.getMessageText());
    }

    @AfterMethod
    public void afterMethod() {
        DriverManager.removeDriver();
    }

}