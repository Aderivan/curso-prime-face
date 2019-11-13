package br.com.algaworks.cursojava;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class InversaoNomeBean implements Serializable {
	private static final long serialVersionUID = 1L;

	public String nome;
	public String nomeInvertido;
	public int quantidadeDePalavras;

	public void inverter() {
		this.nomeInvertido = "";
		this.quantidadeDePalavras = 0;
		
		if(this.nome != null && !this.nome.isEmpty()) {
			this.quantidadeDePalavras = 1;
		}
		
		for(int i = this.nome.length() - 1; i >= 0; i--) {
			char letra = this.nome.charAt(i);
			this.nomeInvertido += letra;
			
			if(letra == ' ') {
				this.quantidadeDePalavras++;
			}
		}
		
		System.out.println("Nome invertido: " + this.nomeInvertido);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeInvertido() {
		return nomeInvertido;
	}

	public void setNomeInvertido(String nomeInvertido) {
		this.nomeInvertido = nomeInvertido;
	}

	public int getQuantidadeDePalavras() {
		return quantidadeDePalavras;
	}

	public void setQuantidadeDePalavras(int quantidadeDePalavras) {
		this.quantidadeDePalavras = quantidadeDePalavras;
	}

}
