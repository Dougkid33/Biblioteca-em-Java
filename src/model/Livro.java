package model;

public class Livro {
    // Atributos privados para encapsulamento
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean emprestado;

    // Construtor para inicializar o objeto Livro com os dados necessários
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false; // Todos os livros são inicializados como não emprestados
    }

    // Métodos getters para acessar os dados do livro
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    // Método para emprestar o livro
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println(titulo + " foi emprestado com sucesso.");
        } else {
            System.out.println(titulo + " já está emprestado.");
        }
    }

    // Método para devolver o livro
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println(titulo + " foi devolvido com sucesso.");
        } else {
            System.out.println(titulo + " não estava emprestado.");
        }
    }

    // Método para exibir informações sobre o livro
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", emprestado=" + emprestado +
                '}';
    }
}
