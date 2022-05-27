package interactions;

import org.openqa.selenium.By;

import core.BasePage;

public class DadosVeiculoPage extends BasePage {
	private String selectMake = "//select[@id='make']";
	private String selectModel = "//select[@id='model']";
	private String inputCylinderCapacity = "//input[@id='cylindercapacity']";
	private String inputEnginePerformance = "//input[@id='engineperformance']";
	private String inputDateManufacture = "//input[@id='dateofmanufacture']";
	private String selectNumberSeats = "//select[@id='numberofseats']";
	private String selectNumberSeatsMotorcycle = "//select[@id='numberofseatsmotorcycle']";
	private String selectFuel = "//select[@id='fuel']";
	private String inputPayload = "//input[@id='payload']";
	private String inputTotalWeight = "//input[@id='totalweight']";
	private String inputListPrice = "//input[@id='listprice']";
	private String inputAnnualMileage = "//input[@id='annualmileage']";
	private String buttonNext = "//button[@id='nextenterinsurantdata']";

	public void selecionarMake(String make) {
		selecionarComboBox(By.xpath(selectMake), make);
	}
	
	public void selecionarModel(String model) {
		selecionarComboBox(By.xpath(selectModel), model);
	}
	
	public void preencherCylinderCapacity(String cylinderCapacity) {
		escrever(By.xpath(inputCylinderCapacity), cylinderCapacity);
	}
	
	public void preencherEnginePerformance(String enginePerformance) {
		escrever(By.xpath(inputEnginePerformance), enginePerformance);
	}
	public void preencherDateManufacture(String dateManufacture) {
		escrever(By.xpath(inputDateManufacture), dateManufacture);
	}
	
	public void selecionarNumberSeats(String numberSeats) {
		selecionarComboBox(By.xpath(selectNumberSeats), numberSeats);
	}
	
	public void selecionarNumberSeatsMotorcycle(String numberSeats) {
		selecionarComboBox(By.xpath(selectNumberSeatsMotorcycle), numberSeats);
	}
	
	public void selecionarFuel(String fuel) {
		selecionarComboBox(By.xpath(selectFuel), fuel);
	}
	
	public void preencherPayload(String payload) {
		escrever(By.xpath(inputPayload), payload);
	}
	
	public void preencherTotalWeight(String totalWeight) {
		escrever(By.xpath(inputTotalWeight), totalWeight);
	}
	
	public void preencherListPrice(String listPrice) {
		escrever(By.xpath(inputListPrice), listPrice);
	}
	
	public void preencherAnnualMileage(String annualMileage) {
		escrever(By.xpath(inputAnnualMileage), annualMileage);
	}
	
	public void clicarProximo() {
		clicar(By.xpath(buttonNext));
	}
}
