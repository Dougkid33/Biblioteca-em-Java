package main;

import model.Livro;
import model.Usuario;
import model.UsuarioComum;
import model.UsuarioVIP;

public class Main {
    public static void main(String[] args) {
        // Criando alguns livros
        Livro livro1 = new Livro("Clean Code", "Robert C. Martin", 2008);
        Livro livro2 = new Livro("Effective Java", "Joshua Bloch", 2018);

        // Criando usuários
        UsuarioComum usuarioComum = new UsuarioComum("Alice");
        UsuarioVIP usuarioVIP = new UsuarioVIP("Bob");

        // Tentativa de empréstimo de livros
        System.out.println("Tentativa de empréstimo:");
        usuarioComum.emprestarLivro(livro1, usuarioComum); // Alice tenta emprestar Clean Code
        usuarioVIP.emprestarLivro(livro2, usuarioVIP); // Bob tenta emprestar Effective Java

        // Listando livros emprestados
        System.out.println("\nLivros emprestados por Alice:");
        usuarioComum.getLivrosEmprestados().forEach(livro -> System.out.println(livro.getTitulo()));

        System.out.println("\nLivros emprestados por Bob:");
        usuarioVIP.getLivrosEmprestados().forEach(livro -> System.out.println(livro.getTitulo()));

        // Tentativa de devolução de livros
        System.out.println("\nTentativa de devolução:");
        usuarioComum.devolverLivro(livro1, usuarioComum); // Alice tenta devolver Clean Code
        usuarioVIP.devolverLivro(livro2, usuarioVIP); // Bob tenta devolver Effective Java
    }
}

