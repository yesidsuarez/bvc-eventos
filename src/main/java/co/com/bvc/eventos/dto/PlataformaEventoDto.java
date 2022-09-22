package co.com.bvc.eventos.dto;

import co.com.bvc.eventos.entity.Evento;
import co.com.bvc.eventos.entity.Plataforma;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlataformaEventoDto {

	private Plataforma plataforma;
	private Evento evento;
	private Integer cantidad;
}
