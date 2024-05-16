package tests;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.ListagemVacina;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class ListVacina {
   private WebDriver driver;
   private ListagemVacina vacina;
   private LoginTest login;	
   private WebDriverWait wait;
	
	
   public ListVacina(WebDriver driver) {
	   this.driver = driver;
	   this.login = new LoginTest(driver);
       this.vacina = new ListagemVacina(driver);
       this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  
   }
   
   public void acessaLista() {
		    login.acessarLogin();
	        login.testaLogin();
	     
	        driver.get("https://stage-release-2.softcomshop.com.br/vacinas");
	        
     	}
	
	public void FiltraVacina() {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-pesquisa")));
		vacina.Filtrar("Teste12", "Vacina");
        
	} 
	
	
	
	
	
}
