
package basicScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBothEmptyBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String key1="webdriver.chrome.driver";
		String value1="./softwares/chromedriver.exe";
		System.setProperty(key1, value1);
		String key2="webdriver.gecko.driver";
		String value2="./softwares/geckodriver.exe";
		System.setProperty(key2, value2);
		ChromeDriver driver1=new ChromeDriver();
		FirefoxDriver driver2=new FirefoxDriver();

	}

}
