public class Musica {
    private String titulo;
    private int avaliacao;
    // nunca usar ç ou acentos

    Musica (String titulo) { // construtor
        this.titulo = titulo;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao; // set = extensao adiciona sozinho
    }

    public String getTitulo() {
        return titulo;
    }
}
