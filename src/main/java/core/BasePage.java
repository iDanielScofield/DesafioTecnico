package core;

import static core.DriverFactory.getDriver;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class BasePage {

	Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(10));

	public void escrever(By by, String text) {
		waitForLoad(getDriver());
		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(by)));

		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(text);
	}

	public void selecionarComboBox(By by, String valor) {
		waitForLoad(getDriver());
		Select comboBox = new Select(getDriver().findElement(by));
		wait.until(ExpectedConditions.elementToBeClickable(by));
		comboBox.selectByVisibleText(valor);
	}

	public void clicar(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();
	}

	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}

	private void waitForLoad(WebDriver driver) {
		new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(10)).until((ExpectedCondition<Boolean>) webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void esperarElementoFicarVisivel(By by) throws TimeoutException {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static String adicionarDias(String somaDia) {
		int dia = Integer.parseInt(somaDia);

		String data = LocalDate.now().plusDays(dia).format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		return data;
	}
}
