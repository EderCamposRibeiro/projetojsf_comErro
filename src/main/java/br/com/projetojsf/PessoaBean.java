package br.com.projetojsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

@SuppressWarnings("serial")
@ViewScoped
@ManagedBean(name = "pessoaBean")
public class PessoaBean implements Serializable{

	private String nome;
	
	private transient HtmlCommandButton commandButton ;
	
	private List<String> nomes = new ArrayList<String>();
	
	public String addNome()  {
		nomes.add(nome);
		
		if (nomes.size() > 3 ) {
			commandButton.setDisabled(true);
			return "paginanavegada?faces-redirect=true";
		}
		return ""; /*Retornando Null ou Vazio fica na mesma página -> outcome */
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

	public HtmlCommandButton getCommandButton() {
		return commandButton;
	}

	public void setCommandButton(HtmlCommandButton commandButton) {
		this.commandButton = commandButton;
	}
	
	

}
