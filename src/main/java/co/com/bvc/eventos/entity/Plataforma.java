package co.com.bvc.eventos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Plataforma {

	@Id
	@Column(name = "id_plataforma")
	private String idPlataforma;

	private String descripcion;
}
