package com.epam.lab.page;

import com.epam.lab.element.ButtonElement;
import com.epam.lab.element.InputElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.epam.lab.util.FluentWaitElement.waitElement;

public class MailSentPage extends AbstractPage {

    @FindBy(xpath = "//div[@class='asf T-I-J3 J-J5-Ji']")
    private ButtonElement refresh;

    @FindBy(xpath = "//table[@class='F cf zt']/tbody/tr")
    private List<WebElement> sentMessages;

    @FindBy(xpath = "//*[@class='ii gt adP adO']/div[1]/div")
    private InputElement sentMessageText;

    /**
     * This method refreshes page
     */
    public void clickRefresh() {
        waitElement(driver);
        driver.navigate().refresh();
    }

    /**
     * This method opens last sent message
     */
    public void clickLastSentMessage() {
        sentMessages.get(0).click();
    }

    /**
     * This method gets text from last sent message
     *
     * @return text from last sent message
     */
    public String messageText() {
        return sentMessageText.getText();
    }
}