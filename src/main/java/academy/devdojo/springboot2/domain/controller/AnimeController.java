package academy.devdojo.springboot2.domain.controller;

// Importações necessárias
import academy.devdojo.springboot2.domain.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Indica que esta classe é um controlador REST, permitindo que seus métodos manipulem requisições HTTP
@RestController
// Define o caminho base para todas as rotas neste controlador
@RequestMapping("anime")
public class AnimeController {
    // Mapeia para GET requests para "/anime/list". Retorna uma lista de Animes.
    @GetMapping(path = "list")
    public List<Anime> list() {
        // Retorna uma lista fixa de Animes como resposta
        return List.of(new Anime("DBZ"), new Anime("CDZ"));
    }
}
