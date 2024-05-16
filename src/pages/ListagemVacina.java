package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ListagemVacina {
    
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	public ListagemVacina(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  
	}
	
	
    private WebElement getFiltros() {
    	return driver.findElement(By.id("btn-pesquisa"));
    }
	
	private WebElement getBusca() {
		return driver.findElement(By.id("btn-pesquisa-form"));
	}
	
	private WebElement getNomeVacina(){
		return driver.findElement(By.id("auto_vacina_id"));
	}
	
	private Select getGrupoVacina() {
		 WebElement grupoElement = driver.findElement(By.id("grupo"));
	     return new Select(grupoElement);
	}
	
	private WebElement getEditarVacina(String Nome) {
		String xpath = "//table//tbody//tr//td[2]//a";

		return driver.findElement(By.xpath(xpath));
	}
	
	
	private void setFiltro() {
		getFiltros().click();
	}

    private void setBusca() {
    	getBusca().click();
    } 

    private void setNomeVacina(String Nome) {
    	getNomeVacina().sendKeys(Nome);
    } 
    
    private void setGrupoVacina(String Grupo) {
    	getGrupoVacina().selectByVisibleText(Grupo);
    }
    
    private void editarVacina(String Nome) {
    	getEditarVacina(Nome).click();
    }
    
    
    public void Filtrar(String Nome, String Grupo) {
          setFiltro();
          wait.until(ExpectedConditions.elementToBeClickable(getBusca()));
          setNomeVacina(Nome);
          setGrupoVacina(Grupo);
          setBusca();
          wait.until(ExpectedConditions.elementToBeClickable(getEditarVacina("Nome")));
          editarVacina(Nome);
    }
    
}
