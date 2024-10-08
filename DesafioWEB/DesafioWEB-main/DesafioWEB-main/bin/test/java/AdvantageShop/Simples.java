// 1 - Nome do Pacote
package AdvantageShop;

// 2 - Bibliotecas Importadas
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// 3 - Classe
public class Simples {
	// 3.1 - Atributos
	
	String url; 	  // Endereço do site-alvo
	WebDriver driver; // Objeto do Selenium WebDriver
	
	// 3.2 - Métodos ou Funções
	
	@Before // Antes do Teste
	public void iniciar() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
        
		url = "https://advantageonlineshopping.com/#/";
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize(); // Maximizar a janela do browser
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS); // Espera implícita de 30 segundos
	}
	
	@After // Depois do Teste
	public void finalizar() {
		driver.quit();
	}

}
