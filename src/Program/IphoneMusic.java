package Program;

import Apps.ReprodutorMusical;

public class IphoneMusic implements ReprodutorMusical{

	@Override
	public String tocarMusica() {
		System.out.println("Música iniciada!");
		return null;
	}

	@Override
	public String pausarMusica() {
		System.out.println("Música Pausada!");
		return null;
	}

	@Override
	public String selecionarMusica() {
		System.out.println("Música selecionada! ");
		return null;
	}

}
