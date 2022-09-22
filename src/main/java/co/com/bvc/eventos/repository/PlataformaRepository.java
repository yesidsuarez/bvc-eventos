package co.com.bvc.eventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.bvc.eventos.entity.Plataforma;

public interface PlataformaRepository extends JpaRepository<Plataforma, String> {

}
