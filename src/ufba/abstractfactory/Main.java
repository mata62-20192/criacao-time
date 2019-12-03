package ufba.abstractfactory;

import ufba.app.TipoDocumento;

public class Main {

	public static void main(String[] args) {
		CriadorDocumentacao.abstractCriaDocumentacao(TipoDocumento.HTML).criarCabecalho();
		CriadorDocumentacao.abstractCriaDocumentacao(TipoDocumento.MARKDOWN).criarRodape();
	}

}
