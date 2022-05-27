package interactions;

import core.BasePage;
import core.DriverFactory;

public class GatewayPage extends BasePage{
	private static String APP = "http://sampleapp.tricentis.com/101/app.php";

	public void acessarApp() {
		DriverFactory.getDriver().get(APP);
	}
}
