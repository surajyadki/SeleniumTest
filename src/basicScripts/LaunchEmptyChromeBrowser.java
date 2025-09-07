package basicScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchEmptyChromeBrowser {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();

	}

}
