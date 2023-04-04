package br.com.alura.linguagens.api;

@Document(collection = "principaisLiguagens")
public class Linguagem {

    @Id
    private String id;
    private String title;
    private String image;
    private int ranking;

    public Linguagem


    public Linguagem(String title, String image, int ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }

    public String getTitle() {
        return this.title;
    }

    public String getImage() {
        return this.image;
    }

    public int getRanking() {
        return this.ranking;
    }
}
