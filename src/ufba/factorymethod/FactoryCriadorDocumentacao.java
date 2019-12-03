package ufba.factorymethod;

import ufba.app.TipoDocumento;

public class FactoryCriadorDocumentacao {
	
	public CriadorDocumentacao getCriadorDocumentacao(TipoDocumento tipoDocumento) {	
		if(tipoDocumento == TipoDocumento.HTML)
			return new CriadorHTML();
		if(tipoDocumento == TipoDocumento.MARKDOWN)
			return new CriadorMarkdown();
	}
}
