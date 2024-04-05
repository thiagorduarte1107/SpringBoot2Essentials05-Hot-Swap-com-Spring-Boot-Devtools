package academy.devdojo.springboot2.domain.controller;

// Importações necessárias

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

// Indica que esta classe é um controlador REST, permitindo que seus métodos manipulem requisições HTTP
@RestController
// Define o caminho base para todas as rotas neste controlador
@RequestMapping("anime")
@Log4j2 // Cria automaticamente um logger estático para a classe, usando Log4j2, para facilitar o logging.
//@Autowired // Injeta automaticamente a dependência marcada neste campo.
// @AllArgsConstructor // Construtor gerado automaticamente com todos os argumentos para as final fields e @NonNull fields.
// @RequiredArgsConstructor // Construtor gerado automaticamente com todos os argumentos para final fields e @NonNull fields, mas não inicializa fields com valor default.
public class AnimeController {
    @GetMapping(path = "list")
    public List<Anime> list() {
        log.info(DateUtil.formatLocalDateTimeToDatebaseStyle(LocalDateTime.now()));
        return List.of(new Anime("DBZ"), new Anime("CDZ"));
    }

    @GetMapping(path = "list2")
    public List<Anime> list2() {
        log.info(DateUtil.formatLocalDateTimeToDatebaseStyle(LocalDateTime.now()));
        return List.of(new Anime("Xmen"), new Anime("Naruto"));
    }


}
