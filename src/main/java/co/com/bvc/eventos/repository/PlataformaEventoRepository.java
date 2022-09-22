package co.com.bvc.eventos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.bvc.eventos.entity.Plataforma;
import co.com.bvc.eventos.entity.PlataformaEvento;

public interface PlataformaEventoRepository extends JpaRepository<PlataformaEvento, String> {

	List<PlataformaEvento> findByPlataforma(Plataforma plataforma);
}
