package br.edu.unievangelica.ftt.projeto.domain.carro;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;


import com.fasterxml.jackson.annotation.JsonIgnore;

import br.edu.unievangelica.ftt.projeto.core.entity.AbstractEntity;
import br.edu.unievangelica.ftt.projeto.domain.garagem.Garagem;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "carro")
@Getter @Setter
public class Carro extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	
	@NotEmpty @NotBlank
	@Column(name = "fabricante", length = 80, nullable = false)
	private String fabricante;
	
	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getVersao() {
		return versao;
	}


	public void setVersao(String versao) {
		this.versao = versao;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}


	public List<Garagem> getGaragem() {
		return garagem;
	}


	public void setGaragem(List<Garagem> garagem) {
		this.garagem = garagem;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@NotEmpty @NotBlank
	@Column(name = "modelo", length = 18, nullable = false, unique = true)
	private String modelo;
	
	@NotEmpty @NotBlank
	@Column(name = "versao", length = 18, nullable = false, unique = true)
	private String versao;
	
	@NotEmpty @NotBlank
	@Column(name = "descricao", length = 18, nullable = false, unique = true)
	private String descricao;
	
	@NotEmpty @NotBlank
	@Column(name = "cor", length = 18, nullable = false, unique = true)
	private String cor;
	
	@NotEmpty @NotBlank
	@Column(name = "valor", length = 18, nullable = false, unique = true)
	private String valor;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "carro")
	private List<Garagem> garagem;
	
}
