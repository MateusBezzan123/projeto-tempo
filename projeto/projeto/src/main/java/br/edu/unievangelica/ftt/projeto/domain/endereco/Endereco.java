package br.edu.unievangelica.ftt.projeto.domain.endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.edu.unievangelica.ftt.projeto.core.entity.AbstractEntity;
import br.edu.unievangelica.ftt.projeto.domain.garagem.Garagem;
import br.edu.unievangelica.ftt.projeto.domain.pais.Pais;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "endereco")
@Getter @Setter
public class Endereco extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@NotEmpty
	@Column(name = "logradouro", length = 80, nullable = false)
	private String logradouro;
	
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Garagem getGaragem() {
		return garagem;
	}

	public void setGaragem(Garagem garagem) {
		this.garagem = garagem;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(name = "complemento", length = 30)
	private String complemento;
	
	@Column(name = "bairro", length = 30)
	private String bairro;
	
	@Column(name = "cidade", length = 80)
	private String cidade;
	
	@Column(name = "estado", length = 30)
	private String estado;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "pais_id", referencedColumnName = "id")
	private Pais pais;
	
	@JsonIgnore
	@OneToOne(mappedBy = "endereco")
	private Garagem garagem;
	
	
}
