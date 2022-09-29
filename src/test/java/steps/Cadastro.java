package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cadastro {
    WebDriver driver = new ChromeDriver();
    String BTN_ZOOM = "M637";

    @Dado("^que estou no site da tinnovo$")
    public void que_estou_no_site_da_tinnovo() throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        driver.get("https://tinnova-teste-qa.vercel.app/");
    }

    @Quando("^clicar no botao adicionar$")
    public void clicar_no_botao_adicionar() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.className("xufcW")).click();
        driver.findElement(By.className("xufcW")).click();


    }

    @Quando("^preencho nome, e-mail, cpf e telefone$")
    public void preencho_nome_e_mail_cpf_e_telefone() throws Throwable {
        driver.findElement(By.className("jJJLOb")).sendKeys("Amaro Costa 7");
        driver.findElement(By.name("email")).sendKeys("Amaro@hotmail.com");
        driver.findElement(By.name("cpf")).sendKeys("11122233398");
        driver.findElement(By.name("phone")).sendKeys("81 999996666");

    }

    @Quando("^clico em guardar$")
    public void clico_em_guardar() throws Throwable {
        driver.findElement(By.className("xufcW")).click();

    }

    @Entao("^deve aparecer a lista com o cadastro$")
    public void deve_aparecer_a_lista_com_o_cadastro() throws Throwable {
        Assert.assertEquals(true, driver.findElement(By.id("root")).isDisplayed());

        driver.quit();

    }

    @Quando("^clicar no botao botao de acao$")
    public void clicar_no_botao_botao_de_acao() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.className("xufcW")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[5]/div[1]")).click();


    }


        @Entao("^deve aparecer a lista com o cadastroo$")
    public void deve_aparecer_a_lista_com_o_cadastroo() throws Throwable {
        Assert.assertEquals(true, driver.findElement(By.id("root")).isDisplayed());

        driver.quit();
    }

    @Quando("^clicar no botao botao de acao editar$")
    public void clicar_no_botao_botao_de_acao_editar() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.className("xufcW")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[5]/div[2]")).click();

    }


    @Entao("^deve aparecer a cadastro para editar$")
    public void deve_aparecer_a_cadastro_para_editar() throws Throwable {
        driver.findElement(By.className("xufcW")).click();

        driver.quit();


    }
    @Quando("^clicar no botao botao de acao deletar$")
    public void clicar_no_botao_botao_de_acao_deletar() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.className("xufcW")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[5]/div[3]")).click();


    }

    @Entao("^deve aparecer excluir o cadastro da lista$")
    public void deve_aparecer_excluir_o_cadastro_da_lista() throws Throwable {
        driver.findElement(By.className("swal-button swal-button--confirm swal-button--danger")).click();

        driver.quit();

    }

    @Quando("^preencho nome, e-mail, cpf e telefone com numero$")
    public void preencho_nome_e_mail_cpf_e_telefone_com_numero() throws Throwable {
        driver.findElement(By.className("jJJLOb")).sendKeys("9999999999999999999");
        driver.findElement(By.name("email")).sendKeys("9999999999999999999999");
        driver.findElement(By.name("cpf")).sendKeys("11122233398");
        driver.findElement(By.name("phone")).sendKeys("81 999996666");

    }

    }

