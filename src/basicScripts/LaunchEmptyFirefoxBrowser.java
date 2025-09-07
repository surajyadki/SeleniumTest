package basicScripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchEmptyFirefoxBrowser {

	public static void main(String[] args) {
		String key="webdriver.gecko.driver";
		String Value="./softwares/geckodriver.exe";
		System.setProperty(key, Value);
		FirefoxDriver driver=new FirefoxDriver();

	}

}
