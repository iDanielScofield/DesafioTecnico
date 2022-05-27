package steps;

import interactions.DadosContatoPage;
import interactions.DadosProdutoPage;
import interactions.DadosSeguradoPage;
import interactions.DadosVeiculoPage;
import interactions.GatewayPage;
import interactions.PrecoSeguroPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.cucumber.datatable.DataTable;

public class CotacaoSeguroSteps {
	GatewayPage gatewayPage = new GatewayPage();
	DadosVeiculoPage dadosVeiculoPage = new DadosVeiculoPage();
	DadosSeguradoPage dadosSeguradoPage = new DadosSeguradoPage();
	DadosProdutoPage dadosProdutoPage = new DadosProdutoPage();
	PrecoSeguroPage precoSeguroPage = new PrecoSeguroPage();
	DadosContatoPage dadosContatoPage = new DadosContatoPage();

    @Dado("que eu acesse a página de cotação de seguros")
    public void que_eu_acesse_a_página_de_cotação_de_seguros() {
    	gatewayPage.acessarApp();
    }
    
    @Quando("preencher os dados do veículo")
    public void preencher_os_dados_do_veículo(DataTable dataTable) {
    	dadosVeiculoPage.selecionarMake					(dataTable.cell(0, 1));
    	dadosVeiculoPage.selecionarModel				(dataTable.cell(1, 1));
    	dadosVeiculoPage.preencherCylinderCapacity		(dataTable.cell(2, 1));
    	dadosVeiculoPage.preencherEnginePerformance		(dataTable.cell(3, 1));
    	dadosVeiculoPage.preencherDateManufacture		(dataTable.cell(4, 1));
    	dadosVeiculoPage.selecionarNumberSeats			(dataTable.cell(5, 1));
    	dadosVeiculoPage.selecionarNumberSeatsMotorcycle(dataTable.cell(5, 1));
    	dadosVeiculoPage.selecionarFuel					(dataTable.cell(6, 1));
    	dadosVeiculoPage.preencherPayload				(dataTable.cell(7, 1));
    	dadosVeiculoPage.preencherTotalWeight			(dataTable.cell(8, 1));
    	dadosVeiculoPage.preencherListPrice				(dataTable.cell(9, 1));
    	dadosVeiculoPage.preencherAnnualMileage			(dataTable.cell(10, 1));
    	dadosVeiculoPage.clicarProximo();
    }

    @E("os dados do segurado")
    public void os_dados_do_segurado(DataTable dataTable) {
    	dadosSeguradoPage.preencherNome				(dataTable.cell(0, 1));
    	dadosSeguradoPage.preencherSobrenome		(dataTable.cell(1, 1));
    	dadosSeguradoPage.preencherDataAniversario	(dataTable.cell(2, 1));
    	dadosSeguradoPage.selecionarPais			(dataTable.cell(3, 1));
    	dadosSeguradoPage.preencherCodigoPostal		(dataTable.cell(4, 1));
    	dadosSeguradoPage.selecionarOcupacao		(dataTable.cell(5, 1));
    	dadosSeguradoPage.selecionarHobbie			(dataTable.cell(6, 1));
    	dadosSeguradoPage.clicarProximo();
    }
    @E("os dados do produto")
    public void os_dados_do_produto(DataTable dataTable) {
    	dadosProdutoPage.preencherDataInicio();
    	dadosProdutoPage.selecionarSomaSeguro		(dataTable.cell(0, 1));
    	dadosProdutoPage.selecionarAvaliacao		(dataTable.cell(1, 1));
    	dadosProdutoPage.selecionarDanos			(dataTable.cell(2, 1));
    	dadosProdutoPage.selecionarProdutosOpcionais(dataTable.cell(3, 1));
    	dadosProdutoPage.selecionarCarroCortesia	(dataTable.cell(4, 1));
    	dadosProdutoPage.clicarProximo();
    }

    @E("selecionar o preço")
    public void selecionar_o_preço(DataTable dataTable) {
    	precoSeguroPage.selecionarCotacaoSeguro(dataTable.cell(0, 1));
    	precoSeguroPage.clicarProximo();
    }

    @E("os dados de contato")
    public void os_dados_de_contato(DataTable dataTable) {
    	dadosContatoPage.preencherEmail		(dataTable.cell(0, 1));
    	dadosContatoPage.preencherUsuario	(dataTable.cell(1, 1));
    	dadosContatoPage.preencherSenha		(dataTable.cell(2, 1));
    	dadosContatoPage.enviarEmail();
    }

    @Então("será enviado o formulário para o e-mail informado")
    public void será_enviado_o_formulário_para_o_e_mail_informado() {
    	dadosContatoPage.confirmacaoEnvio();
    }
}
