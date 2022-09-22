package co.com.bvc.eventos.dto;

import org.modelmapper.ModelMapper;

import co.com.bvc.eventos.entity.Plataforma;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlataformaDto {

	private String idPlataforma;
	private String descripcion;

	public static PlataformaDto convertToDto(Plataforma plataforma) {

		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(plataforma, PlataformaDto.class);
	}

	public static Plataforma convertToEntity(PlataformaDto plataforma) {

		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(plataforma, Plataforma.class);
	}
}
