public class Livro {
    Tipo  tipo; 
    Autor autor;
    Reservas Reservas;
    Titulo titulo;
    Subtitulo subtitulo;
    Saidadata  saida;
    Devolucao  devolucao;
    Quantidade qtd;

    private volatile static Livro instancia;  

    public Livro() {       
    }
    public Livro GetInstance(){
        if(instancia == null){
            instancia = new Livro();
        }

        return instancia;
    }


    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo Tipo) {
        this.tipo = Tipo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Reservas getReservas() {
        return Reservas;
    }

    public void setReservas(Reservas Reservas) {
        this.Reservas = Reservas;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public Subtitulo getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(Subtitulo subtitulo) {
        this.subtitulo = subtitulo;
    }   
}
