package interactions;

import org.openqa.selenium.By;

import core.BasePage;

public class DadosSeguradoPage extends BasePage {
	private String inputFirstName = "//input[@id='firstname']";
	private String inputLastName = "//input[@id='lastname']";
	private String inputBirthDate = "//input[@id='birthdate']";
	private String selectCountry = "//select[@id='country']";
	private String inputZipCode = "//input[@id='zipcode']";
	private String selectOccupation = "//select[@id='occupation']";
	private String buttonNext = "//button[@id='nextenterproductdata']";

	public void preencherNome(String firstName) {
		escrever(By.xpath(inputFirstName), firstName);
	}

	public void preencherSobrenome(String lastName) {
		escrever(By.xpath(inputLastName), lastName);
	}

	public void preencherDataAniversario(String birthDate) {
		escrever(By.xpath(inputBirthDate), birthDate);
	}

	public void selecionarPais(String country) {
		selecionarComboBox(By.xpath(selectCountry), country);
	}

	public void preencherCodigoPostal(String zipCode) {
		escrever(By.xpath(inputZipCode), zipCode);
	}

	public void selecionarOcupacao(String occupation) {
		selecionarComboBox(By.xpath(selectOccupation), occupation);
	}

	public void selecionarHobbie(String hobbie) {
		clicar(By.xpath("//input[contains(@value,'" + hobbie + "')]//parent::label"));
	}

	public void clicarProximo() {
		clicar(By.xpath(buttonNext));
	}
}
