package gui;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;



public class MainMenu {

	
	public  MenuBar setMenuBar() {
		MenuBar m = new MenuBar();
		Menu cadastros = getMenu("Cadastros");
		Menu configuracoes = getMenu("Configurações");
		Menu testes = getMenu("Testes");
		
		MenuItem modelos = getMenuItem("Modelos");
		MenuItem webdriver = getMenuItem("Webdriver");
		MenuItem softcomshop = getMenuItem("Softcomshop");
		
		cadastros.getItems().add(modelos);
		configuracoes.getItems().add(webdriver);
		testes.getItems().add(softcomshop);
		m.getMenus().addAll(cadastros,configuracoes,testes);
		
		return m;
	}
	
	private Menu getMenu(String Menu) {
		Menu menu = new Menu(Menu);
		return menu;
	}
	
	private MenuItem getMenuItem(String MenuItem) {
	   MenuItem item = new MenuItem(MenuItem);
	   return item;
	}
	
	

	
}
