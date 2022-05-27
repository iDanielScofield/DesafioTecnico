package interactions;

import org.openqa.selenium.By;

import core.BasePage;

public class PrecoSeguroPage extends BasePage {
	private String buttonNext = "//button[@id='nextsendquote']";
	
	public void selecionarCotacaoSeguro(String price) {
		clicar(By.xpath("//input[contains(@value,'" + price + "')]//parent::label"));
	}

	public void clicarProximo() {
		clicar(By.xpath(buttonNext));
	}
}
