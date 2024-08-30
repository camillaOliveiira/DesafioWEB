package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.junit.jar;

public class AdvantegeShopStepsBusca  {

    private String url = "https://advantageonlineshopping.com/#/";
    private String url1 = "https://advantageonlineshopping.com/#/search/";
    private String urlmice = "https://advantageonlineshopping.com/#/search/?viewAll=mice";
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

    @Entao("exibe uma lista de produtos relacionados com mice")
    public void exibeumalistadeprodutosrelacionadoscommice {
        Assert.assertEquals(mice);
    }

}