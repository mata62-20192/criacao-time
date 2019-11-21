package ufba.abstractfactory;

import java.util.Date;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;
import ufba.elementos.markdown.CabecalhoMarkdown;
import ufba.elementos.markdown.CorpoMarkdown;
import ufba.elementos.markdown.RodapeMarkdown;

public class CriadorMarkdown extends CriadorDocumentacao{
	
	@Override
	public String criarCabecalho() {
		Cabecalho cabecalho = new CabecalhoMarkdown();
		cabecalho.setTitulo("Padrões de projeto");
		cabecalho.setEmpresa("Universidade Federal da Bahia");
		return cabecalho.getOutput();
	}

	@Override
	public String criarCorpo() {
		Corpo corpo = new CorpoMarkdown();
		corpo.setTexto("Aula de padroes de projeto na disciplina Engenharia de Software I.");
		return corpo.getOutput();
	}

	@Override
	public String criarRodape() {
		Rodape rodape = new RodapeMarkdown();
		rodape.setData(new Date());
		return rodape.getOutput();
	}

}
