package co.com.bvc.eventos.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.bvc.eventos.dto.PlataformaDto;
import co.com.bvc.eventos.dto.PlataformaEventoDto;
import co.com.bvc.eventos.entity.PlataformaEvento;
import co.com.bvc.eventos.repository.PlataformaEventoRepository;

@Service
public class PlataformaEventoService {

	@Autowired
	private PlataformaEventoRepository plataformaEventoRepository;

	public List<PlataformaEvento> getEventosByPlataforma(PlataformaDto plataforma) {
		return plataformaEventoRepository.findByPlataforma(PlataformaDto.convertToEntity(plataforma));
	}

	public void createEventoByPlataforma(PlataformaEventoDto plataformaEventoDto) {
		PlataformaEvento plataformaEvento = new PlataformaEvento();

		plataformaEvento.setCantidad(plataformaEventoDto.getCantidad());
		plataformaEvento
				.setCosto(plataformaEventoDto.getCantidad() * plataformaEventoDto.getEvento().getValorUnitario());
		plataformaEvento.setEvento(plataformaEventoDto.getEvento());
		plataformaEvento.setFecha(LocalDate.now());
		plataformaEvento.setPlataforma(plataformaEventoDto.getPlataforma());

		plataformaEventoRepository.save(plataformaEvento);

	}

}
