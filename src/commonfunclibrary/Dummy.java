package commonfunclibrary;

import org.openqa.selenium.WebDriver;


public class Dummy {

	static WebDriver driver1;
	public static void main(String[] args) throws Exception {
		driver1=FunctionLibrary.startBrowser();
		FunctionLibrary.openApplication(driver1);
		FunctionLibrary.waitForElement(driver1, "id", "username", "30");
		FunctionLibrary.typeAction(driver1, "id", "username", "admin");
		FunctionLibrary.waitForElement(driver1, "xpath", "//input[@id='password']", "30");
		FunctionLibrary.typeAction(driver1, "xpath", "//input[@id='password']", "master");
		FunctionLibrary.clickAction(driver1, "id", "btnsubmit");
		FunctionLibrary.closeBrowser(driver1);

	}

}
