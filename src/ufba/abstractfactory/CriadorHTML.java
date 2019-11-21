package ufba.abstractfactory;

import java.util.Date;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;
import ufba.elementos.html.CabecalhoHTML;
import ufba.elementos.html.CorpoHTML;
import ufba.elementos.html.RodapeHTML;

public class CriadorHTML extends CriadorDocumentacao{

	@Override
	public String criarCabecalho() {
		Cabecalho cabecalho = new CabecalhoHTML();
		cabecalho.setTitulo("Padrões de projeto");
		cabecalho.setEmpresa("Universidade Federal da Bahia");
		return cabecalho.getOutput();
	}

	@Override
	public String criarCorpo() {
		Corpo corpo = new CorpoHTML();
		corpo.setTexto("Aula de padroes de projeto na disciplina Engenharia de Software I.");
		return corpo.getOutput();
	}

	@Override
	public String criarRodape() {
		Rodape rodape = new RodapeHTML();
		rodape.setData(new Date());
		return rodape.getOutput();
	}

}
