package br.com.algaworks.cursojava;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class PerfilUsuarioAreaBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nome;
	private String sobre;

	public PerfilUsuarioAreaBean() {
	}
	
	public void atualizar() {
		System.out.println("Sobre: " + this.sobre);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}

}
