package br.com.algaworks.cursojava;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@ViewScoped
public class CadastroUsuarioBean {

	private String login;
	private String nome;
	
	public void cadastrar() {

		if(this.nome == null || this.nome.isEmpty()) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastro não efetuado! Informe um nome"));
		}else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastro efetuado"));	
			System.out.println("Login: " + this.login);
			System.out.println("Nome: " + this.nome);
		}
		
	}
	
	public void verificarDisponibilidadeLogin() {		
		FacesMessage msg = null;		
		System.out.println("Verificando disponibilidade: " + this.login);
		if("joao".equalsIgnoreCase(this.login)) {
			msg = new FacesMessage("Login já em uso");
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Login já em uso", "Cadastre um outro usuário"));
		}else {
			msg = new FacesMessage("Login disponível");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
