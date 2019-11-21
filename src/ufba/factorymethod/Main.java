package ufba.factorymethod;

public class Main {

	public static void main(String[] args) {
		CriadorDocumentacao criador = new CriadorHTML();
		System.out.println(criador.geraDocumentacao());
	}

}
