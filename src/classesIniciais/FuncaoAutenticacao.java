package classesIniciais;

import interfacesIniciais.PermitirAcesso;

public class FuncaoAutenticacao  {
	
	private PermitirAcesso permitirAcesso;

	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
	public boolean autenticarCursoJava() {
		
		return permitirAcesso.autenticar();
	}

}
