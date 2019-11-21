package ufba.abstractfactory;

public class Main {

	public static void main(String[] args) {
		CriadorDocumentacao criador = new CriadorMarkdown();
		System.out.println(criador.criarCabecalho() + criador.criarCorpo() + criador.criarRodape());
	}

}
