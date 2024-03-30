package academy.devdojo.springboot2.domain;

public class Anime {
    private String name;

    // Construtor
    public Anime(String name) {
        this.name = name;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
