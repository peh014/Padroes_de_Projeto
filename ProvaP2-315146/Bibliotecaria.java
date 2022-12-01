public class Bibliotecaria {
        public static void main(String[] args) {
        Singleton LivroSingleton = Singleton.getInstance();        
        Singleton.Livro livro  = LivroSingleton.checkAvailable();        
        System.out.println(livro.Titulo);
    }   
}
