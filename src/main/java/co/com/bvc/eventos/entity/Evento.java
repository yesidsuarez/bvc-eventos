package co.com.bvc.eventos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Evento {

	@Id
	@Column(name = "id_evento")
	private String idEvento;

	private String descripcion;

	@Column(name = "valor_unitario")
	private Double valorUnitario;
}
