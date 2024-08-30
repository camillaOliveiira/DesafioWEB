package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.junit.jar;

public class AdvantegeShopStepsInclusao  {

    private String url = "https://advantageonlineshopping.com/#/";
    private String url1 = "https://advantageonlineshopping.com/#/search/";
    private String urlmice = "https://advantageonlineshopping.com/#/search/?viewAll=mice";
    private String urlescolha = "https://advantageonlineshopping.com/#/product/29?viewAll=mice"
    private String urlcarrinho = "https://advantageonlineshopping.com/#/shoppingCart"
    private String categoria = "";

    @Dado("que acesso o site Advantage {word}")
    public void queacessoositeAdvantage(String url) {
        this.url = url;
    }

    @Quando("busco por mice e pressiono Enter")
    public void buscopormiceepressionoEnter() {
        super.url1 = url1;
        super.urlmice = urlmice;
        GET();
    }

    @E("exibe uma lista de produtos relacionados com mice")
    public void exibeumalistadeprodutosrelacionadoscommice {
        Assert.assertEquals(mice);
        super.urlmice = urlmice;
    }

    @E("clico no produto mice escolhido")
    public void cliconoprodutomiceescolhido {
        Assert.assertEquals(mice);
        super.urlescolha = urlescolha;
    }

    @E("clico em ADD TO CART")
    public void cliconoprodutomiceescolhido {
        Assert.assertEquals(mice);
        WebElement clickable = driver.findElement(By.id("checkOutButton"));
        new Actions(driver)
        .checkOutButton(clickable)
        submit();
        super.urlescolha = urlescolha;
    }

    @Entao("exibe carrinho com o produto incluido")
    public void exibecarrinhocomoprodutoincluido {
        Assert.assertEquals(mice);
        super.urlcarrinho = urlcarrinho;
    }



}