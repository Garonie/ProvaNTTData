package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CriarContaPage;

public class BaterPontoSteps extends CriarContaPage {

	CriarContaPage cp = new CriarContaPage();

	@Dado("que loguei no apontamento de horas")
	public void que_loguei_no_apontamento_de_horas() {
				
	}

	@Dado("eu informar os apontamentos da manha:")
	public void eu_informar_os_apontamentos_da_manha(io.cucumber.datatable.DataTable dataTable) {
	}

	@Dado("eu informar os apontamentos da tarde:")
	public void eu_informar_os_apontamentos_da_tarde(io.cucumber.datatable.DataTable dataTable) {
	}

	@Dado("eu informar os apontamentos do intevarlo:")
	public void eu_informar_os_apontamentos_do_intevarlo(io.cucumber.datatable.DataTable dataTable) {
	}

	@Quando("eu clicar em Salvar")
	public void eu_clicar_em_Salvar() {
	}

	@Entao("o sistema devera inserir as horas trabalhadas")
	public void o_sistema_devera_inserir_as_horas_trabalhadas() {
	}
}
