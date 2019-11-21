package ufba.factorymethod;

import java.util.Date;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;
import ufba.elementos.html.CabecalhoHTML;
import ufba.elementos.html.CorpoHTML;
import ufba.elementos.html.RodapeHTML;

public class CriadorHTML extends CriadorDocumentacao{
	
	@Override
	public String geraDocumentacao() {
		Cabecalho cabecalho;
		Corpo corpo;
		Rodape rodape;
		
		cabecalho = new CabecalhoHTML();
		cabecalho.setTitulo("Padrões de projeto");
		cabecalho.setEmpresa("Universidade Federal da Bahia");
		
		corpo = new CorpoHTML();
		corpo.setTexto("Aula de padroes de projeto na disciplina Engenharia de Software I.");
		
		rodape = new RodapeHTML();
		rodape.setData(new Date());
		
		return cabecalho.getOutput() + corpo.getOutput() + rodape.getOutput();
	}

}
