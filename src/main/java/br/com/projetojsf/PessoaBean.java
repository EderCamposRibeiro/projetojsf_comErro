package br.com.projetojsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "pessoaBean")
public class PessoaBean implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String nome;
	
	private List<String> nomes = new ArrayList<String>();
	
	public String addNome() {
		nomes.add(nome);
		return "";
	}
	
	public List<String> getNomes() {
		return nomes;
	}



	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
