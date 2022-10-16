import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeDriver myInput =new ChromeDriver();

        myInput.get("https://www.amazon.com/");

    }
}
