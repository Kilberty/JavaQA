package main;

import org.openqa.selenium.WebDriver;
import tests.ListVacina;
import tests.DriverManager;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = DriverManager.getDriver();
    	ListVacina vacina = new ListVacina(driver);
        vacina.acessaLista();
        vacina.FiltraVacina();
    }
}
