package br.edu.unievangelica.ftt.projeto.domain.garagem;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


import br.edu.unievangelica.ftt.projeto.core.entity.AbstractEntity;
import br.edu.unievangelica.ftt.projeto.domain.carro.Carro;
import br.edu.unievangelica.ftt.projeto.domain.endereco.Endereco;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "garagem")
@Getter @Setter
public class Garagem extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@NotEmpty @NotBlank
	@Size(min = 3, max = 80)
	@Column(name = "nome", length = 80, nullable = false, unique = true)
	private String nome;
	
	
	@Valid
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id", referencedColumnName = "id")
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name = "carro_id", referencedColumnName = "id")
	private Carro carro;
}
