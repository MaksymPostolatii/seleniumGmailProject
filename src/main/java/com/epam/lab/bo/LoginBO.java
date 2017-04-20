package com.epam.lab.bo;

import com.epam.lab.page.LoginPage;

public class LoginBO {

    private LoginPage loginPage = new LoginPage();

    /**
     * This method fills login field and click next button
     * on Gmail login page
     *
     * @param loginField email input
     */
    public void fillLoginFieldAndClickNext(String loginField) {
        loginPage.enterLogin(loginField);
        loginPage.clickNextButton();
    }

    /**
     * This method fills password field and click submit button
     * on Gmail login page
     *
     * @param passwordField password input
     */
    public void fillPasswordFieldAndClickSubmit(String passwordField) {
        loginPage.enterPassword(passwordField);
        loginPage.clickSubmitButton();
    }

}