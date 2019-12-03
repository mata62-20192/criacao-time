package ufba.factorymethod;

import ufba.app.TipoDocumento;

public class Main {

	public static void main(String[] args) {
		FactoryCriadorDocumentacao factory = new FactoryCriadorDocumentacao();
		factory.getCriadorDocumentacao(TipoDocumento.HTML);
		factory.getCriadorDocumentacao(TipoDocumento.MARKDOWN);
	}

}
