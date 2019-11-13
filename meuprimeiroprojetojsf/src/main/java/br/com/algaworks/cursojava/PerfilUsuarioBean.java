package br.com.algaworks.cursojava;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class PerfilUsuarioBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private String login;
	private String senha;
	private String senhaConfirmada;

	public PerfilUsuarioBean() {
	}

	public void atualizar() {

		if (senha != senhaConfirmada) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Senha diferente!", "Informe a senha novamente"));
		} else {
			System.out.println("Senha: " + this.senha);

			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
		}
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenhaConfirmada() {
		return senhaConfirmada;
	}

	public void setSenhaConfirmada(String senhaConfirmada) {
		this.senhaConfirmada = senhaConfirmada;
	}

}
