package ufba.factorymethod;

import java.util.Date;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;
import ufba.elementos.html.CabecalhoHTML;
import ufba.elementos.html.CorpoHTML;
import ufba.elementos.html.RodapeHTML;
import ufba.elementos.markdown.CabecalhoMarkdown;
import ufba.elementos.markdown.CorpoMarkdown;
import ufba.elementos.markdown.RodapeMarkdown;

public abstract class CriadorDocumentacao {
		
	public abstract String geraDocumentacao();

}
