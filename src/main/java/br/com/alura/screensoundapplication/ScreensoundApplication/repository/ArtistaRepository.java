package br.com.alura.screensoundapplication.ScreensoundApplication.repository;

import br.com.alura.screensoundapplication.ScreensoundApplication.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {
    Optional<Artista> findByNomeContainingIgnoreCase(String nome);
}
