package Program;

import Apps.NavegadorWeb;

public class Safari implements NavegadorWeb{

	@Override
	public String exibirPagina() {
		return null;
	}

	@Override
	public String novaAba() {
		System.out.println("Nova aba aberta!");
		return null;
	}

	@Override
	public String fecharAba() {
		System.out.println("Página fechada!");
		return null;
	}

	@Override
	public String atualizarPagina() {
		System.out.println("Página atualizada!");
		return null;
	}

}
