package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class CadastroVacina {

	private WebDriver driver;
	
	public CadastroVacina(WebDriver driver) {
		this.driver = driver;
	}
	
	private WebElement getDescricao() {
		return driver.findElement(By.id("descricao"));
	}
	
	private Select getGrupo() {
		 WebElement grupoElement = driver.findElement(By.id("grupo"));
	     return new Select(grupoElement);
	}
	
	private WebElement getAtivar() {
		return driver.findElement(By.cssSelector(".switchery"));
	}
   	
	private WebElement getAdicionar() {
		return driver.findElement(By.id("adicionar"));
	}
	
	
	public void setDescricao(String descricao) {
      getDescricao().sendKeys(descricao);	  
	}
	
	public void setGrupo() {
	  getGrupo().selectByIndex(0);	  
    }
	
	public void setAtivar() {
	  getAtivar().click();	  
	}
		
	public void setAdicionar() {
		getAdicionar().click();
	}
	
	
	
	public void Cadastrar(String Descricao) {
		setDescricao(Descricao);
		setGrupo();
		setAtivar();
		setAdicionar();
	}
	
	
	
	
	
	
	
}
