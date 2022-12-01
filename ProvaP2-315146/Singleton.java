import java.util.Random;

public class Singleton {
    public static Singleton uniqueInstance;
    public boolean disponivel;
	public boolean emprestado;  
	public Singleton() {
            disponivel = true;
            emprestado = true;
	}
	public Livro checkAvailable() {
        if (!disponivel || !emprestado) {
		return null;
        } else {
		disponivel = false;
        return retirarLivro();
        }
    }        
	public Livro retirarLivro() {
            Tipo Tipo = new Tipo();
            Reservas Reservas = new Reservas();
            Autor autor = new Autor();
            Saidadata saida = new Saidadata();
            Devolucao devolucao = new Devolucao();
            String titulo = "Ladrao de raio";
            Livro livro = new Livro(titulo, Tipo, autor, Reservas,saida,devolucao);
            disponivel = true;
		
            return livro;
	}
	
	public void devolver() {
            if(emprestado) {
            	return;
            }else {}
		emprestado = true;
        }
	
	public static synchronized Singleton getInstance() {
            if (uniqueInstance == null) {
		uniqueInstance = new Singleton();
            }
                return uniqueInstance;
        }

    static class Livro {
        public char[] Titulo;
        private Livro(String Titulo, Tipo Tipo, Autor autor, Reservas Reservas,Saidadata saida, Devolucao devolucao) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
