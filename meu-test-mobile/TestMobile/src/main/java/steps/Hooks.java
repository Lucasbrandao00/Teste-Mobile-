package steps;

import static utils.PhoneMetodos.entrarApp;
import static utils.PhoneMetodos.driver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUp() throws Exception {
		entrarApp();
	}

	@After
	public void fecharApp(Scenario cenario) {
		utils.PhoneMetodos.gerarScreenShot(cenario);
		driver.quit();
	}
}
