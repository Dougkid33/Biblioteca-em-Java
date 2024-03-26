package model;

import interfaces.Emprestimo;

public class UsuarioComum extends Usuario implements Emprestimo {

    public UsuarioComum(String nome) {
        super(nome);
    }

    @Override
    public void verificarStatusEmprestimo() {
        System.out.println("Usuário Comum " + nome + " pode emprestar até 5 livros.");
    }

  
    @Override
    public void emprestarLivro(Livro livro, Usuario usuario) {
        // Verifica se o livro já está emprestado
        if (livro.isEmprestado()) {
            System.out.println("O livro já está emprestado.");
            return;
        }
        // Verifica se o usuário já atingiu o limite de empréstimos
        if (usuario.getLivrosEmprestados().size() >= 5) {
            System.out.println("Usuário já atingiu o limite de empréstimos.");
            return;
        }
        // Empresta o livro
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

