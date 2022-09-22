package co.com.bvc.eventos.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "plataforma_evento")
@Getter
@Setter
public class PlataformaEvento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	private LocalDate fecha;

	private Integer cantidad;

	private Double costo;

	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_plataforma", referencedColumnName = "id_plataforma")
	private Plataforma plataforma;

	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_evento", referencedColumnName = "id_evento")
	private Evento evento;

}
