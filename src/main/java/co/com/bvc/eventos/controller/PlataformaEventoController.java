package co.com.bvc.eventos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.bvc.eventos.dto.PlataformaDto;
import co.com.bvc.eventos.dto.PlataformaEventoDto;
import co.com.bvc.eventos.entity.PlataformaEvento;
import co.com.bvc.eventos.service.PlataformaEventoService;

@RestController
@RequestMapping("/evento")
public class PlataformaEventoController {

	@Autowired
	private PlataformaEventoService plataformaEventoService;

	@PostMapping
	public void createEvento(@RequestBody PlataformaEventoDto dto) {
		plataformaEventoService.createEventoByPlataforma(dto);
	}

	@GetMapping
	public List<PlataformaEvento> getEventos(@RequestBody PlataformaDto dto) {
		return plataformaEventoService.getEventosByPlataforma(dto);
	}
}
