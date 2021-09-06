package phoneObjects;

import static org.junit.Assert.assertEquals;
import static utils.PhoneMetodos.driver;

import org.openqa.selenium.support.PageFactory;


import java.util.List;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PhonePage {

	
	public PhonePage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Contacts tab.']")
	private MobileElement botaoMenu;
	
	@AndroidFindBy(id = "com.google.android.dialer:id/contact_name")
	private MobileElement  botaoAddCont;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='First name']")
	private MobileElement  botaoAddName;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Phone']")
	private MobileElement botaoAddPhone;
	
	@AndroidFindBy(id = "com.android.contacts:id/editor_menu_save_button")
	private MobileElement botaoSave;
	
	
	public void acessarMenuContato() {
		botaoMenu.click();
		
	}
	
	public void acionarBotaoAddContato() {
		botaoAddCont.click();
	}
	
	public void adicionarNome(String nomeUsuario) {
		botaoAddName.sendKeys(nomeUsuario);
	}
	
	public void adicionarPhone(String phoneUsuario) {
		botaoAddPhone.sendKeys(phoneUsuario);
	}
	
	public void botaoSave() {
		botaoSave.click();
	}

	public void validarInformacoes(List<String> dados) {
		
		MobileElement infos;
		
		for (String info : dados) {
			
			infos = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='"+info+"']"));
			System.out.println("Infos Tela" + infos.getText());
			assertEquals(info, infos.getText());
			
		}
		
	}
}

