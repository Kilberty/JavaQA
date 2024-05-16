package tests;


import org.openqa.selenium.WebDriver;
import pages.CadastroVacina;

public class VacinaTest {
   private WebDriver driver;
   private CadastroVacina cadastrar;
   
   
   
   
   public void AcessarVacina(){
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIlberty\\source\\repos\\TesteAutomatizado\\TesteAutomatizado\\Navegadores\\chromedriver.exe");
	        this.driver = DriverManager.getDriver();
	        driver.get("https://stage-release-2.softcomshop.com.br/vacinas");
	        this.cadastrar = new CadastroVacina(driver);
	
	}
	
	
	
	
	
	
}
