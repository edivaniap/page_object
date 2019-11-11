package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class IMDHomePage {

	private WebDriver driver;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Graduação")
	private WebElement graduacao;
	

	private String urlBase = "https://www.imd.ufrn.br/portal/";

	
	public IMDHomePage(WebDriver driver) {
		this.driver = driver;
		driver.get(urlBase);
		PageFactory.initElements(driver, this);
	}

	
	public void irGraduacao() {
		graduacao.click();
	}
	
	public boolean temNoTitulo(String titulo) {
		return driver.getTitle().contains(titulo) ? true : false;
	}
}
