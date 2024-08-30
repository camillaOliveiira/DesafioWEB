package AdvantageShop;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.Home;
import pages.Lista;
import pages.Produto;

public class BuscaProduto {
	
	// 3.1 - Atributos
	String url = "https://advantageonlineshopping.com/#/search/"; // Endereço da pesquisa do site-alvo
	WebDriver driver; // Objeto do Selenium WebDriver
	
	Home home;   	 // Objeto herdando a classe Home
	Lista lista; 	 // Objeto herdando a classe Lista
	Produto produto; // Objeto herdando a classe Produto
	
	// 3.2 - Métodos ou Funções
	@Before // Antes do Teste
	public void iniciar() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        
		url = "https://advantageonlineshopping.com/#/"; // Endereço
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		driver = new ChromeDriver(options); // Inicializa o ChromeDriver com opções do Chrome
		
		driver.manage().window().maximize(); // Maximizar a janela do browser
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS); // Espera implícita de 30 segundos
	
		home = new Home(driver);   	   // Instanciar a classe Home
		lista = new Lista(driver); 	   // Instanciar a classe Lista
		produto = new Produto(driver); // Instanciar a classe Produto
	}
	
	@After // Depois do Teste
	public void finalizar() {
		driver.quit();
	}

	@Dado("que acesso o site Advantage {word}")
	public void queacessoositeAdvantage(String url) {
		this.url = url;
		driver.get(url); // Abre o site
		System.out.println("Passo 1");
	}

	@Quando("busco por \"([^\"]*)\" e pressiono Enter$")
	public void buscopormiceepressionoEnter() {
		super.url1 = url1;
		home.buscarProdutoComEnter(produto); // Busca por mice e aperta enter
		System.out.println("Passo 2");
		GET();
	}

	@Entao("exibe uma lista de produtos relacionados com \"([^\"]*)\"$")
	public void exibeumalistadeprodutosrelacionadoscom mice {
		Assert.assertEquals(mice);
		assertEquals("RESULTADOS PARA \"" + produto.toUpperCase() + "\"", lista.lerCabecalhoResultado());
		System.out.println("Passo 3");

	}

	@Entao("^exibe uma lista de produtos relacionados com \"([^\"]*)\"$")
	public void exibe_uma_lista_de_produtos_relacionados_com(String produto) {
		assertEquals("RESULTADOS PARA \"" + produto.toUpperCase() + "\"", lista.lerCabecalhoResultado());
		System.out.println("Passo 3");
	}
	
}
