package ada.project.firstWeek;

public sealed abstract class Postagem permits Elogio, Reclamacao{
    private String titulo;
    private String texto;
    private Integer curtida;

    public Postagem(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
        this.curtida = 0;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getCurtida() {
        return curtida;
    }

    public void upCurtida() {
        this.curtida ++;
    }
}