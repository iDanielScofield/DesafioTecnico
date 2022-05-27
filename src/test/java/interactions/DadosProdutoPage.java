package interactions;

import org.openqa.selenium.By;

import core.BasePage;

public class DadosProdutoPage extends BasePage {
	private String inputStartDate = "//input[@id='startdate']";
	private String selectInsuranceSum = "//select[@id='insurancesum']";
	private String selectMeritRating = "//select[@id='meritrating']";
	private String selectDamageInsurance = "//select[@id='damageinsurance']";
	private String selectCourtesyCar = "//select[@id='courtesycar']";
	private String buttonNext = "//button[@id='nextselectpriceoption']";

	public void preencherDataInicio() {
		String date = adicionarDias("32");

		escrever(By.xpath(inputStartDate), date);
	}

	public void selecionarSomaSeguro(String insuranceSum) {
		selecionarComboBox(By.xpath(selectInsuranceSum), insuranceSum);
	}

	public void selecionarAvaliacao(String meritRating) {
		selecionarComboBox(By.xpath(selectMeritRating), meritRating);
	}

	public void selecionarDanos(String damageInsurance) {
		selecionarComboBox(By.xpath(selectDamageInsurance), damageInsurance);
	}

	public void selecionarProdutosOpcionais(String optionalProduct) {
		optionalProduct = optionalProduct.replace(" ", "");
		clicar(By.xpath("//input[@id='" + optionalProduct + "']//parent::label"));
	}

	public void selecionarCarroCortesia(String courtesyCar) {
		selecionarComboBox(By.xpath(selectCourtesyCar), courtesyCar);
	}
	
	public void clicarProximo() {
		clicar(By.xpath(buttonNext));
	}
}
