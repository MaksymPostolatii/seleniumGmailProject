package com.epam.lab.page;

import com.epam.lab.decorator.CustomFieldDecorator;
import com.epam.lab.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.epam.lab.util.Constants.GMAIL_PATH;

abstract class AbstractPage {

    WebDriver driver;

    AbstractPage() {
        driver = DriverManager.getDriver();
        DriverManager.getDriver().get(GMAIL_PATH);
        DriverManager.getDriver().manage().window().maximize();
        PageFactory.initElements(new CustomFieldDecorator(driver), this);
    }

}
