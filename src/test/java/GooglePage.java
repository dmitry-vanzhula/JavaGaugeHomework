import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GooglePage {

    private By gSearchButton = By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[3]/center/input[1]");

    @Step("Navigate to <https://www.google.com>")
    public void goToGooglePage(String url) {
        Driver.driver.get(url);
    }

    @Step("Verify the search button")
    public void isDisplayedSearchButton() {
        WebElement searchButton = Driver.driver.findElement(gSearchButton);
        searchButton.isDisplayed();
    }
}
