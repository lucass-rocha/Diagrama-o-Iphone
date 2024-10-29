package Program;

import Apps.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico{

	public static void main(String[] args) {
		

	}

	@Override
	public String realizarLigacao() {
		System.out.println("Iniciando chamada! ");
		return null;
	}

	@Override
	public String atenderLigacao() {
		System.out.println("Ligação atendida! ");
		return null;
	}

	@Override
	public String iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz!");
		return null;
	}

}
