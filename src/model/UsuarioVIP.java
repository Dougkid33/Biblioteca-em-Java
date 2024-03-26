package model;

import interfaces.Emprestimo;

public class UsuarioVIP extends Usuario implements Emprestimo {

    public UsuarioVIP(String nome) {
        super(nome);
    }

    @Override
    public void verificarStatusEmprestimo() {
        System.out.println("Usuário VIP " + nome + " tem privilégios de empréstimo ilimitados.");
    }

  
    @Override
    public void emprestarLivro(Livro livro, Usuario usuario) {
        // Verifica se o livro já está emprestado
        if (livro.isEmprestado()) {
            System.out.println("O livro já está emprestado.");
            return;
        }
        // Empresta o livro sem verificar o limite
        livro.emprestar();
        usuario.getLivrosEmprestados().add(livro);
        System.out.println("Livro emprestado com sucesso a " + usuario.getNome() + ".");
    }


    @Override
    public void devolverLivro(Livro livro, Usuario usuario) {
        // Verifica se o livro está na lista de livros emprestados do usuário
        if (!usuario.getLivrosEmprestados().contains(livro)) {
            System.out.println("Este livro não foi emprestado por " + usuario.getNome() + ".");
            return;
        }
        // Devolve o livro
        livro.devolver();
        usuario.getLivrosEmprestados().remove(livro);
        System.out.println("Livro devolvido com sucesso por " + usuario.getNome() + ".");
    }

}

