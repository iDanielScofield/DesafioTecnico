package interactions;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;

public class DadosContatoPage extends BasePage {
	private String inputEmail = "//input[@id='email']";
	private String inputUser = "//input[@id='username']";
	private String inputPass = "//input[@id='password']";
	private String inputConfirmPass = "//input[@id='confirmpassword']";
	private String buttonSend = "//button[@id='sendemail']";
	private String alert = "//div[@class='sweet-alert showSweetAlert visible']";
	private String alertMessage = "//div[@class='sweet-alert showSweetAlert visible']//self::h2";

	public void preencherEmail(String email) {
		escrever(By.xpath(inputEmail), email);
	}
	
	public void preencherUsuario(String user) {
		escrever(By.xpath(inputUser), user);
	}
	
	public void preencherSenha(String pass) {
		escrever(By.xpath(inputPass), pass);
		escrever(By.xpath(inputConfirmPass), pass);
	}
	
	public void enviarEmail() { 
		clicar(By.xpath(buttonSend));
	}
	
	public void confirmacaoEnvio() {
		esperarElementoFicarVisivel(By.xpath(alert));
		Assert.assertEquals("Sending e-mail success!", obterTexto(By.xpath(alertMessage)));
		clicar(By.xpath("//button[@class='confirm']"));
	}
}
