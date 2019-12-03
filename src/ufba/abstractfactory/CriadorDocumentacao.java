package ufba.abstractfactory;

import java.util.Date;

import ufba.app.TipoDocumento;
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
	
	public static CriadorDocumentacao abstractCriaDocumentacao(TipoDocumento tipoDocumento) {
		if(tipoDocumento == TipoDocumento.HTML)
			return new CriadorHTML();
		if(tipoDocumento == TipoDocumento.MARKDOWN)
			return new CriadorMarkdown();
	}
	public abstract String criarCabecalho();
	public abstract String criarCorpo();
	public abstract String criarRodape();

}
